package lista03;

import java.util.Scanner;

public class Ex12Fahrenheit {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temperatura de Fahrenheit Para Celsius: ");
		
		System.out.println("Digite sua Temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		double conversaoCelsius = (fahrenheit - 32) * 5/9 ;
		
		System.out.println(fahrenheit + " Graus em Fahrenheit Equivale a " + String.format("%.2f", conversaoCelsius) + " Graus Celsius.");
		sc.close();
	}
	
}
