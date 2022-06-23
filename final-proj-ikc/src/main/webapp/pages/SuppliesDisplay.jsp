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
		<th>SuppliesID</th>
		<th>SuppliesName</th>
		<th>ContactPerson</th>
		<th>Position</th>
		<th>SuppliesPhone</th>
		<th>Fax</th>
		<th>SuppliesAdress</th>
		<th>SuppliesArea</th>
	</tr>
	</thead>
	<tbody>
	
	<c:forEach var="row" items="${select}">
		<c:url value="/pages/SuppliesControl.jsp" var="path">
			<c:param name="suppliesid" value="${row.suppliesid}" />
			<c:param name="suppliesname" value="${row.suppliesname}" />
			<c:param name="contactperson" value="${row.contactperson}" />
			<c:param name="position" value="${row.position}" />
			<c:param name="suppliesphone" value="${row.suppliesphone}" />
			<c:param name="fax" value="${row.fax}" />
			<c:param name="suppliesadress" value="${row.suppliesadress}" />
			<c:param name="suppliesarea" value="${row.suppliesarea}" />
			
		</c:url>
	<tr>
		<td><a href="${path}">${row.suppliesid}</a></td>
		<td>${row.suppliesname}</td>
		<td>${row.contactperson}</td>
		<td>${row.position}</td>
		<td>${row.suppliesphone}</td>
		<td>${row.fax}</td>
		<td>${row.suppliesadress}</td>
		<td>${row.suppliesarea}</td>
		
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</c:if>

<h3><a href="<c:url value="/pages/SuppliesControl.jsp" />">Product Table</a></h3>

</body>
</html>