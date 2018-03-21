package br.com.senac.estruturas;

import java.util.Scanner;

public class VerificaObrigatoriedade {
	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite o sua idade: ");
		idade = teclado.nextInt();

		if (idade < 16) {
			System.out.println("Você não pode votar");
			int para = 16;
			para -= idade;
			System.out.println("-----------------------------------------");
			System.out.println("Daqui " + para + " você poderá começar a votar");
			System.out.println("-----------------------------------------");

		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Você é obrigado a votar");
			int por = 71;
			por -= idade;
			System.out.println("-----------------------------------------");
			System.out.println("Você só é obrigado a votar por mais " + por + " anos");
			System.out.println("-----------------------------------------");
		} else {
			System.out.println("Você pode votar, mas não é obrigado!");
		}
	}
}
