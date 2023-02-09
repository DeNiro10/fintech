<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastre sua Conta</title>
<%@ include file="header.jsp" %>
</head>
<body>
	<form action="conta" method="post">
		<div class="form-group">
			<label for="id-nome">Nome da Conta</label>
			<input type="text" name="nome" id="id-nome" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-cpf">CPF</label>
				<input type="number" name="nome" id="id-cpf" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-nunconta">Numero da Conta</label>
				<input type="number" name="numconta" id="id-nunconta" class="form-control">
			</div>	
				<div class="form-group">
				<label for="id-saldo">Saldo da Conta</label>
				<input type="number" name="saldo" id="id-saldo" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-investimento">Investimento</label>
				<input type="number" name="Investimento" id="id-investimento" class="form-control">
			</div>
			<input type="submit" value="Enviar" class="btn btn-primary">				
		</form>
<%@ include file="footer.jsp" %>
</body>
</html>
