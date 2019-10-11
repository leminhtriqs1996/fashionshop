<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
    <body>

        <div id="main">
            <div id="head">
                <img src="images/banner.jpg" width="1057px" height="200px" /> 
            </div>
            
            <div id="head-link">
                <div id='menungang'>
                    <ul>
                        <c:if test="${sessionScope.user != null}" >
                            <li class='last'><a href="index.jsp"><span> Home </span></a></li>
                            <li class='last'><a href="search_page.jsp"><span>Search</span></a></li>
                            <li class='last' style="float: right"><a href="LogoutServlet"><span >Logout</span></a></li>
                            <li class='last' style="float: right;"><a href="update_user.jsp"><span> Hello, ${sessionScope.user.NAME} </span></a></li>
                            
                            <c:if test="${sessionScope.cart != null}" >
                                <li class='last' style="float: right;">
                                    <a href="cart.jsp"><span> Cart <span style="color: red; background-color: yellow" > (${sessionScope.cart.size()})</span> </span></a>
                                </li>   
                            </c:if>
                            <c:if test="${sessionScope.cart == null}" >
                                <li class='last' style="float: right;">
                                        <a href="cart.jsp"><span> Cart </span></a>
                                </li>   
                            </c:if>
                             
                        </c:if>
                                
                        <c:if test="${sessionScope.user == null}" >
                            <li class='last'><a href="index.jsp"><span> Home </span></a></li>
                        <li class='last'><a href="search_page.jsp"><span>Search</span></a></li>
                        <li class='last' style="float: right;"><a href="register.jsp"><span> Registry </span></a></li>
                        <li class='last' style="float: right;"><a href="login.jsp"><span> Login </span></a></li>
                        <c:if test="${sessionScope.cart != null}" >
                        <li class='last' style="float: right;">
                            <a href="cart.jsp"><span> Cart <span style="color: red; background-color: yellow" > (${sessionScope.cart.size()})</span> </span></a>
                        </li>   
                        </c:if>
                        <c:if test="${sessionScope.cart == null}" >
                        <li class='last' style="float: right;">
                            <a href="cart.jsp"><span> Cart </span></a>
                        </li>   
                        </c:if>
                        </c:if>
                        
                                 
                    </ul>
                </div>
            </div>
            