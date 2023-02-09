package br.com.fintech.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.fintech.model.Transacao;

public class TransacaoDAO {

	private static Map<Long, Transacao> transacoes =  new HashMap<Long, Transacao>(Map.of(
		1L, new Transacao (1, "MercadoSP", "282,00", "08/10/2022"),
		2L, new Transacao (2, "Posto de Gasolina", "122,33", "11/10/2022"),
		3L, new Transacao (3,"Dentista", "250,00", "15/10/2022")));
		
	
	public static List<Transacao> listar() {
		return new ArrayList<>(transacoes.values());
	}
	
	public static void cadastrar(Transacao transacao) {
		System.out.println("Iniciando novo cadastro...");
		transacoes.put(transacao.getCodigo(), transacao);
		System.out.println("Cadastro finalizado!");
	}
	
	public static Transacao buscar(long codigo) {
		return transacoes.get(codigo);
	}
	
	public static void editar(Transacao transacao) {
		System.out.println("Iniciando edicao de cadastro...");
		transacoes.put(transacao.getCodigo(), transacao);
		System.out.println("Edicao finalizada!");
	}
	
	public static void remover(long codigo) {
		System.out.println("Iniciando remocao de cadastro...");
		transacoes.remove(codigo);
		System.out.println("Remocao finalizada!");
	}
	
}
