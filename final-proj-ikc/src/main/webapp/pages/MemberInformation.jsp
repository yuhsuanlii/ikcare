<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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

	<c:if test="${not empty bodyInformation}">
		<table>
			<thead>
				<tr>
					<th>身高</th>
					<th>體重</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="row" items="${bodyInformation}">
					<c:url value="/pages/product.view" var="path">
						<c:param name="area" value="${row.memberheight}" />
						<c:param name="gender" value="${row.memberweight}" />
					</c:url>
					<tr>
						<td>${row.memberheight}</td>
						<td>${row.memberweight}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</c:if>

	<c:if test="${not empty diet}">
		<table>
			<thead>
				<tr>
					<th>飲食日期</th>
					<th>區間</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="row" items="${diet}">
					<c:url value="/pages/product.view" var="path">
						<c:param name="birthday" value="${row.dietdate}" />
						<c:param name="address" value="${row.diettime}" />
					</c:url>
					<tr>
						<td>${row.dietdate}</td>
						<td>${row.diettime}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</c:if>

	<c:if test="${not empty sleeping}">
		<table>
			<thead>
				<tr>
					<th>睡眠日期</th>
					<th>睡眠型態</th>
					<th>睡眠時數</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="row" items="${sleeping}">
					<c:url value="/pages/product.view" var="path">
						<c:param name="userlevel" value="${row.sleepingdate}" />
						<c:param name="area" value="${row.sleetimeid}" />
						<c:param name="gender" value="${row.sleepinghour}" />
					</c:url>
					<tr>
						<td>${row.sleepingdate}</td>
						<td>${row.sleetimeid}</td>
						<td>${row.sleepinghour}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</c:if>

	<c:if test="${not empty memberSport}">
		<table>
			<thead>
				<tr>
					<th>運動日期</th>
					<th>運動型態</th>
					<th>運動時數</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="row" items="${memberSport}">
					<c:url value="/pages/product.view" var="path">
						<c:param name="membername" value="${row.sprotdate}" />
						<c:param name="birthday" value="${row.sportclass}" />
						<c:param name="address" value="${row.sporthour}" />
					</c:url>
					<tr>
						<td>${row.sprotdate}</td>
						<td>${row.sportclass}</td>
						<td>${row.sporthour}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</c:if>

	<h3>
		<a href="<c:url value="/pages/MemberControl.controller?select" />">MemberControl
			Table</a>
	</h3>

</body>
</html>