package br.com.jdev.aplicacao;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = " Igor, curso Java, 80, 75, 60, 90";
		
		String[] valoresArray = texto.split(",");
		
		
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);
		
		System.out.println("===================================================");
		
		
//		Convertendo um Array em uma lista
		List<String> lista = Arrays.asList(valoresArray);
		
		for (String valorString : lista) {
			System.out.println(valorString);
		}
		
		System.out.println("===================================================");
		
//		Convertendo uma lista para um array
		String[] conversaoArray = lista.toArray(new String[6]);
		
		
		for(int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}

}
