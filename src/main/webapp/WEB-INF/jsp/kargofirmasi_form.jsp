<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Kargo Firması Ekle</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body background="https://polonya.co/wp-content/uploads/2020/12/shopping-shannon-springs-2.jpg">
<body>

<div class="container">
    <spring:url value="/kargofirmasi/addKargofirmasi" var="addURL" />
    <h2>Kargo Firması Ekle</h2>
    <form:form modelAttribute="kargofirmasiForm" method="post" action="${addURL}" cssClass="form" >
        <form:hidden path="id"/>
        <div class="form-group">
            <label>Kargo Şirketi</label>
            <form:input path="ad" cssClass="form-control" id="ad" />
        </div>
        <div class="form-group">
            <label>Adres</label>
            <form:input path="adres" cssClass="form-control" id="adres" />
        </div>
        <div class="form-group">
            <label>Telefon</label>
            <form:input path="telefon" cssClass="form-control" id="telefon" />
        </div>

        <button type="submit" class="btn btn-success">Kargo Firması Ekle</button>
    </form:form>

</div>
</body>
</html>