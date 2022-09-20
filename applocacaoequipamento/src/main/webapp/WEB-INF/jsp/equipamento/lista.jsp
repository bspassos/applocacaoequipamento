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



        <h3>Equipamento</h3>

        <ul>
            <li><a href="/desktop/lista">Desktop</a></li>
            <li><a href="/impressora/lista">Impressora</a></li>
            <li><a href="/monitor/lista">Monitor</a></li>
        </ul>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Mensalidade</th>
                <th>Código</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="i" items="${listagem}">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.nome}</td>
                    <td>${i.mensalidade}</td>
                    <td>${i.codigo}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


    </div>
</body>
</html>
