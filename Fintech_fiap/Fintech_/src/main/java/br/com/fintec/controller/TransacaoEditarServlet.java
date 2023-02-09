package br.com.fintec.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fintech.dao.TransacaoDAO;
import br.com.fiap.fintech.model.Transacao;

@WebServlet("/transacao-editar")
public class TransacaoEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long codigo = Long.valueOf(request.getParameter("codigo"));
		
		Transacao transacao = TransacaoDAO.buscar(codigo);

		request.setAttribute("transacao", transacao);
		
		request.getRequestDispatcher("/transacao/editar.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long codigo = Long.valueOf(request.getParameter("codigo"));
		String tipo = request.getParameter("tipo");
		String valor = request.getParameter("valor");
		String dttransacao = request.getParameter("dttransacao");
		
		Transacao transacao = new Transacao(codigo, tipo, valor, dttransacao);
		
		TransacaoDAO.editar(transacao);
		
		response.sendRedirect(request.getContextPath() + "/transacao-listar");
	}
		
}
