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

        <h3>Impressora</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Nome</th>
                <th>Mensalidade</th>
                <th>Código</th>
                <th>Tela</th>
                <th>Resolução</th>
                <th>Portas</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>7</td>
                <td>Monitor Dell 18.5" E1920H</td>
                <td>100,00</td>
                <td>18.5f</td>
                <td>1920x1080</td>
                <td>HDMI e VGA</td>
            </tr>
            <tr>
                <td>Monitor Dell de 21.5" SE2222H</td>
                <td>180,00</td>
                <td>8</td>
                <td>21.5"</td>
                <td>1920x1080</td>
                <td>HDMI e VGA</td>
            </tr>
            <tr>
                <td>Monitor 23" Dell P2319H</td>
                <td>250,00</td>
                <td>9</td>
                <td>23</td>
                <td>1920x1080</td>
                <td>DisplayPort, VGA e HDMI</td>
            </tr>
            </tbody>
        </table>


    </div>
</body>
</html>
