package br.com.fintec.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fintech.dao.TransacaoDAO;
import br.com.fiap.fintech.model.Transacao;

@WebServlet("/transacao")
public class TransacaoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("transacao.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Long codigo = Long.valueOf(request.getParameter("codigo"));
			String tipo = request.getParameter("tipo");
			String valor = request.getParameter("valor");
			String dttransacao = request.getParameter("dttransacao");
			
			Transacao transacao = new Transacao(codigo, tipo, valor, dttransacao);
			
			TransacaoDAO.cadastrar(transacao);
			
			List<Transacao> listaTransacoes = TransacaoDAO.listar();
			
			request.setAttribute("transacoes", listaTransacoes);
			
			// request.getRequestDispatcher("transacao/index.jsp").forward(request, response);
			
			response.sendRedirect(request.getContextPath() + "/transacao-listar");
	}
}
