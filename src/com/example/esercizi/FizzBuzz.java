package com.example.esercizi;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero da dove far partire il FizzBuzz: ");
		int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz! "+i);
            } else if(i % 2 == 0) {
                System.out.println("Fizz! " + i);
            } else if (i % 3 == 0) {
                System.out.println("Buzz! " + i);
            } else {
                System.out.println(i);
            }
        }
    }

}
