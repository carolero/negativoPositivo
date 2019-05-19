package com.br.exercicio.cinco;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int controle = 1;
		
		while (controle > 0) {
			
			System.out.println("Digite um número");
			int numero = scan.nextInt();
			
			if (numero < 0) {
								
				System.out.println(numero + " é negativo");
		
			} else {
				
				if (numero == 0) {
					
					System.out.println(numero + " é neutro");
					
				} else {
					
					System.out.println(numero + " é positivo");

				}
							
			}
			
			System.out.println("Digite 1 para continuar no programa ou -1 para sair");
			controle = scan.nextInt();
			
		}
				
	}

}
