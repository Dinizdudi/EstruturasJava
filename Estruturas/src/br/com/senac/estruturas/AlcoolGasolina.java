/**
 * 
 */
package br.com.senac.estruturas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author eduardo.diniz2
 *
 */
public class AlcoolGasolina {
	public static void main(String[] args) {
		double alcool, gasolina, gastoa, gastog, porcentagem;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Quantos KM seu carro percorre com 1 litro de alcool: ");
		gastoa = teclado.nextDouble();
		System.out.println("Quantos KM seu carro percorre com 1 litro de gasolina: ");
		gastog = teclado.nextDouble();

		porcentagem = gastoa * 100 / gastog;

		System.out.println("========================================================================");
		System.out.println("Para compensar o alcool precisa ser " + formatador.format(porcentagem) + "% mais barato");
		System.out.println("========================================================================");
		
		System.out.print("Digite o valor do alcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		

		porcentagem = porcentagem/100;
		
		gasolina = gasolina * porcentagem;
		alcool = alcool * 1;

		if (alcool > gasolina) {
			System.out.println("A gasolina compensa mais");
		} else {
			System.out.println("O alcool compensa mais");
		}
	}

}
