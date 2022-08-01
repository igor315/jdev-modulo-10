package br.com.jdev.aplicacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author jdev-treinamentos
 * Os exemplos aqui estão como nas aulas do curso jdev treinamentos.
 */
import javax.swing.JOptionPane;

import br.com.jdev.interfaces.PermitirAcesso;
import br.com.jdev.model.Aluno;
import br.com.jdev.model.Diretor;
import br.com.jdev.model.Disciplina;
import br.com.jdev.model.Secretario;
import br.com.jdev.util.FuncaoAutenticacao;
import br.com.jdev.util.StatusAluno;

public class Application {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		

		if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
//		é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
			 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Nome da mãe?"); String pai =
			 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a série?"); String escola =
			 * JOptionPane.showInputDialog("Nome da escola?");
			 */

			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

//		For Dinamico para pegar as disciplinas do Aluno
			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da Disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String removerDisciplina = JOptionPane
							.showInputDialog("Qual disciplina deseja remover 1, 2, 3 ou 4?");
					aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outra disciplina?");
				}

			}

			alunos.add(aluno);

		}

		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
//		Alunos separados em listas
		for (Aluno aluno : alunos) {
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else 
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else
					if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
		}
		
		System.out.println("│===============│Listas dos alunos Aprovados│===============│");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		System.out.println("");
		
		System.out.println("│===============│Listas dos alunos Recuperacao│===============│");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		System.out.println();
		
		System.out.println("│===============│Listas dos alunos Reprovados│===============│");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
	}else {
		JOptionPane.showMessageDialog(null, "As credenciais estão incorretas, tente novamente!");
	}
		
	}
}
