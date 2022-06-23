<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>

<style>
body {
	background-color: #f4f3efe8;
}

.logo {
	left: 10px;
	padding: 10px;
}

#navbar {
	background-color: rgb(242, 236, 226) !important;
}

a {
	text-decoration: none;
	color: rgba(7, 6, 3, 0.854);
}

a:hover {
	color: rgb(197, 179, 165)
}
</style>
</head>
<body>
	<!-- header導覽列 -->
	<nav id="navbar"
		class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
	<!-- navbar justify-content-center  -->
	<div class=" container-fluid">
		<img class="logo" th:src="@{/images/logo2.png}" height="40">

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
		</div>
	</div>
	</nav>

	<h3>Welcome ${user.membername}</h3>

	<h3>
		<a href="<c:url value="/secure/Login.jsp" />">登入</a>
	</h3>
	
	<h3>
		<a href="<c:url value="/secure/SignIn.jsp" />">註冊</a>
	</h3>
	
	<h3>
		<a href="<c:url value="/pages/MemberControl.controller?select" />">會員清單</a>
	</h3>
	
	<h3>
		<a
			href="<c:url value="/pages/MemberInformation.controller?bodyInformation&diet&sleeping&memberSport" />">會員資訊</a>
	</h3>
	
	<h3>
		<a href="<c:url value="/pages/Product.jsp" />">商品清單</a>
	</h3>
	
	<h3>
		<a href="<c:url value="/pages/OrdersServlet.controller?prodaction=Select"/>">訂單</a>
	</h3>
	
	<h3>
		<a href="<c:url value="/pages/SuppliesControl.jsp" />">供應商</a>
	</h3>

</body>
</html>