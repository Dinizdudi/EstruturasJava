package br.com.senac.estruturas;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
	private static Scanner teclado;

	public static void main(String[] args) {
		int opcao;
		teclado = new Scanner(System.in);
		System.out.println("JoKenPo");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejada: ");
		opcao = teclado.nextInt();
		Random sorteio = new Random();
		int pc = sorteio.nextInt(3) + 1;
		if (pc == 1) {
			System.out.println("O computador escolheu: Pedra");
		} else if (pc == 2) {
			System.out.println("O computador escolheu: Papel");
		} else {
			System.out.println("O computador escolheu: Tesoura");
		}
		switch (opcao) {
		case 1:
			if (pc == 1) {
				System.out.println("O jogo empatou");
			} else if (pc == 2) {
				System.out.println("O computador ganhou!");
			}else if(pc == 3) {
				System.out.println("Você ganhou!");
			}
			break;

		case 2:
			if (pc == 3) {
				System.out.println("O jogo empatou");
			} else if (pc == 2) {
				System.out.println("O computador ganhou!");
			}else if(pc == 1) {
				System.out.println("Você ganhou!");
			}
			break;

		default:
			break;
		}
	}
}
