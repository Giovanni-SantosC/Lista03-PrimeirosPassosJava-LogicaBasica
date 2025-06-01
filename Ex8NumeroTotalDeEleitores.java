package lista03;

import java.util.Scanner;

public class Ex8NumeroTotalDeEleitores {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pocentagem de Votos em um Municipio");
		
		System.out.println("Digite o Total de Eleitores: ");
		int totalEleitores = sc.nextInt();
		
		System.out.println("Digite a Quantidade de Votos Brancos");
		int votosBrancos = sc.nextInt();
		
		System.out.println("Digite a Quantiade de Votos Nulos: ");
		int votosNulos = sc.nextInt();
		
		System.out.println("Digite a Quantidade de Votos Validos: ");
		int votosValidos = sc.nextInt();
		
		if(votosBrancos + votosNulos + votosValidos > totalEleitores) {
			System.out.println("Numero Maior que Total de Eleitores do Município");
		}
		
		else {
			System.out.println("Total de Eleitores: " + totalEleitores);
			double quantidadeVotosBranco = ((double)votosBrancos / totalEleitores) * 100;
			System.out.printf("Total de Votos Brancos: %.2f \n", quantidadeVotosBranco);
			double quantidadeVotosNulos = ((double)votosNulos / totalEleitores) * 100;
			System.out.printf("Total de Votos Nulos: %.2f \n" , quantidadeVotosNulos);		
			double quantidadeDeVotosValidos = ((double)votosValidos / totalEleitores) * 100;
			System.out.printf("Total de Votos Valdidos: %.2f \n" , quantidadeDeVotosValidos);
			
		}
		
		sc.close();
	}
	
}
