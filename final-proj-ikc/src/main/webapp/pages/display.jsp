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
</head>
<body>

<h3>Select Product Table Result : ${fn:length(select)} row(s) selected</h3>
<c:if test="${not empty select}">
<table>
	<thead>
	<tr>
		<th>ProductID</th>
		<th>ProductName</th>
		<th>SuppliesID</th>
		<th>ProductImg</th>
		<th>StandardCost</th>
		<th>ProductStock</th>
		<th>ProductDescribe</th>
		<th>ProductStatus</th>
	</tr>
	</thead>
	<tbody>
	
	<c:forEach var="row" items="${select}">
		<c:url value="/pages/product.jsp" var="path">
			<c:param name="productid" value="${row.productid}" />
			<c:param name="productname" value="${row.productname}" />
			<c:param name="suppliesid" value="${row.suppliesid}" />
			<c:param name="productImg" value="${row.productImg}" />
			<c:param name="standardcost" value="${row.standardcost}" />
			<c:param name="productstock" value="${row.productstock}" />
			<c:param name="productdescribe" value="${row.productdescribe}" />
			<c:param name="productstatus" value="${row.productstatus}" />
		
		</c:url>
	<tr>
		<td><a href="${path}">${row.productid}</a></td>
		<td>${row.productname}</td>
		<td>${row.suppliesid}</td>
		<td>${row.productImg}</td>
		<td>${row.standardcost}</td>
		<td>${row.productstock}</td>
		<td>${row.productdescribe}</td>
		<td>${row.productstatus}</td>
		
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</c:if>

<h3><a href="<c:url value="/pages/Product.jsp" />">Product Table</a></h3>

</body>
</html>