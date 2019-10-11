<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/includes/header.jsp" %>

<!-- start body -->
        <title>Giỏ hàng</title>
        <link rel="stylesheet" href="css/cart.css" />
        <link rel="stylesheet" href="css/main.css" />
        <link rel="stylesheet" href="css/bootstrap.min.css" />
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
                            class="product-details">Product</label> <label
                            class="product-price">Giá bán</label> <label
                            class="product-quantity">Số lượng</label><label
                            class="product-line-price">Tổng tiền</label>
                    </div>
                    <c:forEach var="cartElement" items="${sessionScope.cart}" >
                        <div class="product">
                        <div class="product-image">
                            <img
                                src="sanpham/${cartElement.p.IMAGE}">
                        </div>
                        <div class="product-details">
                            <div class="product-title">
                                ${cartElement.p.NAME}
                            </div>
                            <p class="product-description"></p>
                        </div>
                        <div class="product-price">
                            ${cartElement.p.PRICE} VNĐ
                        </div>
                        <div class="product-quantity cart_quantity_button">
                            <a class="cart_quantity_up" href="CartServlet?command=deleteCart&ma_san_pham=${cartElement.p.ID_PRODUCT}"> - </a>
                            <input class="cart_quantity_input" type="number" value="${cartElement.quantity}" disabled="disabled">
                            <a class="cart_quantity_up" href="CartServlet?command=addCart&ma_san_pham=${cartElement.p.ID_PRODUCT}"> + </a>
                        </div>
                        <div class="product-line-price" style="text-align: right">
                             ${cartElement.quantity} * ${cartElement.p.PRICE}   VNĐ

                            <a
                                href="CartServlet?command=removeCart&ma_san_pham=${cartElement.p.ID_PRODUCT}"><img style="margin-left: 10px"
                                                                                                                   src="images/delete.png"></a>
                        </div>

                    </div>
                    </c:forEach>
                    
                    <!--
                    <div class="totals">
                        <div class="totals-item">
                            <label>Tổng hóa đơn</label>
                            <div class="totals-value" id="cart-subtotal"> ?????
                                VNĐ
                            </div>
                        </div>
                    </div>
                    -->
                    
                    
                        <a class="checkout" href="ViewHistory" style="text-decoration: none;">Lịch sử</a>
                        <a class="checkout" href="ConfirmServlet?username=${sessionScope.user.NAME}" style="text-decoration: none;">Thanh
                        toán</a>
                    
                   
                     
                        
                    
                    
                </div>

            </div>
<!-- footer -->        
  <div id="footer"><jsp:include page="/includes/footer.jsp"></jsp:include></div>