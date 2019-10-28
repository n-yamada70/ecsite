<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>入荷商品名</title>
</head>

<body>
  <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>AddItemName</p>
    </div>
    <div>
	  <h3>入荷する商品の名前を入力してください。</h3>
	  <s:form action="AddItemAction">
	  <tr>
	    <th>商品名</th>
	    <td><s:textfield name="addItemName"/></td>
	  </tr>
	  <s:submit value="確定"/>
	  </s:form>
	  <p>前のページに戻る→
	    <a href='<s:url action="AdminAction"/>'>ここをクリック</a>
	<div id="footer">
	</div>

    </div>
  </div>

</body>
</html>