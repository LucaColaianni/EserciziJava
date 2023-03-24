package com.example.esercizi;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Spazio array: ");
		int n = scanner.nextInt();
		
		int [] numeri = new int[n];
		System.out.println("L'array sarà di "+n+" numeri, ora inserisci i numeri nell'array:");
		
		for(int i = 0; i < n; i++) {
			numeri[i] = scanner.nextInt();
		}
		//Potevo trasformarlo in lista ma così è troppo semplice
		int max = numeri[0]; 
		for(int i = 0; i<=numeri.length-1; i++) {
			if(numeri[i]>max) {
				max = numeri[i];
			}
		}
		System.out.println("Il numero più grande è: "+max);
	
	}
}

