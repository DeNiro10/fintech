package br.com.fintec.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JList;

import br.com.fintech.*;
import br.com.fintech.bean.Conta;
import br.com.test.override;


@SuppressWarnings("unused")
@WebServlet("/Cadastro_Ini")
public class CadastroConta extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CadastroConta() {
        super();
        
    }

	@override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			int email =
					Integer.parseInt(request.getParameter("email"));
			int celular =
					Integer.parseInt(request.getParameter("celular"));
			SimpleDateFormat format = 
					new SimpleDateFormat("dd/MM/yyyy");
			Calendar dtnasc = Calendar.getInstance();
			dtnasc.setTime(format.parse(
					request.getParameter("dtnasc")));
			int cpf =
					Integer.parseInt(request.getParameter("cpf"));
			int senha=
					Integer.parseInt(request.getParameter("senha"));
			Conta conta = new Conta(0,nome,email,celular,dtnasc,cpf,senha);
			
			request.setAttribute("msg", "Conta Cadastrada!");
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Dados invalidos!");
		}
		request.getRequestDispatcher("sucesso.html").forward(request, response);
			
	}
	@override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Conta> lista = dao.lista();
		request.setAttribute("conta",lista);
		request.getRequestDispatcher("lista-conta.jsp").forward(request, response);
		
	}
		
}
