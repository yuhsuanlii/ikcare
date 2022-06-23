<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/table.css" />
<title>Supplies</title>
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


<h3>Supplies Table</h3>

<form action="<c:url value="/pages/SuppliesControl.controller" />" method="get">
<table>
	<tr>
		<td>SuppliesID : </td>
		<td><input type="text" name="suppliesid" value="${param.suppliesid}"></td>
		<td><span class="error">${errors.suppliesname}</span></td>
	</tr>

	<tr>
		<td>SuppliesName : </td>
		<td><input type="text" name="suppliesname" value="${param.suppliesname}"></td>
		<td><span class="error">${errors.suppliesname}</span></td>
	</tr>
	<tr>
		<td>ContactPerson : </td>
		<td><input type="text" name="contactperson" value="${param.contactperson}"></td>
		<td><span class="error">${errors.contactperson}</span></td>
		<td></td>
	</tr>
	<tr>
		<td>Position : </td>
		<td><input type="text" name="position" value="${param.position}"></td>
		<td><span class="error">${errors.position}</span></td>
	</tr>
	<tr>
		<td>SuppliesPhone : </td>
		<td><input type="text" name="suppliesphone" value="${param.suppliesphone}"></td>
		<td><span class="error">${errors.suppliesphone}</span></td>
	</tr>
	<tr>
		<td>Fax : </td>
		<td><input type="text" name="fax" value="${param.fax}"></td>
		<td><span class="error">${errors.fax}</span></td>
	</tr>
	<tr>
		<td>SuppliesAdress : </td>
		<td><input type="text" name="suppliesadress" value="${param.suppliesadress}"></td>
		<td><span class="error">${errors.suppliesadress}</span></td>
	</tr>
	<tr>
		<td>SuppliesArea : </td>
		<td><input type="text" name="suppliesarea" value="${param.suppliesarea}"></td>
		<td><span class="error">${errors.suppliesarea}</span></td>
	</tr>
	
	<tr>
		<td>
			<input type="submit" name="prodaction" value="Insert">
			<input type="submit" name="prodaction" value="Update">
		</td>
		<td>
			<input type="submit" name="prodaction" value="Delete">
			<input type="submit" name="prodaction" value="Select">
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
<h3>Insert Supplies Table Success</h3>
<table border="1">
	<tr><td>SuppliesName</td><td>${insert.suppliesname}</td></tr>
	<tr><td>ContactPerson</td><td>${insert.contactperson}</td></tr>
	<tr><td>Position</td><td>${insert.position}</td></tr>
	<tr><td>SuppliesPhone</td><td>${insert.suppliesphone}</td></tr>
	<tr><td>Fax</td><td>${insert.fax}</td></tr>
	<tr><td>SuppliesAdress</td><td>${insert.suppliesadress}</td></tr>
	<tr><td>SuppliesArea</td><td>${insert.suppliesarea}</td></tr>
</table>
<script type="text/javascript">clearForm();</script>
</c:if>

<c:if test="${not empty update}">
<h3>Update Product Table Success</h3>
<table border="1">
	<tr><td>SuppliesName</td><td>${update.suppliesname}</td></tr>
	<tr><td>ContactPerson</td><td>${update.contactperson}</td></tr>
	<tr><td>Position</td><td>${update.position}</td></tr>
	<tr><td>SuppliesPhone</td><td>${update.suppliesphone}</td></tr>
	<tr><td>Fax</td><td>${update.fax}</td></tr>
	<tr><td>SuppliesAdress</td><td>${update.suppliesadress}</td></tr>
	<tr><td>SuppliesArea</td><td>${update.suppliesarea}</td></tr>
</table>
<script type="text/javascript">clearForm();</script>
</c:if>




</body>
</html>