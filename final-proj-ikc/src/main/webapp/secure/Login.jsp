<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="../css/main.css" />

<title>Login</title>

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

<h3>Login</h3>

<form action="<c:url value="/secure/Login.controller" />" method="get">
<table>
	<tr>
		<td>帳號 : </td>
		<td><input type="text" name="useraccount" value="${param.useraccount}"></td>
		<td><span class="error">${errors.useraccount}</span></td>
	</tr>
	<tr>
		<td>密碼 : </td>
		<td><input type="text" name="userpassword" value="${param.userpassword}"></td>
		<td><span class="error">${errors.userpassword}</span></td>
	</tr>
	<tr>
		<td>　</td>
		<td align="right"><input type="submit" value="Login"></td>
	</tr>
</table>
</form>

</body>
</html>