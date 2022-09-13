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
        <h2>Cadastramento de Desktops</h2>
        <form action="/desktop/incluir" method="post">

            <c:import url="/WEB-INF/jsp/equipamento/cadastro.jsp"/>

            <div class="mb-3 mt-3">
                <label for="processador">Processador:</label>
                <input type="text" class="form-control" id="processador" placeholder="Entre com o processador do equipamento" name="processador">
            </div>

            <div class="mb-3 mt-3">
                <label for="memoria">Memória:</label>
                <input type="number" class="form-control" id="memoria" placeholder="Entre com a memória do equipamento" name="memoria" min="8" step="2">
            </div>

            <div class="mb-3 mt-3">
                <label for="hd">HD:</label>
                <input type="hd" class="form-control" id="hd" placeholder="Entre com o hd do equipamento" name="hd">
            </div>


            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</body>
</html>
