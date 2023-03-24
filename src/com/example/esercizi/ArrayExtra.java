package com.example.esercizi;

import java.util.Scanner;

public class ArrayExtra {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Spazio array: ");
		int n = scanner.nextInt();
		
		int [] numeri = new int[n];
		System.out.println("L'array sarà di "+n+" numeri, ora inserisci i numeri nell'array:");
		
		int somma = 0;
		for(int i = 0; i < n; i++) {
			numeri[i] = scanner.nextInt();
			somma = somma + numeri[i];
			
		}
		
		System.out.println("La media è: "+somma/numeri.length);
		
	}

}
