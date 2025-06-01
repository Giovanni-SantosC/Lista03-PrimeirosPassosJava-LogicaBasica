package lista03;

import java.util.Scanner;

public class Ex9SalarioMensal {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do Novo Salario: ");
		 
		System.out.println("Digite seu Salario Mensal: ");
		double salarioAtual = sc.nextDouble();
		
		System.out.println("Digite o Percentual de Reajuste:");
		double percentualReajuste = sc.nextDouble();
		
		double percentualDecimal = percentualReajuste / 100;
		
		double valorReajuste = salarioAtual * percentualDecimal;
		
		double novoSalario = salarioAtual + valorReajuste;
		
		System.out.println("Salário Atual: " + salarioAtual);
		System.out.println("Porcentual de Reajuste: " + percentualReajuste + "%");
		System.out.println("Novo Salário " + novoSalario);
		
		sc.close();
	}
	
	
	
}
