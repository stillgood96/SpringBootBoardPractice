<%--
  Created by IntelliJ IDEA.
  User: a7875
  Date: 2021-12-05
  Time: 오후 5:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>File Upload Test</title>
</head>
<body>
    <h1>file upload</h1>
    <form method="post" action="/upload" enctype="multipart/form-data">
        <label for="file1">파일1</label>
        <input type="file" id="file1" name="uploadFile" multiple="multiple">
        <input type="submit">
    </form>

    <form method="post" action="/fileUpload" enctype="multipart/form-data">
        <label for="file1">파일2</label>
        <input type="file" id="file2" name="uploadFile" multiple="multiple">
        <input type="submit">
    </form>
</body>
</html>
