package com.example.esercizi;

import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Parola : ");
		String parola = scanner.nextLine();
		
		String minuscola = parola.toLowerCase();
		
		StringBuilder reverse = new StringBuilder(minuscola).reverse();
		System.out.println(reverse);
		
		if(parola.equals(reverse.toString())) {
			System.out.println("La parola è palindroma!: "+parola+" = "+reverse);
		}else {
			System.out.println("Non è palindroma.");
		}
	}

}
