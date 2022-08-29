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
		
		
		System.out.println("Nome do Aluno = " + aluno.getNome() + " inscrito no curso de " + aluno.getNomeEscola());
		System.out.println("-------------------Disciplinas do Aluno--------------------");
		for(Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + disciplina.getDisciplina());
			System.out.println("As notas da discplina são:");

//			Criamos uma variável auxiliar para descobrir qual a maior nota da disciplina
			double notaMax = 0.0;
			
			for(int pos = 0; pos < disciplina.getNota().length; pos++) {
				System.out.println("Nota " + (pos+1) + " = " + disciplina.getNota()[pos]);
			
//				Nesse trecho do código temos a implementação para descobrir a maior nota da disciplina
				if(pos == 0) {
					notaMax = disciplina.getNota()[pos];
				}else {
					if(disciplina.getNota()[pos] < notaMax) {
						notaMax = disciplina.getNota()[pos];
					}
				}
			}
			System.out.println("A menor nota da Disciplina = " + disciplina.getDisciplina() + " é de valor: " + notaMax);
			System.out.println();
		}
	}

}
