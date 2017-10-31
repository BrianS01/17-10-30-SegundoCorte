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
        <link rel="stylesheet" href="loginStyle.css">
        <link rel="stylesheet" href="loginAnimate.css">
        <link rel="shortcut icon" href="images/VLCicono.ico">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
        <title>VLC - Ingreso</title>
    </head>
    <body>
        <div class="container">
            <div class="top">
                <h1 id="title" class="hidden"><span id="logo">VLC <span>LTDA!</span></span></h1>
            </div>
            <div class="login-box animated fadeInUp">
                <div class="box-header">
                    <h2>ENTRAR</h2>
                </div>
                <label for="username">Nombre</label>
                <br/>
                <input type="text" id="username">
                <br/>
                <label for="password">Contraseña</label>
                <br/>
                <input type="password" id="password">
                <br/>
                <button type="submit">INGRESAR</button>
                <br/>
                <a href="#">
                    <p class="small">Olvido su contraseña</p>
                    <p class="small">Contacte al administrador del servicio</p>
                </a>
            </div>
        </div>
                <form method="post" action="MySQLConnect">        
        Username :<input type="text" name="user" /><br/><br/>
        Password :<input type="password" name="pass" /><br/><br/>
        <input type="submit" value="Login" />
        </form>
    </body>
</html>