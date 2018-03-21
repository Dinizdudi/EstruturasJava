package br.com.senac.estruturas;

import java.util.Scanner;

/**
 * @author Eduardo Diniz
 *
 */
public class Tabuada {
	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor da tabuada: ");
		System.out.println("");
		valor = teclado.nextInt();
		System.out.println("Tabuada do " + valor);
		for(int i = 0; i < 11; i++) {
			System.out.println(valor + " X " + i + " = " + (valor * i));
		}
	}
}
