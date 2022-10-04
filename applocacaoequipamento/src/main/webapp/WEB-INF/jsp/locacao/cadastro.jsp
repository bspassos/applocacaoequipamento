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

    <c:set var="ativaBotao" value="" />

    <c:import url="/WEB-INF/jsp/menu.jsp"/>

    <div class="container mt-3">
        <h2>Cadastramento de Locações</h2>
        <form action="/locacao/incluir" method="post">


            <div class="mb-3 mt-3">
                <label for="descricao">Descrição:</label>
                <input type="text" class="form-control" id="descricao" placeholder="Entre com o descricao da locação" value="Primeira locação" name="descricao">
            </div>

            <div class="mb-3 mt-3">
                <label for="meses">Meses:</label>
                <input type="number" class="form-control" id="meses" placeholder="Entre com a quantidade de meses da locação" name="meses" min="1" value="1">
            </div>

            <div class="mb-3 mt-3">
                <c:if test="${not empty clientes}">
                    <label>Cliente</label>
                    <select name="cliente" class="form-control" id="sel1">
                        <c:forEach var="c" items="${clientes}">
                            <option value="${c.id}">${c.nome}</option>
                        </c:forEach>
                    </select>
                </c:if>
                <c:if test="${empty clientes}">
                    <label>Não existem clientes cadastrados!!!</label>
                    <c:set var="ativaBotao" value="disabled" />
                </c:if>
            </div>

            <div class="mb-3 mt-3">
                <c:if test="${not empty equipamentos}">
                    <label>Equipamentos</label>
                    <c:forEach var="e" items="${equipamentos}">
                        <div class="checkbox">
                            <label><input type="checkbox" name="equipamentos" value="${e.id}"> ${e.nome}</label>
                        </div>
                    </c:forEach>
                </c:if>
                <c:if test="${empty equipamentos}">
                    <label>Não existem equipamentos cadastrados!!!</label>
                    <c:set var="ativaBotao" value="disabled" />
                </c:if>
            </div>

            <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
    </div>
</body>
</html>
