package lista03;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Valor: ");
		int numero01 = sc.nextInt();
		
		int valor = --numero01;
		
		System.out.println("O Antecessor do Seu Valor é: "+valor);
		
		
		sc.close();
	}
	
	
}
