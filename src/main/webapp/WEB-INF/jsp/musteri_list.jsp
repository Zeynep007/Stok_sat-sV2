<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Müşteri List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script

</head>
<body>
<body background="https://polonya.co/wp-content/uploads/2020/12/shopping-shannon-springs-2.jpg">

<nav class="navbar navbar-inverse" style="background-color: black">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#" style="background-color: black">STOK-SATIŞ-FATURA SİSTEMİ</a>
        </div>
        <ul class="nav navbar-nav" style="background-color: black">
            <li><a href="/fatura/list">Fatura Ekranı</a></li>
            <li><a href="/iller/list">İller Ekranı</a></li>
            <li><a href="/urun/list">Ürün Ekranı</a></li>
            <li><a href="/kategori/list">Kategori Ekranı</a></li>
            <li><a href="/kargofirmasi/list">Kargo Firması Ekranı</a></li>
            <li><a href="/satistemsilcisi/list">Satış Temsilcisi Ekranı</a></li>
            <li><a href="/siparis/list">Sipariş Ekranı</a></li>
            <li  class="active"><a href="/musteri/list">Müşteri Ekranı </a></li>
        </ul>
    </div>
</nav>

<center><h1 style= "background-color: darksalmon;">Müşteri Ekranı</h1> </center>
<div class="container">
    <table class="table table-striped table-bordered table-sm">
        <thead class="thead-dark">
        <th scope="row">ID</th>
        <th scope="row">İL adı</th>
        <th scope="row">Müşteri No</th>
        <th scope="row">Tc Kimlik No</th>
        <th scope="row">Müşteri Ad Soyad</th>
        <th scope="row">Müşteri Şifre</th>
        <th scope="row">Müşteri Kullanıcı Adı</th>
        <th scope="row">Müşteri Adres</th>
        <th scope="row">Güncelle</th>
        <th scope="row">Sil</th>
        </thead>
        <tbody>
        <c:forEach items="${musteriList}" var="musteri" >
            <tr>
                <td>${musteri.id}</td>
                <td>${musteri.iller.iladi}</td>
                <td>${musteri.musterino}</td>
                <td>${musteri.tckimlikno}</td>
                <td>${musteri.ad} ${musteri.soyad}</td>
                <td>${musteri.sifre}</td>
                <td>${musteri.kullaniciadi}</td>
                <td>${musteri.adres}</td>


                <td>

                    <spring:url value="/musteri/editMusteri/${musteri.id}" var="editURL" />
                    <a class="btn btn-warning" href="${editURL}" role="button" >Güncelle</a>

                </td>

                <td>
                    <spring:url value="/musteri/deleteMusteri/${musteri.id}" var="deleteURL" />
                    <a class="btn btn-danger" href="${deleteURL}" role="button" >Sil</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <spring:url value="/musteri/addMusteri/" var="addURL" />
    <a class="btn btn-success" href="${addURL}" role="button" >Müşteri Ekle</a>
</div>
</body>

