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

        <h3>Locação</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Descrição</th>
                <th>Data</th>
                <th>Meses</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Locação 1</td>
                <td>15/07/2022 às 09:00</td>
                <td>3</td>
            </tr>
            <tr>
                <td>Locação 2</td>
                <td>05/08/2022 às 16:00</td>
                <td>6</td>
            </tr>
            <tr>
                <td>Locação 3</td>
                <td>10/08/2022 às 15:00</td>
                <td>12</td>
            </tr>
            </tbody>
        </table>


    </div>
</body>
</html>
