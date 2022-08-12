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
                <th>Tipo</th>
                <th>Marca</th>
                <th>Tanque de Tinta</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi</td>
                <td>30</td>
                <td>4</td>
                <td>Deskjet</td>
                <td>HP</td>
                <td>Não</td>
            </tr>
            <tr>
                <td>Impressora multifuncional deskjet tanque hp 416</td>
                <td>60</td>
                <td>5</td>
                <td>Deskjet</td>
                <td>HP</td>
                <td>Sim</td>
            </tr>
            <tr>
                <td>Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4</td>
                <td>400</td>
                <td>6</td>
                <td>Laser</td>
                <td>Xerox</td>
                <td>Não</td>
            </tr>
            </tbody>
        </table>


    </div>
</body>
</html>
