package br.com.jdev.aplicacao;

public class Matriz {
	
//	O método main serve para executar o código Java
	public static void main(String[] args) {
		
		int notas[][] = new int [2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 70;
		notas[1][1] = 50;
		notas[1][2] = 90;
		
		System.out.println(notas);
	}

}
