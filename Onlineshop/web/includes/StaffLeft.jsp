<%-- 
    Document   : StaffLeft
    Created on : Oct 6, 2019, 7:23:32 AM
    Author     : tri
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


</head>
    <body>
        <!-- START PAGE CONTAINER -->
        <div class="page-container">
            
            <!-- START PAGE SIDEBAR -->
            <div class="page-sidebar">
                <!-- START X-NAVIGATION -->
                <ul class="x-navigation">
                    <li class="xn-logo">
                        <a href="Staff_Dashboard.jsp">Admin</a>
                        <a href="#" class="x-navigation-control"></a>
                    </li>
                    <li class="xn-profile">
                        <a href="#" class="profile-mini">
                            <img src="assets/images/users/avatar.jpg" alt="John Doe"/>
                        </a>
                        <div class="profile">
                            <div class="profile-image">
                                <img src="assets/images/users/avatar.jpg" alt="John Doe"/>
                            </div>
                            <div class="profile-data">
                                <div class="profile-data-name"> ${sessionScope.staff.NAME} </div>
                                <div class="profile-data-title"> ${sessionScope.staff.EMAIL} </div>
                            </div>
                            <div class="profile-controls">
                                <a href="pages-profile.html" class="profile-control-left"><span class="fa fa-info"></span></a>
                                <a href="pages-messages.html" class="profile-control-right"><span class="fa fa-envelope"></span></a>
                            </div>
                        </div>                                                                        
                    </li>
                    <li class="xn-title">Navigation</li>
                    <li class>
                        <a href="Staff_Dashboard.jsp"><span class="fa fa-desktop"></span> <span class="xn-text">Dashboard</span></a>                        
                    </li>   
                    <li class>
                        <a href="Staff_View_Users.jsp"><span class="glyphicon glyphicon-user"></span> <span class="xn-text">Users</span></a>                        
                    </li>
                    <li class>
                        <a href="Staff_View_New_Orders.jsp"><span class="fa fa-edit"></span> <span class="xn-text">Order</span></a>                        
                    </li>  
                    <li class>
                        <a href="Staff_Product.jsp"><span class="fa fa-columns"></span> <span class="xn-text">Product</span></a>                        
                    </li>   
                    
                    
                </ul>
                <!-- END X-NAVIGATION -->
            </div>
            <!-- END PAGE SIDEBAR -->
            
            
            <!-- PAGE CONTENT -->
            <div class="page-content">
                
                <!-- START X-NAVIGATION VERTICAL -->
                <ul class="x-navigation x-navigation-horizontal x-navigation-panel">
                    <!-- TOGGLE NAVIGATION -->
                    <li class="xn-icon-button">
                        <a href="#" class="x-navigation-minimize"><span class="fa fa-dedent"></span></a>
                    </li>
                    <!-- END TOGGLE NAVIGATION -->
                    
                    <!-- SIGN OUT -->
                    <li class="xn-icon-button pull-right">
                        <a href="StaffLogoutServlet"  > 
                            <span class="fa fa-sign-out">
                            
                            </span> 
                        </a>  
                                           
                    </li> 
                    <!-- END SIGN OUT -->
                    
                    
                </ul>
                <!-- END X-NAVIGATION VERTICAL -->
