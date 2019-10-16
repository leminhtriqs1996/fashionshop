<%-- 
    Document   : Staff_Edit_User
    Created on : Oct 14, 2019, 9:40:45 AM
    Author     : tri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/StaffHeader.jsp" %>
<!-- start body -->

        <title> Edit User </title>
        
<!-- start body -->
<%@ include file="/includes/StaffLeft.jsp" %>

<!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> Edit user </h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">
                
                    <div class="row">
                        <div class="col-md-12">
                            <form class="form-horizontal" method="POST" action="StaffUpdateUserServlet">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title"><strong>Edit</strong> User</h3>
                                    <ul class="panel-controls">
                                        <li><a href="#" class="panel-remove"><span class="fa fa-times"></span></a></li>
                                    </ul>
                                </div>
                                <div class="panel-body">
                                    <p> Hello, do whatever you want !!! </p>
                                </div>
                                <div class="panel-body">                                                                        
                                    
                                    <div class="row">
                                        
                                        <div class="col-md-6">
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Customer ID</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" readonly="" class="form-control" name="CustomerID" value="${user.ID_CUSTOMER}"/>
                                                    </div>            
                                                    <span class="help-block">Must be a number</span>
                                                </div>
                                            </div>
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Customer Name</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" eadonly="" class="form-control" name="CustomerName" value="${user.NAME}"/>
                                                    </div>            
                                                    <span class="help-block">Must be a string</span>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">State</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="state" value="${user.STATE}"/>
                                                    </div>            
                                                    <span class="help-block">Example : 1,0 </span>
                                                </div>
                                            </div>  
                                                    
                                        </div>
                                        
                                    </div>

                                </div>
                                <div class="panel-footer">
                                    <button class="btn btn-default">Clear Form</button>                                    
                                    <button class="btn btn-primary pull-right">Submit</button>
                                </div>
                            </div>
                            </form>
                            
                        </div>
                    </div>                    
                    
                </div>
                <!-- END PAGE CONTENT WRAPPER -->                                                
            </div>            
            <!-- END PAGE CONTENT -->
        </div>
        <!-- END PAGE CONTAINER -->   
            
            
  <!-- footer -->        
  <div id="footer"><jsp:include page="/includes/StaffFooter.jsp"></jsp:include></div>
