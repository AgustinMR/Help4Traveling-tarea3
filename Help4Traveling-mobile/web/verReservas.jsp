<%-- 
    Document   : verReservas
    Created on : 30/10/2016, 11:46:33 AM
    Author     : Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="bootstrap/jquery.min.js"></script>
    <script type="text/javascript" src="bootstrap/bootstrap.min.js"></script>
    <link href="bootstrap/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="bootstrap/bootstrap.css" rel="stylesheet" type="text/css">
  </head><body>
    <jsp:include page="header/header.jsp"/>
    <div class="col-xs-12" style="margin-top: 50px">
      <div class="row" style="background-color: #E6E6E6; height: 40px">
        <center>
          <h3 style="color: #01529e; margin-top: 5px">Mis reservas</h3>
        </center>
      </div>
      <div class="row" style="min-height: 300px">
        <!-- INICIO FILA A TENER POR CADA RESERVA HECHA AL PROV. -->
        <div class="row" style="min-height: 80px; max-height: 100px; width: 100%; margin-left: 0px">
          <div class="row" style="min-height: 40px; margin-left: 0px; background-color: #e6f8ff; width: 100%">
            <div class="col-xs-6" style="border-left-style: solid; border-width: 6px; border-color: #01529e">
              <h4 style="margin-left: 10px; margin-top: 10px; color: #333333">Nick. Cliente</h4>
            </div>
            <div class="col-xs-6" style="border-right-style: solid; border-width: 4px; border-color: #01529e">
              <h4 style="margin-left: 10px; margin-top: 10px; color: #359151; text-align: right">$ precio</h4>
            </div>
          </div>
          <div class="row" style="min-height: 40px; width: 100%; margin-left: 0px; background-color: #f4fdff">
            <div class="col-xs-3">
              <h5 style="margin-left: 10px; margin-top: 12px; color: #333333; position: absolute">Estado</h5>
            </div>
            <div class="col-xs-3">
              <h5 style="margin-left: 10px; margin-top: 12px; color: #333333; position: absolute; left: 0">Fecha crea.</h5>
            </div>
            <div class="col-xs-6">
              <button class="btn btn-info" style="height: 30px; margin-top: 5px; position: absolute; right: 5px">Ver</button>
              <!-- BOTON PARA FACTURAR SOLO VISIBLE SI ESTADO ES "PAGADA".
              DE ESA MANERA, SE REALIZA EL CASO, CAMBIAR ESTADO. -->
              <button class="btn btn-primary" style="height: 30px; margin-top: 5px; position: absolute; right: 60px">Facturar</button>
            </div>
            <!-- INICIO MODAL CON INFO_RESERVAS DE LA RESERVA -->
            <!-- FIN MODAL -->
          </div>
          <!-- FIN FILA A TENER POR CADA RESERVA HECHA AL PROV. -->
        </div>
      </div>
    </div>
</body></html>
