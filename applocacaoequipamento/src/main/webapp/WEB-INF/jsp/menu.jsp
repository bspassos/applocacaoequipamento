<%--
Created by IntelliJ IDEA.
User: ironman
Date: 05/08/2022
Time: 12:43
To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<nav class="navbar navbar-expand-sm bg-info navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active" href="/">Home</a>
            </li>
            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/usuario/lista">Usuário</a>
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
            </c:if>

        </ul>

        <ul class="navbar-nav">
            <c:if test="${empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/usuario">Signup</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/login">Login</a>
                </li>
            </c:if>

            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/logout">Logout, ${user.nome}</a>
                </li>
            </c:if>
        </ul>
    </div>
</nav>
