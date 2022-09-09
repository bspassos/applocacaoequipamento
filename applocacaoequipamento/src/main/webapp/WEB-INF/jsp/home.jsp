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
        <h2>${projeto.nome}</h2>
        <p>${projeto.descricao}</p>

        <c:forEach var="c" items="${projeto.classes}">
            <h3>Classe: ${c.nome}</h3>

            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Atributo</th>
                    <th>Tipo</th>
                    <th>Descrição</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="a" items="${c.atributos}">
                <tr>
                    <td>${a.nome}</td>
                    <td>${a.tipo}</td>
                    <td>${a.descricao}</td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:forEach>


    </div>
</body>
</html>
