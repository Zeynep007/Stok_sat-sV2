<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Musteri Giris</title>
    <style>
        .login-container{
            margin-top: 5%;
            margin-bottom: 5%;
        }
        .login-form-1{
            padding: 5%;
            box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.40);
        }
        .login-form-1 h1{
            text-align: center;
            color: #333;
        }

        .login-form-2 h3{
            text-align: center;
            color: #fff;
        }
        .login-container form{
            padding: 10%;
        }
        .btnSubmit
        {
            width: 50%;
            border-radius: 1rem;
            padding: 1.5%;
            border: none;
            cursor: pointer;
        }
        .login-form-1 .btnSubmit{
            font-weight: 900;
            color: #fff;
            background-color: darksalmon;
        }
        .login-form-2 .btnSubmit{
            font-weight: 900;
            color: darksalmon;
            background-color: #fff;
        }

        .login-form-1 {
            color: darksalmon;
            font-weight: 700;
            text-decoration: none;
        }
    </style>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body background="https://polonya.co/wp-content/uploads/2020/12/shopping-shannon-springs-2.jpg">
<div class="container login-container">
    <div class="row">
        <div class="col-md-12 login-form-1">
            <spring:url value="/satistemsilcisi_login_list" var="editURL" />
            <a class="btn btn-danger" href="${editURL}" role="button" >Satış Temsilcisi Giriş</a>

            <br/>

            <h1 >MÜŞTERİ GİRİŞ</h1>
            <spring:url value="/musteri/musteri/" var="loginURL" />
            <form:form modelAttribute="musteri" method="post" action="${loginURL}" cssClass="form" >

                <div class="form-group">
                    <input type="text" name="kullaniciadi" class="form-control" placeholder="Kullanıcı Adı" value="" />
                </div>
                <div class="form-group">
                    <input type="password" name="sifre" class="form-control" placeholder="Şifre" value="" />
                </div>
                <div class="form-group">
                    <input type="submit" class="btnSubmit" value="GİRİŞ" style="width: 100%"/>
                </div>
            </form:form>


        </div>
    </div>
</div>
</body>
</html>