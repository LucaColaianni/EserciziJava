package com.example.esercizi;

import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il numero: ");
		String n = scanner.nextLine();
		int somma = 0;
	
		for(int i = n.length()-1; i>= 0; i--) {
			char cifra =  n.charAt(i);	
			
			System.out.println(cifra);
		}
		

		
	}

}
