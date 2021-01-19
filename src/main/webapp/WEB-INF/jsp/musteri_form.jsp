<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Müşteri Ekle</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body background="https://polonya.co/wp-content/uploads/2020/12/shopping-shannon-springs-2.jpg">
<body>

<div class="container">
    <spring:url value="/musteri/addMusteri" var="addURL" />
    <h2>Müşteri Ekle</h2>
    <form:form modelAttribute="musteriForm" method="post" action="${addURL}" cssClass="form" >
        <form:hidden path="id"/>
        <div class="form-group">
            <label>Müşteri No</label>
            <form:input path="musterino" cssClass="form-control" id="musterino" />
        </div>
        <div class="form-group">
            <label>Tc Kimlik</label>
            <form:input path="tckimlikno" cssClass="form-control" id="tckimlikno" />
        </div>

        <div class="form-group">
            <label>Müşteri Ad</label>
            <form:input path="ad" cssClass="form-control" id="ad" />
        </div>

        <div class="form-group">
            <label>Müşteri Soyad</label>
            <form:input path="soyad" cssClass="form-control" id="soyad" />
        </div>

        <div class="form-group">
            <label>Müşteri Şifre</label>
            <form:input path="sifre" cssClass="form-control" id="sifre" />
        </div>

        <div class="form-group">
            <label>Müşteri Kullanıcı Adı</label>
            <form:input path="kullaniciadi" cssClass="form-control" id="kullaniciadi" />
        </div>

        <div class="form-group">
            <label>Müşteri Adres</label>
            <form:input path="adres" cssClass="form-control" id="adres" />
        </div>

        <div class="form-group">
            <label>İl</label>
            <form:input path="iller" cssClass="form-control" id="iller" />
        </div>


        <button type="submit" class="btn btn-success">Müşteri Ekle</button>
    </form:form>

</div>
</body>
</html>