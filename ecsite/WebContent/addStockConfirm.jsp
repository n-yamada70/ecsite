<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>入荷情報確認</title>
</head>

<body>
  <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>AddStockConfirm</p>
    </div>
    <div>
	  <h3>以下の内容で入荷しました。</h3>

	<s:form action="AdminAction">
	  <tr>
	    <th>商品名:</th>
	    <td><s:property value="#session.addName"/></td>
	  </tr>
	  <tr>
	    <th>入荷数:</th>
	    <td><s:property value="#session.addStockNow"/></td>
	  </tr>
	  <s:submit value="完了"/>
	</s:form>

	<div id="footer">
	</div>

    </div>
  </div>

</body>
</html>