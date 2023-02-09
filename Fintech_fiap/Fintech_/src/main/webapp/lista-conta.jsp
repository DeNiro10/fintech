<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
	<div class="container">
	<h1>Conta</h1>
	<table class="table table-strped">
		<tr>
			<th>Nome da Conta</th>
			<th>Numero da Conta</th>
			<th>CPF</th>
			<th>Saldo</th>
			<th>Investimento</th>
		</tr>
		<c:forEach items="{conta}" var="p">
		<tr>
		<td>${p.nome }</td>
		<td>${p.numero }</td>
		<td>${p.cpf }</td>
		<td>${p.saldo }</td>
		<td>${p.investimento}</td>
		</c:forEach>
			
	</table>
	</div>
<%@ include file="footer.jsp" %>
</body>
</html>