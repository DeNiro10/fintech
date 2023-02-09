package br.com.fintec.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fintech.dao.TransacaoDAO;


@WebServlet("/transacao-remover")
public class TransacaoRemoverServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long codigo = Long.valueOf(request.getParameter("Codigo"));
		
		TransacaoDAO.remover(codigo);
		
		response.sendRedirect(request.getContextPath() + "/transacao-listar");
	}
}
