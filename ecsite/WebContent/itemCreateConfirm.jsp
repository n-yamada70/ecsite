<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>アイテム入力確認画面</title>
</head>
<body>
  <div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>itemCreateConfirm</p>
    </div>
    <div>

      <h3>入力確認</h3>
      <table>
      <s:form action="itemCreateCompleteAction">
        <tr>
          <td><s:property value="i_Name" escape="false"/></td>
        </tr>
        <tr>
          <td><s:property value="i_Price" escape="false"/>円</td>
        </tr>
        <tr>
          <td><s:property value="i_Stock" escape="false"/>個</td>
        </tr>
        <tr>
          <td><s:submit value="完了"/></td>
        </tr>
      </s:form>
      </table>

    </div>
  </div>
  <div id="footer"></div>
</body>
</html>