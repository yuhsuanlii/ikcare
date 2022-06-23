<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>I K care | 線上營養師</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="shortcut icon" type="image/x-icon" href="../img/logo.png" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script src="https://code.highcharts.com/highcharts.js"></script>
<!-- font-awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<!-- datatable -->

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">
<script type="text/javascript" charset="utf8"
	src="https:cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>

<style>

/* 導覽列 */
.logo {
	left: 10px;
	padding: 10px;
}

.logo2 {
	width: 50px;
	padding: 0px;
}

#navbar {
	background-color: rgb(242, 236, 226) !important;
}

.search {
	width: 30px;
	height: 30px;
	margin: 10px;
}

.login {
	width: 30px;
	height: 30px;
	margin: 10px;
}

.cart {
	width: 30px;
	height: 30px;
	margin: 10px;
}

/* main */
main {
	height: 1200px;
}

a {
	text-decoration: none;
	color: rgba(7, 6, 3, 0.854);
}

a:hover {
	color: rgb(197, 179, 165)
}

.container {
	background-color: rgb(227, 238, 241);
	color: rgb(101, 119, 156);
	width: 650px;
	height: 1100px;
	margin-top: 100px;
	margin-left: 50px;
	margin-right: 50px;
	border-radius: 1rem;
}

#table_id {
	width: 500px;
	margin-left: 10px;
	border-radius: 5px;
}

#total, #goal, #remain {
	text-align: right;
}

td {
	border: 1px solid rgba(196, 193, 193, 0.888);
}

thead tr th, tfoot tr th {
	text-align: center !important;
}

tbody th {
	width: 50px;
	text-align: center;
}

ul #matchresult {
	margin-left: 700px;
	position: absolute;
	z-index: 7;
	margin-top: 100px;
}
</style>

</head>

<body>

	<!-- 導覽列 -->
	<nav id="navbar"
		class="navbar navbar-expand-lg navbar-light bg-light fixed-top"
		style="font-size: 20px;">
		<!-- navbar justify-content-center  -->
		<div class="container-fluid">
			<img class="logo" src="../img/logo2.png" height="40">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">

					<li class="nav-item mx-auto" style="width: 400px"><a
						class="nav-link active" aria-current="page" href="/IKcare2.html"></a>
					</li>

					<li class="nav-item"><a class="nav-link" href="/IKcare2.html">首頁</a>
					</li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							健康小幫手 </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="health.html">BMI計算</a></li>
							<li><a class="dropdown-item" href="health.html">BMR＆TDEE計算</a></li>
							<li><a class="dropdown-item" href="/dietRecord.html">飲食分析</a></li>
							<li><a class="dropdown-item" href="exercise.html">運動分析</a></li>
							<li><a class="dropdown-item" href="sleep.html">睡眠分析</a></li>
							<li>
								<hr class="dropdown-divider">
							</li>
							<li><a class="dropdown-item" href="calendar.html">我的健康月曆</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link"
						href="./shop_all/ec_p1_main.html">商城</a></li>
				</ul>
				<form class="d-flex">
					<!-- <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button> -->
					<a type="button"><img class="search" src="../img/search.png"></a>
					<a type="button"><img class="login" src="../img/login.png"></a>
				</form>
			</div>
		</div>
	</nav>

	<main>


		<div class="container">

			<div class="container-left">
				<!-- 飲食紀錄表 -->
				<div style="margin-top: 20px; height:500px;">
					<input type="button" name="same" id="same" value="與前一天相同"
						style="margin-top: 50px; margin-left: 30px; width: 110px;">
					<h3 style="margin-left: 230px;">
						<i class="fa-solid fa-clipboard-list"></i>&nbsp;&nbsp;我的飲食紀錄
					</h3>
					<input type="date" name="date" id="fooddate"
						style="margin-left: 30px; background-color: aliceblue">

					<!-- 飲食熱量搜尋 -->
					<form action="<c:url value='/pages/findfood'/>">
						<div class="searchpanel"
							style="z-index: 3; position: absolute; margin-left: 700px; padding-top: 10px; background-color: rgb(173, 211, 211); width: 650px; height: 50px; border-radius: 5px;">
							<label id="search"
								style="width: 50px; margin-left: 50px; color: #4f4f4f;">搜尋：</label><input
								type="search" id="foodname" name="food"
								class="light-table-filter" data-table="order-table"
								placeholder="請輸入食物名稱" style="width: 150px; height: 30px;">
							<input type="submit" id="find" name="findfood" value="搜尋">
							<label id="search" style="margin-left: 60px; color: #4f4f4f">份量：&nbsp;<input
								type="text" id="exchange" name="exchangenumber"
								style="width: 30px; height: 25px;">&nbsp; <select>
									<option style="display: none;">單位</option>
									<option>公克</option>
									<option>碗</option>
									<option>茶匙</option>
									<option>湯匙</option>
									<option>塊</option>
									<option>個</option>
									<option>根</option>
									<option>片</option>
									<option>支</option>
									<option>顆</option>
									<option>條</option>
									<option>毫升</option>
									<option>杯</option>
									<option>手掌大</option>
							</select> <select>
									<option style="display: none">新增至哪餐</option>
									<option>早餐</option>
									<option>午餐</option>
									<option>晚餐</option>
									<option>點心</option>
							</select>
						</div>
					</form>

					<!-- 食物搜尋結果 -->
					<div id="resulttable">
						<br>
						<!-- <label id="searchresult"
                            style="z-index:4; position:absolute;margin-top:50px;margin-left:750px;background-color:rgb(218, 180, 188)">搜尋結果</label>
                             -->
						<div
							style="border-radius: 1rem; z-index: 6; position: absolute; width: 650px; margin-left: 700px; margin-top: 50px; background-color: rgb(224, 239, 210);">

							<table id="table_id" class="table"
								style="margin-left: 50px; margin-bottom: 50px; margin-top: 50px; background-color: #f8f9fa;">
								<ul id="matching">
									<thead>
										<tr id="resulttitle">
											<th>食物名稱</th>
											<th>份量</th>
											<th>熱量</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="row" items="${select}">
											<tr class="table-acitive">
												<td id="matchresult">1</td>
												<td id="matchresult">2</td>
												<td id="matchresult">3</td>
												<td><input type="button" value="新增"></td>
											</tr>
										</c:forEach>
									</tbody>
								</ul>
							</table>
							<!-- <input type="button" value="新增至飲食紀錄表" name="adddiet" style="margin-left:250px;"> -->
						</div>
					</div>
					<!-- 圓餅圖 -->
					<div id="pie" name="pie"
						style="z-index: 3; position: absolute; margin-left: 700px; margin-top: 450px;"></div>

					<!-- 飲食紀錄表欄位 -->
					<div class="table">
						<table id="table_id"
							class="display cell-border hover responsive nowrap"
							style="width: 600px; color: rgb(101, 119, 156); background-color: #f8f9fa">
							<thead>
								<tr>
									<th id="add"></th>
									<th id="calories">卡路里</th>
									<th id="carbonhydrate">碳水化合物</th>
									<th id="protein">蛋白質</th>
									<th id="fat">脂肪</th>
									<th id="sodium">鈉</th>
									<th id="sugar">糖</th>
								</tr>

							</thead>

							<tbody>
								<tr>
									<th id="meal">早餐</th>

								</tr>
								<tr id="addfood">
									<td id="add"><a href="#" id="add1" name="addmornig"><i
											class="fa-solid fa-circle-plus"></i></a><label>&nbsp;新增&nbsp;</label>
										<a href="#" id="copy1" name="copybreakfast"><i
											class="fa-solid fa-copy"></i></a><label>&nbsp;複製前一天&nbsp;</label>
									</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>

								</tr>

								<tr>
									<th id="meal">午餐</th>
								</tr>
								<tr>
									<td id="add"><a href="#" id="add2" name="addlunch"><i
											class="fa-solid fa-circle-plus"></i></a><label>&nbsp;新增&nbsp;</label>
										<a href="#" id="copy2" name="copylunch"><i
											class="fa-solid fa-copy"></i></a><label>&nbsp;複製前一天&nbsp;</label>
									</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>

								</tr>
								<tr>
									<th id="meal">晚餐</th>
								</tr>
								<tr>
									<td id="add"><a href="#" id="add3" name="adddinner"><i
											class="fa-solid fa-circle-plus"></i></a><label>&nbsp;新增&nbsp;</label>
										<a href="#" id="copy3" name="copydinner"><i
											class="fa-solid fa-copy"></i></a><label>&nbsp;複製前一天&nbsp;</label>
									</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>

								</tr>
								<tr>
									<th id="meal">點心</th>
								</tr>
								<tr>
									<td id="add"><a href="#" id="add4" name="addsnack"><i
											class="fa-solid fa-circle-plus"></i></a><label>&nbsp;新增&nbsp;</label>
										<a href="#" id="copy4" name="copysnack"><i
											class="fa-solid fa-copy"></i></a><label>&nbsp;複製前一天&nbsp;</label>
									</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>

								</tr>

								<tr>
									<td id="total">總計&nbsp;&nbsp;</td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>


								</tr>
								<tr>
									<td id="goal">你的每日目標&nbsp;&nbsp;</td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>


								</tr>
								<tr>
									<td id="remain">今日剩餘熱量&nbsp;&nbsp;</td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>
									<td id="result"></td>


								</tr>
							</tbody>
							<tfoot>
								<td id="tableFooter" style="border: 0ch;"></td>
								<th id="calories">卡路里</th>
								<th id="carbonhydrate">碳水化合物</th>
								<th id="protein">蛋白質</th>
								<th id="fat">脂肪</th>
								<th id="sodium">鈉</th>
								<th id="sugar">糖</th>
							</tfoot>

						</table>
						<br> <br>
						<div>
							<input type="button" value="儲存" style="margin-left: 300px;"><br>
							<br> <label style="margin-left: 200px; font-size: 20px;">今日飲食缺少維生素A</label>
							<a href="#"><p style="font-size: 24px;">
									<img src="../img/finger.png" id="finger" name="goshop"
										height="15px" style="margin-left: 200px;">&nbsp;點我至商城
								</p></a>
						</div>
					</div>


				</div>
				<script>
					$('#pie')
							.highcharts(
									{
										colors : [ '#8FBC8F', '#87CEFA',
												'#EEDC82' ],
										// chart: {
										//   type: 'pie',
										//   options3d: {
										//     enabled: true,
										//     alpha: 45,
										//     beta: 0
										//   }
										// },
										title : {
											text : '三大營養素比例圖'

										},
										tooltip : {
											pointFormat : '{series.name}: <b>{point.mycustomLabel}</b>'
										// pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
										},
										plotOptions : {
											pie : {
												allowPointSelect : true,
												cursor : 'pointer',
												depth : 35,
												dataLabels : {
													enabled : true,
													format : '{point.name}'
												}
											}
										},
										series : [ {
											type : 'pie',
											name : 'nutrition',
											data : [ [ '碳水化合物', 45.0 ],
													[ '蛋白質', 26.8 ],
													// {
													//   name: 'Chrome',
													//   y: 12.8,
													//   sliced: true,
													//   selected: true,
													//   mycustomLabel: 'ithelp-ithelp-ithelp-ithelp'
													// },

													[ '脂肪', 28.0 ], ],
											colorByPoint : true,
										} ]
									});
				</script>

			</div>

		</div>

		<script>
			$('table').dataTable({
				searching : false,
				paging : false,
				info : false
			});
			$(document)
					.ready(
							function() {
								$('#table_id')
										.DataTable(
												{

													//中文化
													"language" : {
														"processing" : "處理中...",
														"loadingRecords" : "載入中...",
														"lengthMenu" : "顯示 _MENU_ 項結果",
														"info" : "顯示第 _START_ 至 _END_ 項結果，共 _TOTAL_ 項",
														"infoEmpty" : "顯示第 0 至 0 項結果，共 0 項",
														"infoFiltered" : "(從 _MAX_ 項結果中過濾)",
														"search" : "搜尋食物名稱:",
														"paginate" : {
															"first" : "第一頁",
															"previous" : "上一頁",
															"next" : "下一頁",
															"last" : "最後一頁"
														},
														"aria" : {
															"sortAscending" : ": 升冪排列",
															"sortDescending" : ": 降冪排列"
														},
														"emptyTable" : "目前沒有資料",
														"datetime" : {
															"previous" : "上一頁",
															"next" : "下一頁",
															"hours" : "時",
															"minutes" : "分",
															"seconds" : "秒",
															"amPm" : [ "上午",
																	"下午" ],
															"unknown" : "未知",
															"weekdays" : [
																	"週日", "週一",
																	"週二", "週三",
																	"週四", "週五",
																	"週六" ],
															"months" : [ "一月",
																	"二月", "三月",
																	"四月", "五月",
																	"六月", "七月",
																	"八月", "九月",
																	"十月",
																	"十一月",
																	"十二月" ]
														},
														"searchBuilder" : {
															"add" : "新增條件",
															"condition" : "條件",
															"deleteTitle" : "刪除過濾條件",
															"button" : {
																"_" : "複合查詢 (%d)",
																"0" : "複合查詢"
															},
															"clearAll" : "清空",
															"conditions" : {
																"array" : {
																	"contains" : "含有",
																	"equals" : "等於",
																	"empty" : "空值",
																	"not" : "不等於",
																	"notEmpty" : "非空值",
																	"without" : "不含"
																},
																"date" : {
																	"after" : "大於",
																	"before" : "小於",
																	"between" : "在其中",
																	"empty" : "為空",
																	"equals" : "等於",
																	"not" : "不為",
																	"notBetween" : "不在其中",
																	"notEmpty" : "不為空"
																},
																"number" : {
																	"between" : "在其中",
																	"empty" : "為空",
																	"equals" : "等於",
																	"gt" : "大於",
																	"gte" : "大於等於",
																	"lt" : "小於",
																	"lte" : "小於等於",
																	"not" : "不為",
																	"notBetween" : "不在其中",
																	"notEmpty" : "不為空"
																},
																"string" : {
																	"contains" : "含有",
																	"empty" : "為空",
																	"endsWith" : "字尾為",
																	"equals" : "等於",
																	"not" : "不為",
																	"notEmpty" : "不為空",
																	"startsWith" : "字首為",
																	"notContains" : "不含",
																	"notStarts" : "開頭不是",
																	"notEnds" : "結尾不是"
																}
															},
															"data" : "欄位",
															"leftTitle" : "群組條件",
															"logicAnd" : "且",
															"logicOr" : "或",
															"rightTitle" : "取消群組",
															"title" : {
																"_" : "複合查詢 (%d)",
																"0" : "複合查詢"
															},
															"value" : "內容"
														},
														"editor" : {
															"close" : "關閉",
															"create" : {
																"button" : "新增",
																"title" : "新增資料",
																"submit" : "送出新增"
															},
															"remove" : {
																"button" : "刪除",
																"title" : "刪除資料",
																"submit" : "送出刪除",
																"confirm" : {
																	"_" : "您確定要刪除您所選取的 %d 筆資料嗎？",
																	"1" : "您確定要刪除您所選取的 1 筆資料嗎？"
																}
															},
															"error" : {
																"system" : "系統發生錯誤(更多資訊)"
															},
															"edit" : {
																"button" : "修改",
																"title" : "修改資料",
																"submit" : "送出修改"
															},
															"multi" : {
																"title" : "多重值",
																"info" : "您所選擇的多筆資料中，此欄位包含了不同的值。若您想要將它們都改為同一個值，可以在此輸入，要不然它們會保留各自原本的值。",
																"restore" : "復原",
																"noMulti" : "此輸入欄需單獨輸入，不容許多筆資料一起修改"
															}
														},
														"autoFill" : {
															"cancel" : "取消"
														},
														"buttons" : {
															"copySuccess" : {
																"_" : "複製了 %d 筆資料",
																"1" : "複製了 1 筆資料"
															},
															"copyTitle" : "已經複製到剪貼簿",
															"excel" : "Excel",
															"pdf" : "PDF",
															"print" : "列印",
															"copy" : "複製"
														},
														"searchPanes" : {
															"collapse" : {
																"_" : "搜尋面版 (%d)",
																"0" : "搜尋面版"
															},
															"emptyPanes" : "沒搜尋面版",
															"loadMessage" : "載入搜尋面版中...",
															"clearMessage" : "清空"
														},
														"stateRestore" : {
															"emptyError" : "名稱不能空白。"
														},
														"select" : {
															"columns" : {
																"_" : "選擇了 %d 欄資料"
															},
															"rows" : {
																"1" : "選擇了 1 筆資料",
																"_" : "選擇了 %d 筆資料"
															}
														},
														"zeroRecords" : "沒有符合的資料"
													}

												});
							});
		</script>


	</main>

	<!-- footer -->
	<footer class="navbar-fixed-bottom" style="background-color: #eee6d3;">
		<div class="p-4">
			<div class="row">
				<div class="col-lg-2 col-md-12 mb-4">
					<!-- <h5 class="mb-3 text-dark">footer content</h5> -->
					<!-- <p>
      Lorem ipsum dolor sit amet consectetur, adipisicing elit. 
      Iste atque ea quis molestias. Fugiat pariatur maxime quis culpa 
      corporis vitae repudiandae aliquam voluptatem veniam, 
      est atque cumque eum delectus sint!
    </p> -->
				</div>

				<div class="col-lg-2 col-md-6 mb-4">
					<h6 class="mb-3 text-dark">購物資訊</h6>
					<ul class="list-unstyled mb-0">
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;">FAQs</a>
						</li>
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;">How
								to buy</a></li>
					</ul>
				</div>

				<div class="col-lg-2 col-md-6 mb-4">
					<h5 class="mb-3 text-dark">I K Care</h5>
					<ul class="list-unstyled mb-0">
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;">關於我們</a>
						</li>
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;">隱私權政策</a>
						</li>
					</ul>
				</div>

				<div class="col-lg-2 col-md-6 mb-4">
					<h6 class="mb-3 text-dark">相關網站</h6>
					<ul class="list-unstyled mb-0">
						<li class="mb-1"><a href="dietaryGuide.html"
							style="color: #4f4f4f;">國民飲食指標</a></li>
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;">營養小知識</a>
						</li>
					</ul>
				</div>

				<div class="col-lg-3 col-md-6 mb-4">
					<h6 class="mb-3 text-dark">聯絡我們</h6>
					<ul class="list-unstyled mb-0">
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;">service@ikcare.com</a>
						</li>
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;"><img
								src="../img/facebook_logos_PNG19753.png" type="button"
								width="30px"></a></li>
						<li class="mb-1"><a href="#!" style="color: #4f4f4f;"><img
								src="../img/instagram.png" type="button" width="30px"></a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="text-center p-3"
			style="background-color: rgba(0, 0, 0, 0.2);">
			© 2022 Copyright: <a class="text-dark" href="IKcare2.html">IKcare.com</a>
		</div>
		<!-- Copyright -->
	</footer>


</body>

</html>