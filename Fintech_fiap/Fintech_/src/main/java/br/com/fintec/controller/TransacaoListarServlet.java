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

@WebServlet("/transacao-listar")
public class TransacaoListarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Transacao> listaTransacoes = TransacaoDAO.listar();
		
		request.setAttribute("transacoes", listaTransacoes);
		
		request.getRequestDispatcher("/animal/index.jsp").forward(request, response);
	}
	
}
