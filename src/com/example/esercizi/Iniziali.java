package com.example.esercizi;

import java.util.Scanner;

public class Iniziali {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Scrivi una frase! ");
		String frase = scanner.nextLine();
		
		String temp = "";
		String[] split = frase.split(" ");
		for(String parola : split) {
		
			String primaLettera = String.valueOf(parola.charAt(0));
			temp += primaLettera + "." ;
		}
		System.out.println(temp);
		
	}

}
