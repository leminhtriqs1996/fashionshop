/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoryDAOImpl;
import dao.ProductDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Product;

/**
 *
 * @author tri
 */
public class StaffAddProductServlet extends HttpServlet {

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
            out.println("<title>Servlet StaffAddProductServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StaffAddProductServlet at " + request.getContextPath() + "</h1>");
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
        Product product = null;
        ProductDAOImpl p = new ProductDAOImpl();
        String image = "";
        String nameOfFile="";
        
            int productID = Integer.parseInt(request.getParameter("productID"));
            String name = request.getParameter("productName");
            String size = request.getParameter("productSize");
            String color = request.getParameter("productColor");
            String country = request.getParameter("productCountry");
            double price = Double.parseDouble(request.getParameter("productPrice"));
            int quantityRemaining = Integer.parseInt(request.getParameter("quantityRemaining"));
            
            String gender = request.getParameter("productGender");
            int commandQuantity = Integer.parseInt(request.getParameter("commandQuantity"));
            String fabric = request.getParameter("productFabric");
            
            int categoryId= Integer.parseInt(request.getParameter("categoryID"));
            
            String supplier = request.getParameter("productSupplier");
            String information = request.getParameter("productInformation");
            
            
            
            
            image = request.getParameter("file");
            Path sourceDirectory = Paths.get(image);
            nameOfFile = sourceDirectory.getFileName().toString();

            
            // create id product and id category && add into product table in database
            
            //create product and set attribute of product
            product = new Product();
            product.setID_PRODUCT(productID);
            product.setNAME(name);
            product.setSize(size);
            product.setColor(color);
            product.setCountry(country);
            product.setPRICE(price);
            product.setQuantity_remaining(quantityRemaining);
            product.setGender(gender);
            product.setIMAGE(nameOfFile);
            product.setKindOfFabric(fabric);
            product.setID_CATEGORY(categoryId);
            product.setSUPPLIER(supplier);
            product.setINFORMATION(information);
            product.setCommand_quantity(commandQuantity);
            
            
        p.addProduct(product);

        request.getRequestDispatcher("StaffManagement.jsp").forward(request, response);
    
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

