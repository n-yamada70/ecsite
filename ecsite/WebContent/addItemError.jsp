<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Error画面</title>
</head>
<body>
  <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>Error</p>
    </div>
    <h3>エラー：入力された商品は存在しません。</h3>
    <div id="text-center">
      <s:form action="AdminAction">
        <s:submit value="管理者画面へ"/>
      </s:form>
    </div>
  </div>
  <div id="footer">
  </div>
</body>
</html>