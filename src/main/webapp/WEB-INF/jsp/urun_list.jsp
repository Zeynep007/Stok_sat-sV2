<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ürün List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>
<body background="https://polonya.co/wp-content/uploads/2020/12/shopping-shannon-springs-2.jpg">

<nav class="navbar navbar-inverse" style="background-color: black">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#" style="background-color: black">STOK-SATIŞ-FATURA SİSTEMİ</a>
        </div>
        <ul class="nav navbar-nav" style="background-color: black">
            <li><a href="/musteri/list">Müşteri Ekranı</a></li>
            <li><a href="/iller/list">İller Ekranı</a></li>
            <li><a href="/fatura/list">Fatura Ekranı</a></li>
            <li><a href="/kategori/list">Kategori Ekranı</a></li>
            <li><a href="/kargofirmasi/list">Kargo Firması Ekranı</a></li>
            <li><a href="/satistemsilcisi/list">Satış Temsilcisi Ekranı</a></li>
            <li><a href="/siparis/list">Sipariş Ekranı</a></li>
            <li  class="active"><a href="/urun/list">Ürün Ekranı </a></li>
        </ul>
    </div>
</nav>

<center><h1 style= "background-color: DarkSalmon;">Ürün Ekranı</h1> </center>
<div class="container">
    <table class="table table-striped table-bordered table-sm">
        <thead class="thead-dark">
        <th scope="row">ID</th>
        <th scope="row">Kategori</th>
        <th scope="row">Ürün Adı</th>
        <th scope="row">Birim Fiyat</th>
        <th scope="row">Ürün Kodu</th>
        <th scope="row">Stok Miktarı</th>
        <th scope="row">Güncelle</th>
        <th scope="row">Sil</th>
        </thead>
        <tbody>
        <c:forEach items="${urunList}" var="urun" >
            <tr>
                <td>${urun.id}</td>
                <td>${urun.kategori.ad}</td>
                <td>${urun.adi}</td>
                <td>${urun.birimfiyat}</td>
                <td>${urun.kod}</td>
                <td>${urun.stokmiktari}</td>


                <td>

                    <spring:url value="/urun/editUrun/${urun.id}" var="editURL" />
                    <a class="btn btn-warning" href="${editURL}" role="button" >Güncelle</a>

                </td>

                <td>
                    <spring:url value="/urun/deleteUrun/${urun.id}" var="deleteURL" />
                    <a class="btn btn-danger" href="${deleteURL}" role="button" >Sil</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <spring:url value="/urun/addUrun/" var="addURL" />
    <a class="btn btn-success" href="${addURL}" role="button" >Ürün Ekle</a>
</div>
</body>

