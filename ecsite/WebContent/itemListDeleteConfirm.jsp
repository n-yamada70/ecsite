<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>削除確認画面</title>
</head>
<body>
   <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>Delete</p>
    </div>
    <div>
    <h3>管理者以外のユーザーを削除します。よろしいですか？</h3>
      <s:form action="itemListDeleteCompleteAction">
        <s:submit value="OK"></s:submit>
      </s:form>
      <s:form action="itemListAction">
        <s:submit value="キャンセル"></s:submit>
      </s:form>
    </div>
    </div>

    <div id="hooter">
    </div>
</body>
</html>