<%-- 
    Document   : Staff_Dashboard
    Created on : Oct 6, 2019, 6:59:56 AM
    Author     : tri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/StaffHeader.jsp" %>
<jsp:useBean id="historyDAO" class="dao.HistoryDAOImpl" scope="page" />
<jsp:useBean id="userDAO" class="dao.UserDAOImpl" scope="page" />
<!-- start body -->

        <title> Dashboard </title>
        
<!-- start body -->
<%@ include file="/includes/StaffLeft.jsp" %>

<!-- Start the content  -->

 <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">
                    
                    <!-- START WIDGETS -->                    
                    <div class="row">
                        <div class="col-md-3">
                            
                            <!-- START WIDGET SLIDER -->
                            <div class="widget widget-default widget-carousel">
                                <div class="owl-carousel" id="owl-example">
                                    <div>                                    
                                        <div class="widget-title">Total Visitors</div>                                                                        
                                        <div class="widget-subtitle">07/10/2019 15:23</div>
                                        <div class="widget-int">3,548,123,123</div>
                                    </div>
                                    <div>                                    
                                        <div class="widget-title">Total</div>
                                        <div class="widget-subtitle">Sales</div>
                                        <div class="widget-int">1,695,123,212</div>
                                    </div>
                                    <div>                                    
                                        <div class="widget-title">Total</div>
                                        <div class="widget-subtitle">Incomes</div>
                                        <div class="widget-int">$2,200,200</div>
                                    </div>
                                </div>                            
                                <div class="widget-controls">                                
                                    <a href="#" class="widget-control-right widget-remove" data-toggle="tooltip" data-placement="top" title="Remove Widget"><span class="fa fa-times"></span></a>
                                </div>                             
                            </div>         
                            <!-- END WIDGET SLIDER -->
                            
                        </div>
                        <div class="col-md-3">
                            
                            <!-- START WIDGET MESSAGES -->
                            <div class="widget widget-default widget-item-icon" onclick="location.href='Staff_View_New_Orders.jsp';">
                                <div class="widget-item-left">
                                    <span class="fa fa-envelope"></span>
                                </div>                             
                                <div class="widget-data">
                                    <div class="widget-int num-count"> ${historyDAO.listCommand.size()}</div>
                                    <div class="widget-title">New orders</div>
                                    <div class="widget-subtitle">from customers</div>
                                </div>      
                                <div class="widget-controls">                                
                                    <a href="#" class="widget-control-right widget-remove" data-toggle="tooltip" data-placement="top" title="Remove Widget"><span class="fa fa-times"></span></a>
                                </div>
                            </div>                            
                            <!-- END WIDGET MESSAGES -->
                            
                        </div>
                        <div class="col-md-3">
                            
                            <!-- START WIDGET REGISTRED -->
                            <div class="widget widget-default widget-item-icon" onclick="location.href='Staff_View_Users.jsp';">
                                <div class="widget-item-left">
                                    <span class="fa fa-user"></span>
                                </div>
                                <div class="widget-data">
                                    <div class="widget-int num-count"> ${userDAO.id.size()}</div>
                                    <div class="widget-title">Registred users</div>
                                    <div class="widget-subtitle">On your website</div>
                                </div>
                                <div class="widget-controls">                                
                                    <a href="#" class="widget-control-right widget-remove" data-toggle="tooltip" data-placement="top" title="Remove Widget"><span class="fa fa-times"></span></a>
                                </div>                            
                            </div>                            
                            <!-- END WIDGET REGISTRED -->
                            
                        </div>
                        <div class="col-md-3">
                            
                            <!-- START WIDGET CLOCK -->
                            <div class="widget widget-info widget-padding-sm">
                                <div class="widget-big-int plugin-clock">00:00</div>                            
                                <div class="widget-subtitle plugin-date">Loading...</div>
                                <div class="widget-controls">                                
                                    <a href="#" class="widget-control-right widget-remove" data-toggle="tooltip" data-placement="left" title="Remove Widget"><span class="fa fa-times"></span></a>
                                </div>                            
                                <div class="widget-buttons widget-c3">
                                    <div class="col">
                                        <a href="#"><span class="fa fa-clock-o"></span></a>
                                    </div>
                                    <div class="col">
                                        <a href="#"><span class="fa fa-bell"></span></a>
                                    </div>
                                    <div class="col">
                                        <a href="#"><span class="fa fa-calendar"></span></a>
                                    </div>
                                </div>                            
                            </div>                        
                            <!-- END WIDGET CLOCK -->
                            
                        </div>
                    </div>
                    <!-- END WIDGETS -->                    
                    
                    <div class="col-md-12   ">
                        <div class="panel panel-default">
                                <div class="panel-body panel-body-map">
                                    <div class="mapouter"><div class="gmap_canvas"><iframe width="811" height="500" id="gmap_canvas" src="https://maps.google.com/maps?q=khu%20do%20thi%20xanh%20fpt&t=&z=11&ie=UTF8&iwloc=&output=embed" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"></iframe><a href="https://www.embedgooglemap.net/blog/elementor-pro-discount-code-review/">elementor discount code</a></div><style>.mapouter{position:relative;text-align:right;height:500px;width:811px;}.gmap_canvas {overflow:hidden;background:none!important;height:500px;width:811px;}</style></div>
                                </div>
                                <div class="panel-body">
                                    <h3><span class="fa fa-map-marker"></span> Shop Thoi Trang SE1301</h3>
                                    <p>Khu Do Thi FPT City, Da Nang, Viet Nam</p>
                                </div>
                            </div>

                        </div>
                            
                      
                    
                </div>
                <!-- END PAGE CONTENT WRAPPER -->       
            
            
            
  <!-- footer -->        
  <div id="footer"><jsp:include page="/includes/StaffFooter.jsp"></jsp:include></div>