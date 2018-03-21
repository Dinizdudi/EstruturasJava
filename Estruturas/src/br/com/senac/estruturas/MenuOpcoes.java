package br.com.senac.estruturas;

import java.util.Scanner;

public class MenuOpcoes {

	public static void main(String[] args) {
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sistemas operacionais: ");
		System.out.println("1. Linux");
		System.out.println("2. Windows");
		System.out.println("");
		System.out.println("Digite a opção desejada: ");
		menu = teclado.nextInt();
		//exemplo de uso do switch case
		switch (menu) {
		case 1:
			linux();
			break;
		case 2:
			windows();
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}
	}

	//Criando métodos
	//O main só pode chamar metodos Static pois o main é static, Static só vai com Static
	public static void windows() {
		System.out.println("Carregando o Windows....");
	}
	
	public static void linux() {
		System.out.println("Carregando o Linux...");
	}
	
}
