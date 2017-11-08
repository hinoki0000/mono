<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>Home画面</title>
	<style type="text/css">
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========TEMPLATE LAYOUT======== */
		#top {
		   width:780px;
		   margin:30px auto;
		   border:1px solid #333;
		}

		#header {
		   width: 100%;
		   height: 80px;
		   background-color: black;
		}

		#main {
		   width: 100%;
		   height: 500px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear:both;
		}

		#text-center {
			display: inline-block;
			text-align: center;
		}
	</style>
</head>
<body>
Home画面<br/>
SearchActionへ、商品一覧画面へ移動<br/>
Search.jsp<br/>
検索例＞
「服」<br/>
「服　メンズ」<br/>
×[服メンズ]
			<s:form action="SearchAction2">
			<s:textfield name="item_name" label= "商品"/>
				<s:submit value="商品一覧画面"/>
			</s:form>

	<s:form action="SearchAction">
	<s:textfield name="product_name" label= "商品"/>

				<s:submit value="移植"/>
						</s:form>
<s:form action="LoginAction">
				<s:textfield name="user_name"/>
				<s:password name="user_id"/>
				<s:submit value="ログイン"/>
			</s:form>


</body>
</html>