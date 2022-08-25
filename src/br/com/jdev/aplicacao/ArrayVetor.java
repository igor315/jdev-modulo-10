package br.com.jdev.aplicacao;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

//                          0 	 1    2	
		double[] numeros = {9.5, 8.4, 5.5};
		
//		Quando são varios tipos de dados fazemos um Array de String
		String[] dados = new String[4];
		dados[0] = "Igor";
		dados[1] = "Curso de Java";
		dados[2] = "igor312@gmail.com.br";
		dados[3] = "idade 27 anos";
		
//		Mesmo Array de cima feito de outra forma
		String[] valores = {"Igor", "Curso de Java", "igor312@gmail.com.br", "idade 27 anos"};
		
		for(int pos = 0; pos < valores.length; pos ++) {
			System.out.println("Valor na posição " + pos + " é = " +valores[pos]);
		}
	}

}
