package br.com.senac.estruturas;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {
	public static void main(String[] args) {
		// Variavel char aceita apenas UM caractere da tabela ASCII
		// Variavel do tipo char é atribuida com aspas simples ''
		char opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------Jogo Do Dado--------");
		System.out.println("");
		// Random é uma classe que gera numeros aleatorios
		do {
			Random sorteio = new Random();
			int dado = sorteio.nextInt(6) + 1; // gera numeros entre 0 e 5
			System.out.println("Face sorteada: " + dado);
			System.out.print("Deseja jogar novamente ? (S/N)");
			opcao = teclado.next().charAt(0); //Dessa forma só é obtida o primeiro caractere
		} while (opcao == 's');

	}
}
