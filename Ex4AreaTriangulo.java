package lista03;

import java.util.Scanner;

public class Ex4AreaTriangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Area do Triângulo: ");
		
		System.out.println("Digite a Base do  Triângulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a Altura do Triângulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("A Area do Seu Triângulo é: " + area);
		
		sc.close();
	}
	
}
