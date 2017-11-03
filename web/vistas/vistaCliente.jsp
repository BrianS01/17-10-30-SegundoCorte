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
        <link rel="stylesheet" href="inicioStyles.css">
        <link rel="shortcut icon" href="images/VLCicono.ico">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="script.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
        <link rel="stylesheet" href="vistaStyle.css">
        <title>VLC Ltda!</title>
    </head>
    <body>
        <div id='cssmenu'>
            <ul>
                <li class='active'><a href='vistas/inicio.jsp'><span>Inicio</span></a></li>
                <li><a href='vistas/vistaCliente.jsp'><span>Clientes</span></a></li>
                <li><a href='vistas/vistaEmpleado.jsp'><span>Empleados</span></a></li>
                <li><a href='vistas/vistaCotizacion.jsp'><span>Cotizacion</span></a></li>
                <li class='last'><a href='vistas/vistaFactura.jsp'><span>Factura</span></a></li>
                <li class='active'><a href='index.html'><span>Salir</span></a></li>
            </ul>
        </div>
        <div class="container">
            <form>
                <div class="row">
                    <h4>CLIENTES</h4>
                    <div class="input-group input-group-icon">
                        <input type="text" placeholder="Full Name"/>
                        <div class="input-icon"><i class="fa fa-user"></i></div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input type="email" placeholder="Email Adress"/>
                        <div class="input-icon"><i class="fa fa-envelope"></i></div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input type="password" placeholder="Password"/>
                        <div class="input-icon"><i class="fa fa-key"></i></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-half">
                        <h4>Date of Birth</h4>
                        <div class="input-group">
                            <div class="col-third">
                                <input type="text" placeholder="DD"/>
                            </div>
                            <div class="col-third">
                                <input type="text" placeholder="MM"/>
                            </div>
                            <div class="col-third">
                                <input type="text" placeholder="YYYY"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-half">
                        <h4>Gender</h4>
                        <div class="input-group">
                            <input type="radio" name="gender" value="male" id="gender-male"/>
                            <label for="gender-male">Male</label>
                            <input type="radio" name="gender" value="female" id="gender-female"/>
                            <label for="gender-female">Female</label>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <h4>Payment Details</h4>
                    <div class="input-group">
                        <input type="radio" name="payment-method" value="card" id="payment-method-card" checked="true"/>
                        <label for="payment-method-card"><span><i class="fa fa-cc-visa"></i>Credit Card</span></label>
                        <input type="radio" name="payment-method" value="paypal" id="payment-method-paypal"/>
                        <label for="payment-method-paypal"> <span><i class="fa fa-cc-paypal"></i>Paypal</span></label>
                    </div>
                    <div class="input-group input-group-icon">
                        <input type="text" placeholder="Card Number"/>
                        <div class="input-icon"><i class="fa fa-credit-card"></i></div>
                    </div>
                    <div class="col-half">
                        <div class="input-group input-group-icon">
                            <input type="text" placeholder="Card CVC"/>
                            <div class="input-icon"><i class="fa fa-user"></i></div>
                        </div>
                    </div>
                    <div class="col-half">
                        <div class="input-group">
                            <select>
                                <option>01 Jan</option>
                                <option>02 Jan</option>
                            </select>
                            <select>
                                <option>2015</option>
                                <option>2016</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <h4>Terms and Conditions</h4>
                    <div class="input-group">
                        <input type="checkbox" id="terms"/>
                        <label for="terms">I accept the terms and conditions for signing up to this service, and hereby confirm I have read the privacy policy.</label>
                    </div>
                </div>
            </form>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script  src="js/index.js"></script>
        <footer>
            Copyright © 2017 - VLC Ltda - Todos los derechos reservados.
        </footer>
    </body>
</html>
