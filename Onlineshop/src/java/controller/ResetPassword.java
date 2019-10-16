package controller1;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Customer;
import dao.UserDAO;
import dao.UserDAOImpl;
import javax.mail.Authenticator;

/**
 * Servlet implementation class ResetPassword
 */
public class ResetPassword extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDAOImpl userDAO = new UserDAOImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        String err = "";
        if (username.equals("")) {
            err += "Phải nhập đầy đủ thông tin!";
        } else {
            if (userDAO.checkUser(username) == false) {
                err += "Tên đăng nhập không tồn tại!";
            }
        }

        if (err.length() > 0) {
            request.setAttribute("err", err);
        }

        String url = "/resetpassword.jsp";
        try {
            if (err.length() == 0) {

                Customer u = userDAO.getUser(username);
//				Customer new_user = new Customer(u.getID_CUSTOMER(), username, "passwordreset", u.getDATEOFBIRTH(), u.getGENDER(), u.getEMAIL(), u.getPHONE(), u.getADDRESS());
                Customer new_user = new Customer(u.getID_CUSTOMER(), username, u.getDATEOFBIRTH(), u.getPHONE(), u.getEMAIL(), "passwordreset", u.getADDRESS(), u.getGENDER(),1);

                userDAO.updateUser(new_user);
                url = "/login.jsp";
                String mess = "Kiểm tra email để nhận mật khẩu mới!";
                request.setAttribute("mess", mess);

                //gửi mật khẩu mới qua email.
//				   final String username_mail = "webbanhang1212050@gmail.com";
//				   final String password = "matkhauwebbanhang";
                final String username_mail = "lehoa08121998@gmail.com";
                final String password = "Hoa08121998241199901634517232";
                String to = u.getEMAIL();
                String subject = "Reset Password";
                String text = "<i>Reset Password</i><br/>";
                text += "<p>User: <strong>";
                text += username;
                text += "</strong></p>";
                text += "<p>New password: <strong>passwordreset</strong></p>";
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");
                Session session_mail = Session.getInstance(props,
                        new Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username_mail, password);
                            }
                        });
                try {
                    Message message = new MimeMessage(session_mail);
                    message.setHeader("Content-Type", "text/plain; charset=UTF-8");
                    message.setFrom(new InternetAddress(username_mail));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(to));
                    message.setSubject(subject);
                    message.setContent(text, "text/html; charset=utf-8");
                    Transport.send(message);
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }

            } else {
                url = "resetpassword.jsp";

            }
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
           
            response.sendRedirect("resetpassword.jsp");
        }
    }

}
