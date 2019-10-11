<%@page import="model.Command"%>
<%@page import="model.Command"%>
<%@page import="java.util.List"%>
<%@page import="dao.HistoryDAOImpl"%>
<%@page import="model.Customer"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="dao.ProductDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/includes/header.jsp" %>

<!-- start body -->
        <title> Lịch sử </title>
        <link rel="stylesheet" href="css/cart.css" />
        <link rel="stylesheet" href="css/main.css" />
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/menu.css" />
        <style type="text/css">
            #main {
                width: 1060px;
                padding: 0;
                margin-left: auto;
                margin-right: auto;
            }

            #head {
                height: 200px;
                background-color: #F5F5F5;
                border: 1px solid #CDCDCD;
                margin-bottom: 5px;
                margin-top: 5px;
            }

            #head-link {
                height: 50px;
                line-height: 30px;
                border: 1px solid #CDCDCD;
                background-color: #F5F5F5;
                margin-bottom: 5px;
                clear: both;
            }

            #content {
                width: 1060px;
                min-height: 430px;
                border: 1px solid #CDCDCD;
                float: left;
                margin-bottom: 5px;
                clear: both;
            }

            #footer {
                height: 50px;
                clear: both;
                border: 1px solid #CDCDCD;
                background-color: #F8F8FF;
                margin-bottom: 5px;
            }
        </style>
       <!-- start body -->
<%@ include file="/includes/column_left_home.jsp" %>

<!-- Start the content  -->
        
            <div id="content">
                <div class="shopping-cart">

                    <div class="column-labels">
                        <label class="product-image">Hình ảnh</label> <label
                            class="product-details">Sản phẩm</label> <label
                            class="product-price">Ngày mua</label> <label
                            class="product-quantity">Số lượng</label><label
                            class="product-line-price">Đã thanh toán</label>
                    </div>
                    <%
                        ProductDAOImpl productDAO = new ProductDAOImpl();
        
        Customer c = (Customer) session.getAttribute("user");
        
        HistoryDAOImpl hDao = new HistoryDAOImpl();
        List<Command> list = hDao.getList(c.getID_CUSTOMER());
        
                        NumberFormat nf = NumberFormat.getInstance();
                        nf.setMinimumIntegerDigits(0);

                    %>
                    
                    <% for (Command h : list) {
                        %>
                    
                        <div class="product">
                        <div class="product-image">
                            <img src="sanpham/<%=productDAO.getProduct(h.getID_PRODUCT()).getIMAGE() %>" >
                        </div>
                        <div class="product-details">
                            <div class="product-title">
                                <%= productDAO.getProduct(h.getID_PRODUCT()).getNAME()%>
                            </div>
                            <p class="product-description"></p>
                        </div>
                        <div class="product-price"> <%= productDAO.getProduct(h.getID_PRODUCT()).getPRICE() %>
                        </div>
                        <div class="product-quantity cart_quantity_button">
                            <%= h.getQUANTITY() %>
                        </div>
                        <div class="product-line-price" style="text-align: right"><%=nf.format( productDAO.getProduct(h.getID_PRODUCT()).getPRICE()* h.getQUANTITY())%>
                            VNĐ


                        </div>

                    </div>
                            
                            <% } %>
                    


                </div>

            </div>
<!-- footer -->        
  <div id="footer"><jsp:include page="/includes/footer.jsp"></jsp:include></div>