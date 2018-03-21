package br.com.senac.estruturas;

import java.util.Scanner;

public class tabuadaWhile {

	public static void main(String[] args) {
		int valor;
		int x = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a tabuada desejada");
		valor = teclado.nextInt();
		System.out.println("");
		while(x < 11) {
			System.out.println(valor + " X " + x + " = " + (x * valor));
			x++;
		}
	}
}
