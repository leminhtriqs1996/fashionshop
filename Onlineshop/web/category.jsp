<%@page import="java.util.ArrayList"%>
<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page import="dao.CategoryDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu dọc</title>
<link rel="stylesheet" href="css/category.css" />
</head>
<body>
	<%
		CategoryDAOImpl categoryDAO = new CategoryDAOImpl();
		List<Category> list = new ArrayList<Category>();
		list = categoryDAO.getList();
	%>
	<div class="container">
		<nav>
		<ul class="mcd-menu">
			<%
				for (Category c : list) {
					
			%>
			<li><a href="Category?ma_the_loai=<%=c.getID_CATEGORY()%>"> <i class="fa fa-home"><img
						src="images/<%=c.getID_CATEGORY() %>.png"></i>
					<strong><%=c.getNAME()%></strong> <small><%=c.getDESCRIPTION()%></small>
			</a></li>
			<%
				}
			%>
		</ul>
		</nav>
	</div>
</body>
</html>