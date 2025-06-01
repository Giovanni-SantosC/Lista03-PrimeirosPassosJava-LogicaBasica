package lista03;

import java.util.Scanner;
import java.lang.Math;

public class Ex6AreaCirculo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular a Área de um Circulo");
		
		System.out.println("Digite a Área do Circulo");
		double raio = sc.nextDouble();
		
		double area =  Math.pow(raio, 2) * Math.PI;
		
		System.out.printf("A Área do Circulo com o Raio Sendo " + raio + " é: %.2f \n", area);
		sc.close();
		
	}
	
}
