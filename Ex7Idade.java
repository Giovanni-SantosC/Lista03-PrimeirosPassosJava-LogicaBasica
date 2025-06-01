package lista03;

import java.util.Scanner;

public class Ex7Idade {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sua Idade em Dias:");
		
		System.out.println("Digite sua Idade em Anos: ");
		int ano = sc.nextInt();
		System.out.println("Digite a Quantidade de Meses: ");
		int mes = sc.nextInt();
		System.out.println("Digite a Quantiade de Dias");
		int dia = sc.nextInt();
		
		int idadeEmDias = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("Sua Idade Expressa em Dias : " + idadeEmDias);
		sc.close();
	}

}
