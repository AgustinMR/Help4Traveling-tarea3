<%-- 
    Document   : verArticulos
    Created on : 30/10/2016, 11:45:45 AM
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
    <div class="col-xs-12">
      <div class="row bg-primary" style="height: 40px">
        <div class="col-xs-6">
          <button style="width: 100%; height: 100%; font-family: Helvetica; border-style: none"
          class="btn btn-primary">SERVICIOS</button>
        </div>
        <div class="col-xs-6">
          <button style="width: 100%; height: 100%; font-family: Helvetica; border-style: none"
          class="btn btn-primary">PROMOCIONES</button>
        </div>
      </div>
      <!-- COMIENZO SECCION PARA PANELES CON ARTICULOS DE MIERDA -->
      <div class="panel-group">
        <!-- SECCION A TENER POR CADA ARTICULO -->
        <div class="panel panel-success">
          <div class="panel-heading" style="color: #333333; font-family: Helvetica; font-size: 115%">Nombre del articulo</div>
          <h4 style="position: absolute; right: 30px; margin-top: -30px; font-family: Helvetica; color: #212121">$$$</h4>
          <div class="panel-body">
            <div class="row">
              <div class="col-xs-12" style="max-height: 100px; overflow-y: auto">
                <h4 style="font-family: Helvetica; color: #212121">aca va la descripcion...</h4>
              </div>
            </div>
            <div class="row">
              <!-- INICIO CARRUSEL DE IMAGENES DEL SERVICIO -->
              <center>
                <div class="col-xs-12">
                  <div id="imgs" class="carousel slide" data-ride="carousel" style="width: 90%; max-width: 400px; height: 250px; margin-top: 5px">
                    <ol class="carousel-indicators">
                      <li data-target="#imgs" data-slide-to="0" class="active"></li>
                      <li data-target="#imgs" data-slide-to="1"></li>
                      <li data-target="#imgs" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                      <div class="item active">
                        <img src="logo.png" style="height: 250px" class="img-responsive img-thumbnail">
                      </div>
                      <div class="item">
                        <img src="logo.png" style="height: 250px" class="img-responsive img-thumbnail">
                      </div>
                      <div class="item">
                        <img src="logo.png" style="height: 250px" class="img-responsive img-thumbnail">
                      </div>
                    </div>
                    <a class="left carousel-control" href="#imgs" role="button" data-slide="prev">
                    <span aria-hidden="true" style="font-family: Helvetica; font-style: italic; font-size: 26px">&lt;</span>
                  </a>
                    <a class="right carousel-control" href="#imgs" role="button" data-slide="next">
                    <span aria-hidden="true" style="font-family: Helvetica; font-style: italic; font-size: 26px">&gt;</span>
                  </a>
                  </div>
                </div>
              </center>
              <!-- FIN CARRUSEL DE IMAGENES -->
            </div>
          </div>
          <!-- FIN SECCION A TENER POR CADA ARTICULO -->
        </div>
      </div>
    </div>
</body></html>