package br.com.jdev.aplicacao;

import br.com.jdev.model.Aluno;
import br.com.jdev.model.Diretor;
import br.com.jdev.model.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ricardo");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("123456");
		diretor.setNome("Alexander");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNome("Alessandra");
		secretario.setIdade(31);
		
		System.out.println("Aluno: " + aluno);
		System.out.println("Diretor: " + diretor);
		System.out.println("Secretario: " + secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
	}

}
