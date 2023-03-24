package com.example.esercizi;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Spazio array: ");
		int n = scanner.nextInt();
		
		int [] numeri = new int[n];
		System.out.println("L'array sarà di "+n+" numeri, ora inserisci i numeri nell'array:");
		
		for(int i = 0; i < n; i++) {
			numeri[i] = scanner.nextInt();
		}
		
		System.out.println("I numeri inseriti sono: ");
		
		for( int numero : numeri) {
			System.out.println(numero);
		}
		
	}

}
