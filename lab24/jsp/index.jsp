<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="Sss" method="POST">
    <H2>Create a directory on Yandex.Disk</H2>
    <p>Directory name: <input name="dir" type="text"/>
        <input name="add" value="Create Directory" type="submit" size="10" maxlength="10"/></p>
</form>
<br><br>
<form method="POST" action="Sss" enctype="multipart/form-data">
    <H2>Upload a file to Yandex.Disk</H2>
    Choose a file: <input type="file" name="addFile" />
    <input name="add" value="Upload" type="submit" size="10" maxlength="10"/></p>
</form>
<br><br>
<form action="Sss" method="POST">
    <H2>Download a file from Yandex.Disk</H2>
    <p>File name: <input name="file" type="text"/>
        <input name="add" value="Download" type="submit" size="10" maxlength="10"/></p>
</form>
<br><br>
<form action="Sss" method="POST">
    <H2>Delete a directory or a file from Yandex.Disk</H2>
    <p>Directory or file name: <input name="dir" type="text"/>
        <input name="add" value="Delete" type="submit" size="10" maxlength="10"/></p>
</form>
<br><br>
<form action="Sss" method="POST">
    <H2>Copy a file between directories on Yandex.Disk</H2>
    <p>Dir from: <input name="dirFrom" type="text"/>
    <p>File name<input name="file" type="text"/>
    <p>Dir to<input name="dir" type="text"/>
    <input name="add" value="Copy" type="submit" size="10" maxlength="10"/></p>
</form>
<br><br>
</body>
</html>
