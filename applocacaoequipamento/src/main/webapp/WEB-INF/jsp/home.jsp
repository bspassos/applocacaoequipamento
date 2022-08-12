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
        <h2>AppLocacaoEquipamento</h2>
        <p>Projeto de Gestão de Locação de Equipamentos</p>

        <h3>Classe: Locação</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>descricao</td>
                <td>String</td>
                <td>Descrição da locação</td>
            </tr>
            <tr>
                <td>data</td>
                <td>LocalDateTime</td>
                <td>Data de inicio da locação</td>
            </tr>
            <tr>
                <td>meses</td>
                <td>int</td>
                <td>Quantidade de meses de duração da locação</td>
            </tr>
            </tbody>
        </table>

        <h3>Classe: Cliente</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>nome</td>
                <td>String</td>
                <td>Nome do cliente</td>
            </tr>
            <tr>
                <td>cpf</td>
                <td>String</td>
                <td>Cpf do cliente</td>
            </tr>
            <tr>
                <td>email</td>
                <td>String</td>
                <td>E-mail do cliente</td>
            </tr>
            </tbody>
        </table>

        <h3>Classe: Equipamento</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>nome</td>
                <td>String</td>
                <td>Nome do equipamento</td>
            </tr>
            <tr>
                <td>mensalidade</td>
                <td>float</td>
                <td>Valor da mensalidade do equipamento</td>
            </tr>
            <tr>
                <td>codigo</td>
                <td>int</td>
                <td>Código do equipamento</td>
            </tr>
            </tbody>
        </table>

        <h3>Classe: Desktop</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>processador</td>
                <td>String</td>
                <td>Informações do processador do desktop</td>
            </tr>
            <tr>
                <td>memoria</td>
                <td>int</td>
                <td>Quantidade de memória ram em GB</td>
            </tr>
            <tr>
                <td>hd</td>
                <td>String</td>
                <td>Tamanho do HD em GB ou TB</td>
            </tr>
            </tbody>
        </table>

        <h3>Classe: Monitor</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>tela</td>
                <td>float</td>
                <td>Tamanho da tela em polegadas</td>
            </tr>
            <tr>
                <td>resolucao</td>
                <td>String</td>
                <td>Resolução do monitor</td>
            </tr>
            <tr>
                <td>portas</td>
                <td>String</td>
                <td>Portas de entrada do monitor</td>
            </tr>
            </tbody>
        </table>

        <h3>Classe: Impressora</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Atributo</th>
                <th>Tipo</th>
                <th>Descrição</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>tipo</td>
                <td>String</td>
                <td>Tipo da Impressora</td>
            </tr>
            <tr>
                <td>marca</td>
                <td>String</td>
                <td>Marca da Impressora</td>
            </tr>
            <tr>
                <td>tanqueDeTinta</td>
                <td>boolean</td>
                <td>Se a impressora possui tanque de tinta</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
