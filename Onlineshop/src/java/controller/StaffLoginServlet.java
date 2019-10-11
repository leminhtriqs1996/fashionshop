/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.StaffDAOImpl;
import dao.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Staff;

/**
 *
 * @author FSC
 */
public class StaffLoginServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
	private StaffDAOImpl staffDAO = new StaffDAOImpl();


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServerlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServerlet1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staffname = request.getParameter("staffname");
        String password = request.getParameter("password");

        String err = "";
        if (staffname.equals("") || password.equals("")) {
            err += "Phải nhập đầy đủ thông tin!";
        } else {
            if (staffDAO.login(staffname, password) == false) {
                err += "Tên đăng nhập hoặc mật khẩu không chính xác!";
            }
        }

        if (err.length() > 0) {
            request.setAttribute("err", err);
        }

        String url = "/StaffLogin.jsp";
        try {
            if (err.length() == 0) {
                HttpSession session = request.getSession();
                Staff s = staffDAO.Stafflogin(staffname, password);
                if (s!= null) {
                    session.setAttribute("staff", s);
                    response.sendRedirect("Staff_Dashboard.jsp");
                } else {
                    session.setAttribute("err", "invalid user name or password");
                }
                
            } else {
                url = "/StaffLogin.jsp";
                RequestDispatcher rd = getServletContext()
                        .getRequestDispatcher(url);
                rd.forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/StaffLogin.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
