<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品入荷</title>
</head>

<body>
  <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>AddStock</p>
    </div>
    <div>
	  <h3>入荷する商品の個数を入力してください。</h3>
	  <s:form action="AddStockCreateAction">
	  <tr>
	    <th>商品名</th>
	    <td><s:textfield name="addItemName"/></td>
	  </tr>
	  <tr>
	    <th>入荷数</th>
	    <td><s:textfield name="addStock"/></td>
	  </tr>
	  <s:submit value="送信"/>
	  </s:form>
	  <p>管理者トップページに戻る→
	    <a href='<s:url action="AdminAction"/>'>ここをクリック</a>
	<div id="footer">
	</div>

    </div>
  </div>

</body>
</html>