<%-- 
    Document   : Staff_View_Users
    Created on : Oct 6, 2019, 9:21:50 PM
    Author     : tri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/StaffHeader.jsp" %>
<jsp:useBean id="userDAO" class="dao.UserDAOImpl" scope="page" />
<!-- start body -->

        <title> Users </title>
        
<!-- start body -->
<%@ include file="/includes/StaffLeft.jsp" %>

<!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> List Users</h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">                
                
                    <div class="row">
                        <div class="col-md-12">

                            <!-- START DEFAULT DATATABLE -->
                            <div class="panel panel-default">
                                <div class="panel-heading">                                
                                    <h3 class="panel-title">List Users</h3>
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
                                                <th>ID Customer</th>
                                                <th>Name</th>
                                                <th>Phone Number</th>
                                                <th>Email</th>
                                                <th>Address</th>
                                                <th>Gender</th>
                                                <th> State </th>
                                                <th> Action </th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="user" items="${userDAO.listCustomer}" >
                                                <tr>
                                                    <td> ${user.ID_CUSTOMER} </td>
                                                    <td> ${user.NAME} </td> 
                                                    <td> ${user.PHONE} </td>
                                                    <td> ${user.EMAIL} </td>
                                                    <td> ${user.ADDRESS} </td>
                                                    <td> ${user.GENDER} </td>
                                                    
                                                    <td>
                                                        <c:if test="${user.STATE == 1}">
                                                            <span style="color: greenyellow"> Active </span>
                                                        </c:if>
                                                        <c:if test="${user.STATE == 0}">
                                                            <span style="color: red"> Deactive </span>
                                                        </c:if>
                                                    </td>
                                            
                                                    <td> 
                                                        <button type="button" class="btn btn-success active"> <a href="StaffUpdateUserServlet?CustomerID=${user.ID_CUSTOMER}" > Update </button> 
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
