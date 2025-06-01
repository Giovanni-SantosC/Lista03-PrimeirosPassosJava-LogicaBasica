package lista03;

import java.util.Scanner;

public class Ex2Sucessor {

	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite um Valor: ");
		int numero = sc.nextInt();
		
		int sucessor = numero + 1;
		
		System.out.println("o Sucessor de " + numero + " é " + sucessor);
		
		sc.close();
	}
	
}
