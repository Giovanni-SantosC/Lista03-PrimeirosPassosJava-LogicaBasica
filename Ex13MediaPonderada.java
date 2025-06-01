package lista03;

import java.util.Scanner;

public class Ex13MediaPonderada {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[]pesos = {0,0,0,0};
		double []notas = {0,0,0,0};
		
		System.out.println("Calculo da Media Ponderada: ");
		
		System.out.println("Digite a Quantidade de Notas a ser Digitado (1 A 4!): ");
		int quantidadeNotas = sc.nextInt();
		
		
		if(quantidadeNotas < 5) {
			
			if(quantidadeNotas ==0 ) {
				System.out.println("Numero Digitado e 0.");
			}
			
			else{
				
		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.println("Digite o valor do " +(i + 1) + "º Peso: ");
			int peso = sc.nextInt();
			pesos[i] = peso;
		}
		
		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.println("Digite o Valor da " +(i + 1) + "º Nota: ");
			double nota = sc.nextDouble();
			notas[i] = nota;
		}
		
		double somaProdutos = 0;
		int somaPesos = 0;
		
		for(int i = 0; i < notas.length; i++) {
			double nota = notas[i];
			int peso = pesos[i];
			somaProdutos += nota * peso;
			somaPesos += peso;
		}
		
		double mediaFinal = 0;
		if(somaPesos != 0) {
			mediaFinal = somaProdutos / somaPesos;
			System.out.println("Sua Nota Final: " + somaProdutos + ". Seu Peso Final: " + somaPesos + ". Sua Media Final: " + mediaFinal);
		}
		
		else {
			System.out.println("ERRO");
		}
		}
		}
		
		else {
			System.out.println("Numero Digitado Maior que 4.");
		}
		sc.close();
	}
	
}
