<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Sipariş Ekle</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body background="https://polonya.co/wp-content/uploads/2020/12/shopping-shannon-springs-2.jpg">
<body>

<div class="container">
    <spring:url value="/siparis/addSiparis" var="addURL" />
    <h2>Siparis Ekle</h2>
    <form:form modelAttribute="siparisForm" method="post" action="${addURL}" cssClass="form" >
        <form:hidden path="id"/>
        <div class="form-group">
            <label>Siparis No</label>
            <form:input path="siparisno" cssClass="form-control" id="siparisno" />
        </div>
        <div class="form-group">
            <label>Barkod No</label>
            <form:input path="barkodno" cssClass="form-control" id="barkodno" />
        </div>

        <div class="form-group">
            <label>Siparis Adedi</label>
            <form:input path="siparisadedi" cssClass="form-control" id="siparisadedi" />
        </div>

        <div class="form-group">
            <label>Siparis Fiyat</label>
            <form:input path="birimfiyat" cssClass="form-control" id="birimfiyat" />
        </div>

        <div class="form-group">
            <label>Urun</label>
            <form:input path="urun" cssClass="form-control" id="urun" />
        </div>



        <div class="form-group">
            <label>Musteri</label>
            <form:input path="musteri" cssClass="form-control" id="musteri" />
        </div>

        <div class="form-group">
            <label>satış temsilcisi</label>
            <form:input path="satistemsilcisi" cssClass="form-control" id="satistemsilcisi" />
        </div>

        <div class="form-group">
            <label>Fatura</label>
            <form:input path="fatura" cssClass="form-control" id="fatura" />
        </div>

        <div class="form-group">
            <label>Kargo Firmasi</label>
            <form:input path="kargofirmasi" cssClass="form-control" id="kargofirmasi" />
        </div>


        <button type="submit" class="btn btn-success">Sipariş Ekle</button>
    </form:form>

</div>
</body>
</html>