<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/table.css" />

<title>Display</title>

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

<h3>會員清單 : 目前共有${fn:length(memberSheet)}名會員</h3>
<c:if test="${not empty memberSheet}">
<table>
	<thead>
	<tr>
		<th>會員名稱</th>
		<th>生日</th>
		<th>地址</th>
		<th>電話</th>
		<th>手機</th>
		<th>EMail</th>
		<th>會員階級</th>
		<th>所在地區</th>
		<th>性别</th>
	</tr>
	</thead>
	<tbody>
	
	<c:forEach var="row" items="${memberSheet}">
		<c:url value="/pages/product.view" var="path">
			<c:param name="membername" value="${row.membername}" />
			<c:param name="birthday" value="${row.birthday}" />
			<c:param name="address" value="${row.address}" />
			<c:param name="telephone" value="${row.telephone}" />
			<c:param name="cellphone" value="${row.cellphone}" />
			<c:param name="email" value="${row.email}" />
			<c:param name="userlevel" value="${row.userlevel}" />
			<c:param name="area" value="${row.area}" />
			<c:param name="gender" value="${row.gender}" />
		</c:url>
	<tr>
		<td><a href="${path}">${row.membername}</a></td>
		<td>${row.birthday}</td>
		<td>${row.address}</td>
		<td>${row.telephone}</td>
		<td>${row.cellphone}</td>
		<td>${row.email}</td>
		<td>${row.userlevel}</td>
		<td>${row.area}</td>
		<td>${row.gender}</td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</c:if>

<h3><a href="<c:url value="/Index.jsp" />">Index Table</a></h3>

</body>
</html>