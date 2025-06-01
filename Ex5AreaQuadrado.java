package lista03;

import java.util.Scanner;

public class Ex5AreaQuadrado {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are do Quadrado: ");
		
		System.out.println("Digite o Valor do Lado do Quadrado: ");
		double lado = sc.nextDouble();
		
		double area = lado* lado;
		
		System.out.println("A Area do Quadrado com Lado "+ lado + " é : " + area);
		sc.close();
	}
	
}
