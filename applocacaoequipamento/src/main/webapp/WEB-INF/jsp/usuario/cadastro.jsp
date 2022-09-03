<%--
  Created by IntelliJ IDEA.
  User: ironman
  Date: 05/08/2022
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
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
        <h2>Cadastramento de Usuários</h2>
        <form action="/usuario/incluir" method="post">
            <div class="mb-3 mt-3">
                <label for="nome">Nome:</label>
                <input type="text" class="form-control" id="nome" placeholder="Entre com o seu nome" name="nome">
            </div>

            <div class="mb-3 mt-3">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Entre com o seu email" name="email">
            </div>

            <div class="mb-3">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd" placeholder="Entre com a sua senha" name="senha">
            </div>

            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</body>
</html>
