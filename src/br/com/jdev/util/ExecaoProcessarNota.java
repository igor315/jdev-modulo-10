package br.com.jdev.util;

public class ExecaoProcessarNota extends Exception {
	
	public ExecaoProcessarNota(String erro) {
		super("Vixxx houve um erro ao carregar o arquivo durante o processamento das notas do aluno " + erro);
	}
}
