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
                    <a class="nav-link" href="#">Equipamento</a>
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
                <th>Nome</th>
                <th>Mensalidade</th>
                <th>Código</th>
                <th>Processador</th>
                <th>Memória</th>
                <th>HD</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Desktop Dell Workstation Precision 3460</td>
                <td>250,00</td>
                <td>1</td>
                <td>Core i3 12th</td>
                <td>8</td>
                <td>512GB</td>
            </tr>
            <tr>
                <td>Desktop Dell Workstation Precision 3660</td>
                <td>350,00</td>
                <td>2</td>
                <td>Core i5 12th</td>
                <td>16</td>
                <td>1TB</td>
            </tr>
            <tr>
                <td>Desktop Dell XPS 8950</td>
                <td>480,00</td>
                <td>3</td>
                <td>Core i7 12th</td>
                <td>32</td>
                <td>1TB</td>
            </tr>
            </tbody>
        </table>


    </div>
</body>
</html>
