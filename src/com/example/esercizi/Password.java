package com.example.esercizi;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci la tua password: ");
		String psw = scanner.nextLine();

		if (psw.length() < 6) {
		    System.out.println("La password deve avere almeno 6 caratteri!");
		} else if (psw.matches(".*\\d.*") && psw.matches(".*[A-Z].*") && psw.matches(".*[*~!@#\\$%\\^&()\\-_=+\\[{\\]}\\\\|;:\\\"'<>,.?/].*")) {
		    System.out.println("La tua password: " + psw + " è sicura!");
		} else {
		    System.out.println("Controlla la tua password!, non rispetta i requisiti.");
		}

		
		
	}

}
