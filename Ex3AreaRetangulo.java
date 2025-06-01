package lista03;

import java.util.Scanner;

public class Ex3AreaRetangulo {

	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Medida de Um Retângulo: ");
		
		System.out.println("Digite A Altura do Retângulo:");
		int altura = sc.nextInt();
		
		System.out.println("Digite a Base do Retângulo: ");
		int base = sc.nextInt();
		
		int area = base * altura;
		
		System.out.println("A Area do Seu Retangulo é: " + area);
		
		sc.close();
	}
	
}
