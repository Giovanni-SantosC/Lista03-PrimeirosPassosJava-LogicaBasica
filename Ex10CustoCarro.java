package lista03;

import java.util.Scanner;

public class Ex10CustoCarro {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o Custo de Fábrica do Carro");
		double custoFabrica = sc.nextDouble();
		double percentualDistribuidor = 28;
		double percentualImpostos = 45;
		
		double percentualImpostosDecimal = percentualImpostos / 100;
		double percentualDistribuidorDecimal = percentualDistribuidor / 100;
		
		double valorDistribuidor = custoFabrica * percentualDistribuidorDecimal;
		double valorImpostos = custoFabrica * percentualImpostosDecimal;
		
		double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;
		
		System.out.printf("Custo Fábrica: R$%.2f \n" , custoFabrica );
		System.out.printf("Custo Final ao Consumidor: R$%.2f \n" , custoFinal);
		sc.close();
	}
	
}
