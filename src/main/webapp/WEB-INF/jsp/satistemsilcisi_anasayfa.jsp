
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>satistemsilcisianasayfa List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        @import url('https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css');
        @media(min-width:768px) {
            body {
                margin-top: 50px;
            }
            /*html, body, #wrapper, #page-wrapper {height: 100%; overflow: hidden;}*/
        }

        #wrapper {
            padding-left: 0;
        }

        #page-wrapper {
            width: 100%;
            padding: 0;
            background-color: #fff;
        }

        @media(min-width:768px) {
            #wrapper {
                padding-left: 225px;
            }

            #page-wrapper {
                padding: 22px 10px;
            }
        }

        /* Top Navigation */

        .top-nav {
            padding: 0 15px;
        }

        .top-nav>li {
            display: inline-block;
            float: left;
        }

        .top-nav>li>a {
            padding-top: 20px;
            padding-bottom: 20px;
            line-height: 20px;
            color: #fff;
        }

        .top-nav>li>a:hover,
        .top-nav>li>a:focus,
        .top-nav>.open>a,
        .top-nav>.open>a:hover,
        .top-nav>.open>a:focus {
            color: #fff;
            background-color: #1a242f;
        }

        .top-nav>.open>.dropdown-menu {
            float: left;
            position: absolute;
            margin-top: 0;
            /*border: 1px solid rgba(0,0,0,.15);*/
            border-top-left-radius: 0;
            border-top-right-radius: 0;
            background-color: #fff;
            -webkit-box-shadow: 0 6px 12px rgba(0,0,0,.175);
            box-shadow: 0 6px 12px rgba(0,0,0,.175);
        }

        .top-nav>.open>.dropdown-menu>li>a {
            white-space: normal;
        }

        /* Side Navigation */

        @media(min-width:768px) {
            .side-nav {
                position: fixed;
                top: 60px;
                left: 225px;
                width: 225px;
                margin-left: -225px;
                border: none;
                border-radius: 0;
                border-top: 1px rgba(0,0,0,.5) solid;
                overflow-y: auto;
                background-color: #222;
                /*background-color: #5A6B7D;*/
                bottom: 0;
                overflow-x: hidden;
                padding-bottom: 40px;
            }

            .side-nav>li>a {
                width: 225px;
                border-bottom: 1px rgba(0,0,0,.3) solid;
            }

            .side-nav li a:hover,
            .side-nav li a:focus {
                outline: none;
                background-color: #1a242f !important;
            }
        }

        .side-nav>li>ul {
            padding: 0;
            border-bottom: 1px rgba(0,0,0,.3) solid;
        }

        .side-nav>li>ul>li>a {
            display: block;
            padding: 10px 15px 10px 38px;
            text-decoration: none;
            /*color: #999;*/
            color: #fff;
        }

        .side-nav>li>ul>li>a:hover {
            color: #fff;
        }

        .navbar .nav > li > a > .label {
            -webkit-border-radius: 50%;
            -moz-border-radius: 50%;
            border-radius: 50%;
            position: absolute;
            top: 14px;
            right: 6px;
            font-size: 10px;
            font-weight: normal;
            min-width: 15px;
            min-height: 15px;
            line-height: 1.0em;
            text-align: center;
            padding: 2px;
        }

        .navbar .nav > li > a:hover > .label {
            top: 10px;
        }

        .navbar-brand {
            padding: 5px 15px;
        }
    </style>

</head>
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
            <li  class="active"><a href="/satistemsilcisi/list">Satış Temsilcisi Ekranı </a></li>
        </ul>
    </div>
</nav>

<center><h1 style= "background-color: darksalmon;">HOŞGELDİNİZ</h1> </center>
<div class="tenor-gif-embed" data-postid="19751076" data-share-method="host" data-width="30%" data-aspect-ratio="1.0897155361050328"><a href="https://tenor.com/view/raf-rafs-rafsdesign-rafs84-sign-gif-19751076">Raf Rafs GIF</a> from <a href="https://tenor.com/search/raf-gifs">Raf GIFs</a></div><script type="text/javascript" async src="https://tenor.com/embed.js"></script>


</body>
</html>