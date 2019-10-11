<%-- 
    Document   : Staff_View_New_Orders
    Created on : Oct 6, 2019, 6:05:57 PM
    Author     : tri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/StaffHeader.jsp" %>
<jsp:useBean id="history1" class="dao.HistoryDAOImpl" scope="page" />

<!-- start body -->

        <title> View New Orders </title>
        
<!-- start body -->
<%@ include file="/includes/StaffLeft.jsp" %>

<!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> List new orders from users needed to check</h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">                
                
                    <div class="row">
                        <div class="col-md-12">

                            <!-- START DEFAULT DATATABLE -->
                            <div class="panel panel-default">
                                <div class="panel-heading">                                
                                    <h3 class="panel-title">List New Order</h3>
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
                                                <th>ID Command</th>
                                                <th>ID Customer</th>
                                                <th>Date</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="co" items="${history1.listCommand}" >
                                                <tr>
                                                    <td>${co.ID_COMMAND}</td>
                                                    <td>${co.ID_USER}</td> 
                                                    <td>${co.BUY_DATE}</td> 
                                                    <td>
                                            <button type="button" class="btn btn-success"> <a href="StaffDeliveryServlet?codeCommand=${co.ID_COMMAND}"> Accept </a> </button>
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
