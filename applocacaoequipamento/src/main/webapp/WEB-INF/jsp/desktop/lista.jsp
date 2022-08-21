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

    <nav class="navbar navbar-expand-sm bg-info navbar-dark">
        <div class="container-fluid">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/desktop/lista">Desktop</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/impressora/lista">Impressora</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/monitor/lista">Monitor</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/equipamento/lista">Equipamento</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/cliente/lista">Cliente</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/locacao/lista">Locação</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container mt-3">

        <h3>Desktop</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Mensalidade</th>
                <th>Código</th>
                <th>Processador</th>
                <th>Memória</th>
                <th>HD</th>
                <th>&nbsp;</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="d" items="${listagem}">
                <tr>
                    <td>${d.id}</td>
                    <td>${d.nome}</td>
                    <td>${d.mensalidade}</td>
                    <td>${d.codigo}</td>
                    <td>${d.processador}</td>
                    <td>${d.memoria}</td>
                    <td>${d.hd}</td>
                    <td><a href="/desktop/${d.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


    </div>
</body>
</html>
