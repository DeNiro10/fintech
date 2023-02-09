<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastra Suas Transações</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>
<div class="container">
	<h1>Cadastre-se</h1>
	<form action="conta" method="post">
		<div class="form-group">
			<label for="id-codigo">Código</label>
			<input type="number" name="nome" id="id-codigo" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-tipo">Tipo</label>
				<input type="text" name="nome" id="id-tipo" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-valor">Valor</label>
				<input type="number" name="valor" id="id-valor" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-dtnasc">Data Transação</label>
				<input type="number" name="dtTransacao" id="id-dtTransacao" class="form-control">
			</div>	
				<input type="submit" value="Cadastrar" class="btn btn-primary">				
		</form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>