<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="../css/main.css" />

<title>Product</title>
<script type="text/javascript">
function clearForm() {
	var inputs = document.getElementsByTagName("input");
	for(var i=0; i<inputs.length; i++) {
		if(inputs[i].type=="text") {
			inputs[i].value="";
		}
	}
}

</script>
</head>
<body>



<h3>Product Table</h3>
<form action="<c:url value="/pages/Product.controller" />" method="get">
<table>
	
	<tr>
		<td>ProductName : </td>
		<td><input type="text" name="productname" value="${param.productname}"></td>
		<td></td>
	</tr>
	<tr>
		<td>ProductImg : </td>
		<td><input type="button" name="productImg" onclick="" value="${param.productImg}"></td>
		<td><span class="error">${errors.productImg}</span></td>
	</tr>
	<tr>
		<td>StandardCost : </td>
		<td><input type="text" name="standardcost" value="${param.standardcost}"></td>
		<td><span class="error">${errors.standardcost}</span></td>
	</tr>
	<tr>
		<td>ProductStock : </td>
		<td><input type="text" name="productstock" value="${param.productstock}"></td>
		<td><span class="error">${errors.productstock}</span></td>
	</tr>
	<tr>
		<td>ProductDescribe : </td>
		<td><input type="text" name="productdescribe" value="${param.productdescribe}"></td>
		<td><span class="error">${errors.productdescribe}</span></td>
	</tr>
	<tr>
		<td>ProductStatus : </td>
		<td><input type="text" name="productstatus" value="${param.productstatus}"></td>
		<td><span class="error">${errors.productstatus}</span></td>
	</tr>
	<tr>
		<td>
			<input type="submit" name="prodaction" value="Insert" >
			<input type="submit" name="prodaction" value="Update" >
		</td>
		<td>
			<input type="submit" name="prodaction" value="Delete" >
			<input type="submit" name="prodaction" value="Select" >
			<input type="button" value="Clear" onclick="clearForm()">
		</td>
	</tr>
</table>

</form>

<h3><span class="error">${errors.action}</span></h3>

<c:if test="${not empty delete}">
<h3>Delete Product Table Success : ${delete} row deleted</h3>
<script type="text/javascript">clearForm();</script>
</c:if>

<c:if test="${not empty insert}">
<h3>Insert Product Table Success</h3>
<table border="1">
	<tr><td>ProductID</td><td>${insert.productid}</td></tr>
	<tr><td>ProductName</td><td>${insert.productname}</td></tr>
	<tr><td>SuppliesID</td><td>${insert.suppliesid}</td></tr>
	<tr><td>ProductImg</td><td>${insert.productImg}</td></tr>
	<tr><td>StandardCost</td><td>${insert.standardcost}</td></tr>
	<tr><td>ProductStock</td><td>${insert.productstock}</td></tr>
	<tr><td>ProductDescribe</td><td>${insert.productdescribe}</td></tr>
	<tr><td>ProductStatus</td><td>${insert.productstatus}</td></tr>
</table>
<script type="text/javascript">clearForm();</script>
</c:if>

<c:if test="${not empty update}">
<h3>Update Product Table Success</h3>
<table border="1">
	<tr><td>ProductID</td><td>${update.productid}</td></tr>
	<tr><td>ProductName</td><td>${update.productname}</td></tr>
	<tr><td>SuppliesID</td><td>${update.suppliesid}</td></tr>
	<tr><td>ProductImg</td><td>${update.productImg}</td></tr>
	<tr><td>StandardCost</td><td>${update.standardcost}</td></tr>
	<tr><td>ProductDescribe</td><td>${update.productdescribe}</td></tr>
	<tr><td>ProductStatus</td><td>${update.productstatus}</td></tr>
</table>
<script type="text/javascript">clearForm();</script>
</c:if>

</body>
</html>