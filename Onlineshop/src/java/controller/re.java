package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cart;
import model.Customer;
import dao.UserDAOImpl;

/**
 * Servlet implementation class RegisterServlet
 */
public class re extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAOImpl userDAO = new UserDAOImpl();
	private List<Cart> cart = new ArrayList<Cart>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public re() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
                UserDAOImpl userDao=new UserDAOImpl();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
                java.sql.Date ngaysinh=null;
		
		try {
			ngaysinh = new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("ngaysinh")).getTime()));
              
                    
                    
                } catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String gioitinh = request.getParameter("gioitinh");
		String email = request.getParameter("email");
		String sdt = request.getParameter("sdt");
		String diachi = request.getParameter("diachi");
		System.out.println(username);

		String err = "";
		String url = "/register.jsp";

		if (username.equals("") || password.equals("") || email.equals("") || diachi.equals("") || sdt.equals("")) {
			err += "Phải nhập đầy đủ thông tin!";
		} else {
			if (userDAO.checkUser(username) == true) {
				err += "Tài khoản đã tồn tại!";
			} else {
				Pattern pattenObj = Pattern
						.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
								+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher matcherObj = pattenObj.matcher(email);
				if (!matcherObj.matches()) {
					err += "Email sai định dạng!";
				}
			}
		}

		if (err.length() > 0) {
			request.setAttribute("err", err);
		}

		try {
			if (err.length() == 0) {
				HttpSession session = request.getSession();
				session.setAttribute("cart", cart);
                                
				userDAO.addUser(new Customer(userDao.genarateId(0, 10000), username, ngaysinh, sdt, email, password, diachi, gioitinh));
				Customer c = userDAO.Userlogin(username, password);
                                
                                session.setAttribute("user", c);
                                RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
				
			} else {
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher(url);
				rd.forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("/index.jsp");
		}

	}

}
