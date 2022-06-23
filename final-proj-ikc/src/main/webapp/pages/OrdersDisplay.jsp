<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">

<style type="text/css">
table {
	font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
	font-size: 12px;
	margin: 45px;
	width: 480px;
	text-align: left;
	border-collapse: collapse;
	position: relative;
	left: 50px;
}

th {
	font-size: 13px;
	font-weight: normal;
	padding: 8px;
	background: #b9c9fe;
	border-top: 4px solid #aabcfe;
	border-bottom: 1px solid #fff;
	color: #039;
}

td {
	padding: 4px;
	background: #e8edff;
	border-bottom: 1px solid #fff;
	color: #669;
	border-top: 1px solid transparent;
}

.myinput {
	background: #e8edff;
	height: 30px;
	border: 0px solid;
}

tr:hover td {
	background: #d0dafd;
	color: #339;
}
</style>

<title>訂單系統</title>
</head>
<body>
	<c:if test="${not empty select}">
		<table>
			<thead>
				<tr>
					<th>OrderID</th>
					<th>UserAccount</th>
					<th>OrderTime</th>
					<th>OrderEndTime</th>
					<th>OrderAdress</th>
					<th>OrderArea</th>
					<th>OrderStatus</th>
					<th>Payment</th>
					<th>Delivery</th>
					<th>編輯</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="row" items="${select}">
					<form action="<c:url value="/pages/OrdersServlet.controller" />">
						<c:url value="/pages/OrderDetailsDisplay.controller" var="path">
							<c:param name="prodaction" value="Select" />
							<c:param name="orderID" value="${row.orderID}" />
							<c:param name="userAccount" value="${row.userAccount}" />
							<c:param name="orderTime" value="${row.orderTime}" />
							<c:param name="orderEndTime" value="${row.orderEndTime}" />
							<c:param name="orderAdress" value="${row.orderAdress}" />
							<c:param name="orderArea" value="${row.orderArea}" />
							<c:param name="orderStatus" value="${row.orderStatus}" />
							<c:param name="payment" value="${row.payment}" />
							<c:param name="delivery" value="${row.delivery}" />
						</c:url>
						<tr>
							<td><a href="${path}" name="orderID" value="${row.orderID}">${row.orderID}</a></td>
							<td><input type="text" name="userAccount" class="myinput"
								value="${row.userAccount}" style="width: 120px"></td>
							<td><input type="datetime" name="orderTime" class="myinput"
								value="${row.orderTime}"></td>
							<td><input type="date" name="orderEndTime" class="myinput"
								value="${row.orderEndTime}"></td>
							<td><input type="text" name="orderAdress" class="myinput"
								value="${row.orderAdress}"></td>
							<td><input list="County" type="text" name="orderArea" class="myinput"
								value="${row.orderArea}" style="width: 80px"></td>
							<td><input list="StatusForOrder" type="text" name="orderStatus" class="myinput"
								value="${row.orderStatus}" style="width: 100px"></td>
							<td><input list="paymentlist" type="text" name="payment" class="myinput"
								value="${row.payment}" style="width: 150px"></td>
							<td><input list="deliverylist" type="text" name="delivery" class="myinput"
								value="${row.delivery}" style="width: 150px"></td>
							<td><input type="submit" name="prodaction" value="編輯"><input
								type="submit" name="prodaction" value="刪除"></td>
						</tr>
					</form>

				</c:forEach>
				<form>
					<tr>
						<td>ID-AI</td>
						<td><input type="text" class="myinput" style="width: 120px"></td>
						<td><input type="datetime" name="orderTime" class="myinput"></td>
						<td><input type="date" name="orderEndTime" class="myinput"></td>
						<td><input type="text" name="orderAdress" class="myinput"></td>
						<td><input list="County" type="text" name="orderArea" class="myinput" style="width: 80px"></td>
						<td><input list="StatusForOrder" type="text" name="orderStatus" class="myinput" style="width: 100px"></td>
						<td><input list="paymentlist" type="text" name="payment" class="myinput" style="width: 150px"></td>
						<td><input list="deliverylist" type="text" name="delivery" class="myinput" style="width: 150px"></td>
						<td><input type="submit" name="prodaction" value="新增"></td>
					</tr>
				</form>
			</tbody>
		</table>
		<datalist id="deliverylist">
			<option value="宅配">
			<option value="超商取貨">
		</datalist>
		<datalist id="paymentlist">
			<option value="超商取貨付款">
			<option value="信用卡">
			<option value="貨到付款">
			<option value="ATM轉帳">
		</datalist>
		<datalist id="StatusForOrder">
			<option value="下單完成">
			<option value="訂單確認完成">
			<option value="配送中">
			<option value="已送達">
			<option value="退單">
		</datalist>
		<datalist id="County">
			<option value="臺北市">
			<option value="新北市">
			<option value="桃園市">
			<option value="臺中市">
			<option value="臺南市">
			<option value="高雄市">
			<option value="基隆市">
			<option value="新竹市">
			<option value="嘉義市">
			<option value="新竹縣">
			<option value="苗栗縣">
			<option value="彰化縣">
			<option value="南投縣">
			<option value="雲林縣">
			<option value="嘉義縣">
			<option value="屏東縣">
			<option value="宜蘭縣">
			<option value="花蓮縣">
			<option value="臺東縣">
			<option value="澎湖縣">
			<option value="金門縣">
			<option value="連江縣">
		</datalist>
	</c:if>


</body>
</html>