package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.CalculoMoeda;

public class Moeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Preço do dolar: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantos dolares você vai comprar: ");
		double quantidadeDolares = sc.nextDouble();
		
		
		double con = CalculoMoeda.conversao(preco, quantidadeDolares);
		
		System.out.printf("Você irá pagar em reais: %.2f%n", con);
		
		
		sc.close();
	}

}
