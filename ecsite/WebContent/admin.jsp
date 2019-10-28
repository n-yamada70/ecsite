<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Admin画面</title>
</head>
<body>
  <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>Admin</p>
    </div>

  <table>
    <tr>
      <th>商品登録</th>
      <th>ユーザー</th>
    </tr>
    <tr>
      <td><s:form action="itemCreateAction"><s:submit value="新規登録"/></s:form></td>
      <td><s:form action="UserCreateAction"><s:submit value="新規登録"/></s:form></td>
    </tr>
    <tr>
      <td><s:form action="itemListAction"><s:submit value="一覧"/></s:form></td>
      <td><s:form action="UserListAction"><s:submit value="一覧"/></s:form></td>
    </tr>
    <tr>
      <th>商品入荷</th>
    <tr>
      <td><s:form action="AddStockAction"><s:submit value="登録する"/></s:form></td>
    </tr>

  </table>

  <div>
        <span>戻る</span>
        <a href='<s:url action="GoHomeAction"/>'>ここをクリック</a>
      </div>

  <div id="footer">
  </div>
  </div>
</body>
</html>