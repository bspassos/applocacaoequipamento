<%--
  Created by IntelliJ IDEA.
  User: ironman
  Date: 05/08/2022
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AppLocacaoEquipamento</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <c:import url="/WEB-INF/jsp/menu.jsp"/>

    <div class="container mt-3">
        <h2>Cadastramento de Impressoras</h2>
        <form action="/impressora/incluir" method="post">

            <c:import url="/WEB-INF/jsp/equipamento/cadastro.jsp"/>

            <div class="mb-3 mt-3">
                <label for="tipo">Tipo:</label>
                <input type="text" class="form-control" id="tipo" placeholder="Entre com o tipo do equipamento" name="tipo">
            </div>

            <div class="mb-3 mt-3">
                <label for="marca">Marca:</label>
                <input type="text" class="form-control" id="marca" placeholder="Entre com a marca do equipamento" name="marca">
            </div>

            <div class="mb-3 mt-3">
                <label>Tanque de tinta:</label>
                <label class="radio-inline">
                    <input type="radio" name="tanqueDeTinta" value="true" checked> Sim
                </label>
                <label class="radio-inline">
                    <input type="radio" name="tanqueDeTinta" value="false"> Não
                </label>
            </div>


            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</body>
</html>
