<%-- 
    Document   : Staff_Product
    Created on : Oct 6, 2019, 6:44:21 PM
    Author     : tri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/StaffHeader.jsp" %>
<jsp:useBean id="productDAO" class="dao.ProductDAOImpl" scope="page" />
<!-- start body -->

        <title> Products </title>
        
<!-- start body -->
<%@ include file="/includes/StaffLeft.jsp" %>

<!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> List Product</h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">                
                
                    <div class="row">
                        <div class="col-md-12">

                            <!-- START DEFAULT DATATABLE -->
                            <div class="panel panel-default">
                                <div class="panel-heading">                                
                                    <h3 class="panel-title">List Product</h3>
                                    <ul class="panel-controls">
                                        <li><a href="#" class="panel-collapse"><span class="fa fa-angle-down"></span></a></li>
                                        <li><a href="#" class="panel-refresh"><span class="fa fa-refresh"></span></a></li>
                                        <li><a href="#" class="panel-remove"><span class="fa fa-times"></span></a></li>
                                    </ul>                                
                                </div>
                                <div class="panel-body">
                                    <table class="table datatable">
                                        <thead>
                                            <tr>
                                                <th>ID Product</th>
                                                <th>Name</th>
                                                <th>ID Category</th>
                                                <th>Image</th>
                                                <th>Price</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="p" items="${productDAO.list}" >
                                                <tr>
                                                    <td>${p.ID_PRODUCT}</td>
                                                    <td>${p.NAME}</td> 
                                                    <td>${p.ID_CATEGORY}</td> 
                                                    <td> <img src="sanpham/${p.IMAGE}" height="100" width="100" /></td>
                                                    <td>${p.PRICE}</td>
                                                    <td>
                                                        <div class="btn-group dropup">
                                                            <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false"> Click here to choose <span class="caret"></span></button>
                                                            <ul class="dropdown-menu" role="menu">
                                                                <li role="presentation" class="dropdown-header"> Choose 1 below </li>
                                                                <li><a href="StaffUpdateProductServlet?ma_san_pham=${p.ID_PRODUCT}"> Update</a></li>
                                                                <li><a href="StaffDeleteProductServlet?ma_san_pham=${p.ID_PRODUCT}""> Delete </a></li>                                               
                                                            </ul>
                                                        </div>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- END DEFAULT DATATABLE -->
                        </div>
                    </div>                                
                    
                </div>
                <!-- PAGE CONTENT WRAPPER -->                                
            </div>    
            <!-- END PAGE CONTENT -->
        </div>
        <!-- END PAGE CONTAINER -->       
            
            
  <!-- footer -->        
  <div id="footer"><jsp:include page="/includes/StaffFooter.jsp"></jsp:include></div>
