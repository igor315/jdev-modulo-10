package br.com.jdev.aplicacao;

import br.com.jdev.model.Aluno;
import br.com.jdev.model.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notasCursoJava = {8.8,9.7,7.6,6.8};
		double[] notasLogicaProgramacao = {5.7,8.9,7.4,9.5};
		
//		Criação do aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Igor");
		aluno.setNomeEscola("JDEV Treinamento");

//		Criação da disciplina
		Disciplina cursoJava = new Disciplina();
		cursoJava.setDisciplina("Curso de Java");
		
		cursoJava.setNota(notasCursoJava);
		cursoJava.setNota(notasLogicaProgramacao);
		
		aluno.getDisciplinas().add(cursoJava);
		
		Disciplina logicaProgramacao = new Disciplina();
		logicaProgramacao.setDisciplina("Lógica de programação");
		aluno.getDisciplinas().add(logicaProgramacao);
	}

}
