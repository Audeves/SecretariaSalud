<%-- 
    Document   : consultaExpediente
    Created on : 3/04/2022, 10:14:54 PM
    Author     : l3tal
--%>

<%@page import="com.example.demo.entidades.Habitante"%>
<%@page import="com.example.demo.entidades.Expediente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Habitante expedienteAux = (Habitante) session.getAttribute("id_expediente");
    System.out.println("jsp: ");
    System.out.println(expedienteAux);

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Expediente</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1 id="titulo">Consultar expediente</h1>
        <div class="informaicon" id="divInfo">

            <div id="divIzquierda" class="caja1">
                <h3>Datos personales</h3>
                <div id="divDaosPersonales">

                    <%out.print("<label>Nombre: "
                                + expedienteAux.getNombre()
                                + "</label><br/><br/>");%>
                                
                    <%out.print("<label>Expediente: "
                                + expedienteAux.getIdExpediente().getInformacionGeneral()
                                + "</label><br/><br/>");%>

                    <%out.print("<label>Direccion: "
                                + expedienteAux.getDireccion()
                                + "</label><br/><br/>");%>
                                    
                </div>
                <h3>Consultas medicas</h3>
                <div>
                    <table id="tablaConsultas">
                        <tr>
                            <td>Dr. Isaac Segoviano</td>
                            <td>Hospital Buenavista</td>
                        </tr>
                        <tr>
                            <td>02/04/2022</td>
                            <td>Dra. Juan</td>
                            <td>Hospital Sonora</td>
                        </tr>
                        <tr>
                            <td>04/04/2022</td>
                            <td>Dr. Martinez</td>
                            <td>Hospital San Jose</td>
                        </tr>
                    </table>
                </div>
            </div>

            <div id="divDerecha" class="caja2">
                <h3>Cita medica</h3>
                <div>

                </div>
            </div>

        </div>
    </body>
</html>
