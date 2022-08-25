package br.com.jdev.aplicacao;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

		String posicoes = JOptionPane.showInputDialog("Quantas posicoes o Array deve ter?");
//		Array sempre deve ter a quantidade de posicoes definidas
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + (pos+1));
			notas[pos] = Double.valueOf(valor);
		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " = " + notas[pos]);
		}
	}

}
