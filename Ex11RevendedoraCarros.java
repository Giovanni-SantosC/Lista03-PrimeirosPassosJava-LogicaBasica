package lista03;

import java.util.Scanner;

public class Ex11RevendedoraCarros {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Revendedora de Carros Usados: ");
		
		System.out.println("Digite seu Salario: ");
		double valorSalario = sc.nextDouble();
		
		System.out.println("Total De Vendas Efetuada: ");
		double valorTotalVendas = sc.nextDouble();
		
		System.out.println("Digite Quantos Carros Foram Vendidos: ");
		double quantidadeDeCarrosVendidos = sc.nextDouble();
		
		System.out.println("Digite o Valor da Comissão por Cada Carro Vendido: ");
		double comissaoPorCarro = sc.nextDouble();
		
		double comissaoCarroVendido = quantidadeDeCarrosVendidos * comissaoPorCarro;
		double percentualComissaoVendas = 0.05;
		double comissaoSobreVendas = valorTotalVendas * percentualComissaoVendas;
		
		double salarioFinal = valorSalario + comissaoCarroVendido + comissaoSobreVendas;
		
		 System.out.printf("Salário Final do Vendedor: R$ %.2f" , salarioFinal);
		sc.close();
	}
	
}
