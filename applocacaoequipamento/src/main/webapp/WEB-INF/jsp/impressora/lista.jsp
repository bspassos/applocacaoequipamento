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

        <c:if test="${not empty mensagem}">
            <div class="alert ${tipo}">
                <strong>Informação</strong> ${mensagem}
            </div>
        </c:if>

        <h3>Impressora</h3>

        <a class="btn btn-primary" href="/impressora">Novo</a>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Mensalidade</th>
                <th>Código</th>
                <th>Tipo</th>
                <th>Marca</th>
                <th>Tanque de Tinta</th>
                <th>&nbsp;</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="i" items="${listagem}">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.nome}</td>
                    <td>${i.mensalidade}</td>
                    <td>${i.codigo}</td>
                    <td>${i.tipo}</td>
                    <td>${i.marca}</td>
                    <td>${i.tanqueDeTinta}</td>
                    <td><a href="/impressora/${i.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


    </div>
</body>
</html>
