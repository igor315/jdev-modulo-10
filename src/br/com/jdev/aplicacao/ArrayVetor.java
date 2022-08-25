package br.com.jdev.aplicacao;

public class ArrayVetor {

	public static void main(String[] args) {
		
//		Array pode ser de todos os tipos de dados e objetos
//		Array sempre deve ter uma quantidade de posições definidas
		double[] notas = new double[4];
		notas[0] = 7.84;
		notas[1] = 5.1;
		notas[2] = 9.2;
		notas[3] = 6.3;

		for (int pos = 0; pos < 4; pos++) {
			System.out.println("Nota " + (pos + 1) + " = " + notas[pos]);
		}
	}

}
