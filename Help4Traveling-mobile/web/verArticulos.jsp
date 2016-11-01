<%-- 
    Document   : verArticulos
    Created on : 30/10/2016, 11:45:45 AM
    Author     : Agustin
--%>

<%@page import="Model.ModelArticulo"%>
<%@page import="servidor.DtPromocion"%>
<%@page import="servidor.DtServicio"%>
<%@page import="java.util.ArrayList"%>
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

        <%
            //ArrayList<DtServicio> s = (ArrayList<DtServicio>) request.getAttribute("listaServicios");
            //ArrayList<DtPromocion> p = (ArrayList<DtPromocion>) request.getAttribute("listaPromociones");
            ArrayList<DtServicio> s = ModelArticulo.getInstance().listarServiciosXprov(request.getSession().getAttribute("usuario_logueado").toString());
            ArrayList<DtPromocion> p = ModelArticulo.getInstance().listarPromocionesXprov(request.getSession().getAttribute("usuario_logueado").toString());
        %>

        <div class="col-xs-12" style="margin-top: 50px">
            <div class="row bg-primary" style="height: 32px">
                <div class="col-xs-6">
                    <button style="width: 100%; height: 100%; font-family: Helvetica; border-style: none"
                            class="btn btn-primary">SERVICIOS</button>
                </div>
                <div class="col-xs-6">
                    <button style="width: 100%; height: 100%; font-family: Helvetica; border-style: none"
                            class="btn btn-primary" onclick="listarPromociones()">PROMOCIONES</button>
                </div>
            </div>
            <!-- COMIENZO SECCION PARA PANELES CON ARTICULOS DE MIERDA --> 
            <div class="panel-group" id="paneles">

                <%   for (int x = 0; x < s.size(); x++) {%>

                <!-- SECCION A TENER POR CADA SERVICIO -->
                <div class="panel panel-success" id="<%="serv" + (x + 1)%>">
                    <div class="panel-heading btn" data-toggle="collapse" data-target="#<%="bodyServ" + (x + 1)%>" style="color: #333333; font-family: Helvetica; font-size: 115%; width: 100%; text-align: left"><%= s.get(x).getNombre()%></div>
                    <h4 style="position: absolute; right: 30px; margin-top: -30px; font-family: Helvetica; color: #212121"><%= s.get(x).getPrecio().toString()%></h4>
                    <div class="panel-body collapse" id="<%="bodyServ" + (x + 1)%>">
                        <div class="row">
                            <div class="col-xs-12" style="max-height: 100px; overflow-y: auto">
                                <% if (s.get(x).getDescripcion() != null && !s.get(x).getDescripcion().isEmpty()) {%>
                                <h4 style="font-family: Helvetica; color: #212121"><%= s.get(x).getDescripcion()%></h4>
                                <% } else { %>
                                <h4 style="font-family: Helvetica; color: #212121">Sin descripcion...</h4>
                                <% }%>
                            </div>
                        </div>
                        <div class="row">
                            <!-- INICIO CARRUSEL DE IMAGENES DEL SERVICIO -->
                            <center>
                                <div class="col-xs-12">
                                    <div id="<%="imgServ" + (x + 1)%>" class="carousel slide" data-ride="carousel" style="width: 90%; max-width: 400px; height: 250px; margin-top: 5px">
                                        <ol class="carousel-indicators">
                                            <li data-target="#<%="imgServ" + (x + 1)%>" data-slide-to="0" class="active"></li>
                                            <li data-target="#<%="imgServ" + (x + 1)%>" data-slide-to="1"></li>
                                            <li data-target="#<%="imgServ" + (x + 1)%>" data-slide-to="2"></li>
                                        </ol>
                                        <div class="carousel-inner" role="listbox">
                                            <div class="item active">
                                                <img src="devolverImagen?nickP=<%=s.get(x).getNickProveedor()%>&nomA=<%=s.get(x).getNombre()%>&campo=3" style="height: 250px" class="img-responsive img-thumbnail">
                                            </div>
                                            <div class="item">
                                                <img src="devolverImagen?nickP=<%=s.get(x).getNickProveedor()%>&nomA=<%=s.get(x).getNombre()%>&campo=3" style="height: 250px" class="img-responsive img-thumbnail">
                                            </div>
                                            <div class="item">
                                                <img src="devolverImagen?nickP=<%=s.get(x).getNickProveedor()%>&nomA=<%=s.get(x).getNombre()%>&campo=3" style="height: 250px" class="img-responsive img-thumbnail">
                                            </div>
                                        </div>
                                        <a class="left carousel-control" href="#<%="imgServ" + (x + 1)%>" role="button" data-slide="prev">
                                            <span aria-hidden="true" style="font-family: Helvetica; font-style: italic; font-size: 26px">&lt;</span>
                                        </a>
                                        <a class="right carousel-control" href="#<%="imgServ" + (x + 1)%>" role="button" data-slide="next">
                                            <span aria-hidden="true" style="font-family: Helvetica; font-style: italic; font-size: 26px">&gt;</span>
                                        </a>
                                    </div>
                                </div>
                            </center>
                            <!-- FIN CARRUSEL DE IMAGENES -->
                        </div>
                    </div>
                </div>

                <% } %>

                <%   for (int x = 0; x < p.size(); x++) {%>

                <div class="panel panel-success">
                    <div class="panel-heading btn" style="color: #333333; font-family: Helvetica; font-size: 115%; width: 100%; text-align: left"
                         data-toggle="collapse" data-target="#body"><%= p.get(x).getNombre() %></div>
                    <h4 style="position: absolute; right: 30px; margin-top: -30px; font-family: Helvetica; color: #212121"><%= p.get(x).getPrecio() %></h4>
                    <div class="panel-body collapse" id="body">
                        <div class="row">
                            <div class="col-xs-12" style="max-height: 100px; overflow-y: auto">
                                <h5 style="font-family: Helvetica; color: #212121; margin-top: 0px">
                                    <b><%= p.get(x).getDescuento() %> % descuento.</b>
                                </h5>
                            </div>
                        </div>
                        <div class="row">
                            <center>
                                <div class="col-xs-12">
                                    <div class="row bg-info" style="border-left-style: solid; border-color: #01529e; border-width: 4px">
                                        <div class="col-xs-12">
                                            <h5 style="font-family: Helvetica; text-align: left">Servicios asociados</h5>
                                        </div>
                                    </div>
                                    
                                    <%   for(int e = 0; e < p.get(x).getServicios().size(); e++ ){   %>
                                    
                                    <!-- FILA A TENER POR CADA SERVICIO ASOCIADO A LA PROMO -->
                                    <div class="row" style="border-left-style: solid; border-color: #01529e; border-width: 4px">
                                        <div class="col-xs-12" style="border-bottom-style: solid; border-color: #01529e; border-width: 1px">
                                            <h5 style="font-family: Helvetica; text-align: left"><%= p.get(x).getServicios().get(e) %></h5>
                                        </div>
                                        <!-- FIN FILA A TENER POR CADA SERVICIO ASOCIADO -->
                                    </div>
                                
                                    <%   }   %>
                                
                                </div>
                            </center>
                        </div>
                    </div>
                </div>

                <% }%>

            </div>
    </body></html>