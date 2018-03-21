package br.com.senac.estruturas;

import java.util.Scanner;

/**
 * @author eduardo.diniz2
 *
 */
public class VerificaMaioridade {
	public static void main(String[] args) {
		String nome;
		int idade;
		// a linha abaixo cria um objeto de nome teclado tendo como modelo a classe
		// Scanner
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		// a linha abaixo usa o objeto teclado para armazenar o nome digitado na linha
		nome = teclado.nextLine();//nextLine (tipo String)
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();//nextInt (tipo inteiro)
		System.out.println("");
		System.out.println("____________________________");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		if(idade >= 18) {
			System.out.println(nome + " você é maior de idade");
		}else {
			System.out.println(nome + " você não é maior de idade");
			int para = 18;
			para -= idade;
			System.out.println("Falta " + para + " anos para você ser maior de idade");
		}
	}

}
