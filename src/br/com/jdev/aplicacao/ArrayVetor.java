package br.com.jdev.aplicacao;

import br.com.jdev.model.Aluno;
import br.com.jdev.model.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notasCursoJava = {8.8,9.7,7.6,6.8};
		double[] notasLogicaProgramacao = {5.7,8.9,7.4,9.5};
		
//		Cria��o do aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Igor Santos Oliveira");
		aluno.setNomeEscola("JDEV Treinamento");

//		Cria��o da disciplina
		Disciplina cursoJava = new Disciplina();
		cursoJava.setDisciplina("Curso de Java");
		cursoJava.setNota(notasCursoJava);
		aluno.getDisciplinas().add(cursoJava);
		
		Disciplina logicaProgramacao = new Disciplina();
		logicaProgramacao.setDisciplina("L�gica de programa��o");
		logicaProgramacao.setNota(notasLogicaProgramacao);
		aluno.getDisciplinas().add(logicaProgramacao);
		
		
		
//		Cria��o das notas do aluno2
		double[] notasCursoPHP = {6.7,8.4,9.2,7.5};
		double[] notasCursoLogica = {7.4,9.3,6.1,8.7};
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex Fernando Egidio");
		aluno2.setNomeEscola("JDEV Treinamento");
		
		Disciplina cursoPHP = new Disciplina();
		cursoPHP.setDisciplina("Curso de PHP");
		cursoPHP.setNota(notasCursoPHP);
		aluno2.getDisciplinas().add(cursoPHP);
		
		Disciplina cursoLogica = new Disciplina();
		cursoLogica.setDisciplina("Curso de L�gica de Programa��o");
		cursoLogica.setNota(notasCursoLogica);
		aluno2.getDisciplinas().add(cursoLogica);
		
		
//		----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno �: " + arrayAlunos[pos].getNome());
			
			for(Disciplina disciplina : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina �: " + disciplina.getDisciplina());
				
				for(int posnota = 0; posnota < disciplina.getNota().length; posnota ++ ) {
					System.out.println("A nota n�mero : " + (posnota + 1) + " � = " + disciplina.getNota()[posnota]);
				}
				System.out.println();
			}
		}
	}

}
