<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Transacao" method= "POST">
<%@ include file="menu.jsp" %>
	<div class="container">
	<h1>Conta</h1>
	<table class="table table-strped">
		<tr>
			<th>Tipo</th>
			<th>C�digo</th>
			<th>Valor</th>
			<th>Data da Transa��o</th>
			<th></th>
		</tr>
		<c:forEach items="{conta}" var="p">
		<tr>
		<td>${p.tipo }</td>
		<td>${p.codigo }</td>
		<td>${p.valor }</td>
		<td>${p.dataTansacao}</td>
		<td>
		<fmt:formatDate value="${p.dataTansacao.time }" pattern="dd/MM/yyyy"/>
		</td>
		<td>
			<c:url value="transacao" var="link">
				<c:param name="acao" value="abrir-form-edicao"/>
				<param name="codigo" value="${p.codigo }"/>
			</c:url>
			<a href="${link}">Editar</a> 
			<a href="${link}">Remover</a>
			</td>
			</tr>	
		</c:forEach>	
	</table>
	</div>
<%@ include file="footer.jsp" %>
</form>
</body>
</html>