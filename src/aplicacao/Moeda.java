package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.CalculoMoeda;

public class Moeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Pre�o do dolar: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantos dolares voc� vai comprar: ");
		double quantidadeDolares = sc.nextDouble();
		
		
		double con = CalculoMoeda.conversao(preco, quantidadeDolares);
		
		System.out.printf("Voc� ir� pagar em reais: %.2f%n", con);
		
		
		sc.close();
	}

}
