<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>ENCRYPT TEST</title>
</head>
<body>
<p>암호화 되어있는 데이터를 복호화 하는 작업입니다.</p>
<form action="/decrypt" method="post" name="decryptTxt">
    <h3>Decrypt</h3>
    <br>
    <input type="text" name="dectext" style="width:600px">
    <br><br>
    <button type="submit">복호화</button>
</form>

<br>
BASIC TEXT : <b>${basicTxt}</b>
<br><br>
DECRYPTED TEXT : <b>${decrypted}</b>
<br>
ss
<hr><br>
<p>URLENCODE 까지 되어있는 데이터를 복호화하는 작업입니다.</p>
<h3>URLDecode + Decrypt</h3>
<form action="/urldecrypt" method="post" name="urldecrypt">
    <br>
    <input type="text" name="urldectxt" style="width:600px">
    <br><br>
    <button type="submit">복호화</button>
</form>

<br>
BASIC TEXT : <b>${basicURLTxt}</b>
<br><br>
DECRYPTED TEXT : <b>${urlDecrypted}</b>
<br>

</body>
</html>