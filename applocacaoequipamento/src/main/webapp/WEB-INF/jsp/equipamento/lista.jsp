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

    <c:import url="/WEB-INF/jsp/menu.jsp"/>

    <div class="container mt-3">



        <h3>Equipamento</h3>

        <ul>
            <li><a href="/desktop/lista">Desktop</a></li>
            <li><a href="/impressora/lista">Impressora</a></li>
            <li><a href="/monitor/lista">Monitor</a></li>
        </ul>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Mensalidade</th>
                <th>Código</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Desktop Dell Workstation Precision 3460</td>
                    <td>250</td>
                    <td>1</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Desktop Dell Workstation Precision 3660</td>
                    <td>350</td>
                    <td>2</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>Desktop Dell XPS 8950</td>
                    <td>480</td>
                    <td>3</td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi</td>
                    <td>30</td>
                    <td>4</td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>Impressora multifuncional deskjet tanque hp 416</td>
                    <td>60</td>
                    <td>5</td>
                </tr>
                <tr>
                    <td>6</td>
                    <td>Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4</td>
                    <td>400</td>
                    <td>6</td>
                </tr>
                <tr>
                    <td>7</td>
                    <td>Monitor Dell 18.5" E1920H</td>
                    <td>100</td>
                    <td>7</td>
                </tr>
                <tr>
                    <td>8</td>
                    <td>Monitor Dell de 21.5" SE2222H</td>
                    <td>180</td>
                    <td>8</td>
                </tr>
                <tr>
                    <td>9</td>
                    <td>Monitor 23" Dell P2319H</td>
                    <td>250</td>
                    <td>9</td>
                </tr>
            </tbody>
        </table>


    </div>
</body>
</html>
