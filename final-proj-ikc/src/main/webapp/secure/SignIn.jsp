<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="../css/main.css" />

<title>SignIn</title>

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

	<h3>SignIn</h3>

	<form action="<c:url value="/secure/SignIn.controller" />" method="get">
		<table>
			<tr>
				<td>帳號 :</td>
				<td><input type="text" name="useraccount" value="${param.useraccount}"></td>
				<td><span class="error">${errors.useraccount}</span></td>
			</tr>
			<tr>
				<td>密碼 :</td>
				<td><input type="text" name="userpassword"
					value="${param.userpassword}"></td>
				<td><span class="error">${errors.userpassword}</span></td>
			</tr>
			<tr>
				<td>會員名稱 :</td>
				<td><input type="text" name="name" value="${param.name}"></td>
				<td><span class="error">${errors.name}</span></td>
			</tr>
			<tr>
				<td>生日 :</td>
				<td><input type="text" name="birthday"
					value="${param.birthday}"></td>
				<td><span class="error">${errors.birthday}</span></td>
			</tr>
			<tr>
				<td>地址 :</td>
				<td><input type="text" name="address" value="${param.address}"></td>
				<td><span class="error">${errors.address}</span></td>
			</tr>
			<tr>
				<td>電話 :</td>
				<td><input type="text" name="telephone"
					value="${param.telephone}"></td>
				<td><span class="error">${errors.telephone}</span></td>
			</tr>
			<tr>
				<td>手機 :</td>
				<td><input type="text" name="cellphone"
					value="${param.cellphone}"></td>
				<td><span class="error">${errors.cellphone}</span></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" value="${param.email}"></td>
				<td><span class="error">${errors.email}</span></td>
			</tr>
			<tr>
				<td>所在地區 :</td>
				<td><input type="text" name="area" value="${param.area}"></td>
				<td><span class="error">${errors.area}</span></td>
			</tr>
			<tr>
				<td>性别 :</td>
				<td><input type="text" name="gender" value="${param.gender}"></td>
				<td><span class="error">${errors.gender}</span></td>
			</tr>
			<tr>
				<td></td>
				<td align="right"><input type="submit" name="signin" value="Signin"></td>
			</tr>
		</table>
	</form>

	<h3><span class="error">${errors.action}</span></h3>

	<c:if test="${not empty insert}">
		<h3>Insert Members Table Success</h3>
		<table border="1">
			<tr>
				<td>會員名稱</td>
				<td>${insert.membername}</td>
			</tr>
			<tr>
				<td>生日</td>
				<td>${insert.birthday}</td>
			</tr>
			<tr>
				<td>地址</td>
				<td>${insert.address}</td>
			</tr>
			<tr>
				<td>電話</td>
				<td>${insert.telephone}</td>
			</tr>
			<tr>
				<td>手機</td>
				<td>${insert.cellphone}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${insert.email}</td>
			</tr>
			<tr>
				<td>所在地區</td>
				<td>${insert.area}</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>${insert.gender}</td>
			</tr>
		</table>
	</c:if>

</body>
</html>