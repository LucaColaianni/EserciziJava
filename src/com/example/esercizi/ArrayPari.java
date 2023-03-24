package com.example.esercizi;

import java.util.Scanner;

public class ArrayPari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Grandezza array: ");
		int n = scanner.nextInt();
		
		int [] array= new int[n];
		System.out.println("La grandezza dell'array sarà di: "+ n);
		
		for(int i = 0; i<=array.length-1; i++) {
			array[i] = scanner.nextInt();
		}
		
		for(int i = 0; i<=array.length-1; i++) {
			if(i % 2 == 0) {
				System.out.println("L'elemento in posizione pari è: "+array[i]);
			}
		}
		
	}

}
