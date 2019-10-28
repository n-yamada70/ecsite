<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>完了画面</title>
</head>
<body>
  <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>itemCreateComplete</p>
    </div>
    <div id="text-center">
      <s:form action="GoHomeAction">
        <s:submit value="ホームへ"/>
      </s:form>
      <s:form action="AdminAction">
        <s:submit value="管理者TOPへ"/>
      </s:form>
    </div>
  </div>
  <div id="footer">
  </div>
</body>
</html>