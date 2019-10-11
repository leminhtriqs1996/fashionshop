<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProductDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/includes/header.jsp" %>

<!-- start body -->

        <title> Tìm Kiếm </title>
        
<!-- start body -->
<%@ include file="/includes/column_left_home.jsp" %>

<!-- Start the content  -->

	
		<div id="content">
			<div id="left"><jsp:include page="search_menu.jsp"></jsp:include></div>
			<div id="right">
				<%
				
					ProductDAOImpl productDAO = new ProductDAOImpl();
						List<Product> list = new ArrayList<Product>();
						list = productDAO.getList();
						String ten_san_pham = "";
						String ten_the_loai = "";
						if (request.getParameter("ten_the_loai") != null && request.getParameter("ten_san_pham")!= null) {
					ten_the_loai = request.getParameter("ten_the_loai");
					ten_san_pham = request.getParameter("ten_san_pham");
						}
						NumberFormat nf = NumberFormat.getInstance();
						nf.setMinimumFractionDigits(0);
				%>
				<% String err = "";
				if (request.getAttribute("err") != null) {
					err = (String) request.getAttribute("err");%>
					<h3><%=err %></h3>
				<% } %>
				
				<%if(productDAO.searchList(ten_san_pham, ten_the_loai).size()==0 && err=="") {%>
					<h3>Không tìm thấy sản phẩm nào phù hợp</h3>
					<%} %>
				<div id="site-wrapper" style="float: left">
					<ul class="products homepage">
					
						<%
							if (ten_the_loai != null || ten_san_pham != null) {
									for (Product p : productDAO.searchList(ten_san_pham, ten_the_loai)) {
						%>

						<li class="preorder"><span class="tagimg "> </span> <a
							href="detail.jsp?ma_san_pham=<%=p.getID_PRODUCT()%>"> <img
								src="sanpham/<%=p.getIMAGE()%>" width=" 250px" height="250px" />
								<h3><%=p.getNAME()%></h3>
								<h4>
									Giá:
									<%=nf.format(p.getPRICE())%>
									VNĐ
								</h4> <span class="textkm">Khuyến mãi trị giá đến <strong>500.000₫</strong>
							</span>
								<p class="info">
									<span>Hãng sx: <%=p.getSUPPLIER()%>
									</span> <span>Giá: <%=nf.format(p.getPRICE())%> VNĐ
									</span> <span>Thông tin: <%=p.getINFORMATION()%>
								</p>
						</a></li>

						<%
							}
								} else {%>
									<h3> Nhập thông tin tìm kiếm </h3>
								<%}
						%>
					</ul>
				</div>
			</div>
		</div>
 <!-- footer -->        
  <div id="footer"><jsp:include page="/includes/footer.jsp"></jsp:include></div>