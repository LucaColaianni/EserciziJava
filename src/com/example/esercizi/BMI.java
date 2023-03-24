package com.example.esercizi;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il peso: ");
		double peso  = scanner.nextDouble();
		System.out.println("Inserisci l'altezza: ");
		double altezza  = scanner.nextDouble();

		double bmi = peso/(altezza * altezza)*703;
		System.out.println("La tua bmi è: "+bmi);
		
	}

}
