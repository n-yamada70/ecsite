<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>商品一覧</title>
</head>
<body>
<div id="header">
  </div>
  <div id="main">
    <div id="top">
      <p>itemList</p>
    </div>
  <div>
  <table>
    <tr>
      <th>ID</th>
      <th>商品名</th>
      <th>価格</th>
      <th>在庫数</th>
      <th>更新日時</th>
    </tr>
    <s:iterator value="iDTOList">
    <tr>
      <td><s:property value="Id"/></td>
      <td><s:property value="iName"/></td>
      <td><s:property value="iPrice"/><span>円</span></td>
      <td><s:property value="iStock"/><span>個</span></td>
      <td><s:property value="insert_date"/></td>
    </tr>
    </s:iterator>
  </table>
  </div>
  <s:form action="itemListDeleteConfirmAction">
    <s:submit value="データ削除"></s:submit>
  </s:form>
  <s:form action="AdminAction">
        <s:submit value="戻る"/>
      </s:form>
  </div>