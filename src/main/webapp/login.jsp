<!-- 
 *  PROYECTO SEGUNDO CORTE
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daily UI - Day 1 Sign In</title>

        <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="loginAnimate.css">
        <!-- Custom Stylesheet -->
        <link rel="stylesheet" href="styl.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    </head>

    <body>
        <div class="container">
            <div class="top">
                <h1 id="title" class="hidden"><span id="logo">Daily <span>UI</span></span></h1>
            </div>
            <div class="login-box animated fadeInUp">
                <div class="box-header">
                    <h2>Log In</h2>
                </div>
                <label for="username">Username</label>
                <br/>
                <input type="text" id="username">
                <br/>
                <label for="password">Password</label>
                <br/>
                <input type="password" id="password">
                <br/>
                <button type="submit">Sign In</button>
                <br/>
                <a href="#"><p class="small">Forgot your password?</p></a>
            </div>
        </div>
    </body>
</html>