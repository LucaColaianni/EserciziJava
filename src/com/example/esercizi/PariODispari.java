package com.example.esercizi;

import java.util.Scanner;

public class PariODispari {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il numero: ");
		int n = scanner.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Il numero "+n+" è pari!");
		}
		else System.out.println("E' dipspari");
		
	}

}
