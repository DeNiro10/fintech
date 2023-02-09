<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastre-se</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>
<div class="container">
	<h1>Cadastre-se</h1>
	<form action="conta" method="post">
		<div class="form-group">
			<label for="id-nome">Nome Completo</label>
			<input type="text" name="nome" id="id-nome" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-email">E-mail</label>
				<input type="text" name="nome" id="id-email" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-celular">Celular</label>
				<input type="number" name="celular" id="id-celular" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-dtnasc">Data Nascimento</label>
				<input type="number" name="dtnasc" id="id-dtnasc" class="form-control">
			</div>	
				<div class="form-group">
				<label for="id-cpf">CPF</label>
				<input type="number" name="cpf" id="id-cpf" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-senha">Senha</label>
				<input type="password" name="Senha" id="id-senha" class="form-control">
			</div>
			<input type="submit" value="Cadastrar" class="btn btn-primary">				
		</form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>