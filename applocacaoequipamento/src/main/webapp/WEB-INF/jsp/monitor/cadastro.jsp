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
        <h2>Cadastramento de Monitores</h2>
        <form action="/monitor/incluir" method="post">

            <c:import url="/WEB-INF/jsp/equipamento/cadastro.jsp"/>

            <div class="mb-3 mt-3">
                <label for="tela">Tela:</label>
                <input type="text" class="form-control" id="tela" placeholder="Entre com o tela do equipamento" name="tela">
            </div>

            <div class="mb-3 mt-3">
                <label for="resolucao">Resolução:</label>
                <input type="text" class="form-control" id="resolucao" placeholder="Entre com a resolucao do equipamento" name="resolucao">
            </div>

            <div class="mb-3 mt-3">
                <label for="portas">Portas:</label>
                <input type="portas" class="form-control" id="portas" placeholder="Entre com o portas do equipamento" name="portas">
            </div>


            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</body>
</html>
