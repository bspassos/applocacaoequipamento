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

        <h3>Usuários</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Senha</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="u" items="${listagem}">
                <tr>
                    <td>${u.nome}</td>
                    <td>${u.email}</td>
                    <td>${u.senha}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


    </div>
</body>
</html>
