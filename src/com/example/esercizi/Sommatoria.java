package com.example.esercizi;

import java.util.Scanner;

public class Sommatoria {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il numero: ");
		int n = scanner.nextInt();
		int somma =0;
		
		String nString = String.valueOf(n);

		for(int i = 0; i <=nString.length()-1; i++) {
			char cifra = nString.charAt(i);
			int valoreCifra =  Character.getNumericValue(cifra);
			somma += valoreCifra;
		}
		
		System.out.println("La somma delle cifre di "+n+" è: "+somma);
	}

}
