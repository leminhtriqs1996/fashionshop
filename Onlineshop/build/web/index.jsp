<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<jsp:useBean id="productDAO" class="dao.ProductDAOImpl" scope="page" />
<%@ include file="/includes/header.jsp" %>

<!-- start body -->

        <title> Trang chủ </title>
        
<!-- start body -->
<%@ include file="/includes/column_left_home.jsp" %>

<!-- Start the content  -->
    
            <div id="content">
                <div id="left"><jsp:include page="category.jsp"></jsp:include></div>
                
                    <div id="right">
                    <div id="site-wrapper" style="float: left">
                        <ul class="products homepage">
                        <c:if test="${listProductByCategory == null}">
                            <c:forEach var="p" items="${productDAO.list}" >
                                <li class="preorder">
                                    <span class="tagimg "></span> 
                                    <a href="ViewDetail?ma_san_pham=${p.ID_PRODUCT}"> 
                                        <img src="sanpham/${p.IMAGE}"  />

                                    <h3>${p.NAME}</h3>
                                    <h4>
                                        Giá:
                                        ${p.PRICE}
                                        VNĐ
                                    </h4> <span class="textkm">Khuyến mãi trị giá đến <strong>500.000₫</strong>
                                    </span>
                                    <p class="info">
                                        <span>Hãng sx: ${p.SUPPLIER}</span> <span>Giá:
                                            ${p.PRICE} VNĐ</span> <span>Thông tin: ${p.INFORMATION}%>
                                    </p>
                                </a>

                            </li>
                            </c:forEach>
                        </c:if>
                            <c:if test="${listProductByCategory != null}">
                            <c:forEach var="p" items="${listProductByCategory}" >
                                <li class="preorder">
                                    <span class="tagimg "></span> 
                                    <a href="ViewDetail?ma_san_pham=${p.ID_PRODUCT}"> 
                                        <img src="sanpham/${p.IMAGE}"  />

                                    <h3>${p.NAME}</h3>
                                    <h4>
                                        Giá:
                                        ${p.PRICE}
                                        VNĐ
                                    </h4> <span class="textkm">Khuyến mãi trị giá đến <strong>500.000₫</strong>
                                    </span>
                                    <p class="info">
                                        <span>Hãng sx: ${p.SUPPLIER}</span> <span>Giá:
                                            ${p.PRICE} VNĐ</span> <span>Thông tin: ${p.INFORMATION}%>
                                    </p>
                                </a>

                            </li>
                            </c:forEach>
                        </c:if>
                            
                           
                        </ul>
                    </div>
                </div>

            </div>
            
            
            
  <!-- footer -->        
  <div id="footer"><jsp:include page="/includes/footer.jsp"></jsp:include></div>
