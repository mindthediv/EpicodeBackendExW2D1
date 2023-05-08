package com.Epicode;

import java.util.Scanner;

public class MainEx1Ex2 {
	static Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		esercizio2();
		initEx1();
		sc.close();
	}
	//EX1
	static void initEx1(){
		System.out.println("0 -> Termina Programma");
		System.out.println("(1,2,3... != 0) -> Lancia Programma");
		System.out.println("");
		try {
			while(Integer.parseInt(sc.nextLine()) != 0 ) 
			{	
				launchEx1();
			}
		} catch (Exception e) {
			System.out.println("Input invalido - Reset del programma...");
			System.out.println("");
			initEx1();
		}
	}
	static void launchEx1(){
		esercizio1();
	}
	static void esercizio1() {
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) Math.floor(Math.random() * 10 + 1);
		}
		printArray(intArray);
		rimpiazza(intArray);
	}
	static void rimpiazza(int[] intArray) {
		System.out.print("Inserisci un numero: ");		
		int newInt = Integer.parseInt(sc.nextLine());
		System.out.println("");
		System.out.println("Inserisci un numero da 1 a 5, che indichi la posizione da rimpiazzare: ");
		int intId = Integer.parseInt(sc.nextLine());
		System.out.println("");
		intArray[intId - 1] = newInt;
		printArray(intArray);
	}
	static void printArray(int[] intArray){
		System.out.print("Array: ");
		for (int i : intArray) {
			System.out.print(i + ", ");
		}
		System.out.println("");
	}
	//EX2
	static void esercizio2() {
		try {
			calcola();
			esercizio2();
		} catch (Exception e) {
			System.out.println("Valori inseriti non validi");
			esercizio2();
		}
	}
	static void calcola() {
		System.out.print("Inserisci i km percorsi: ");		
		double km = Double.parseDouble(sc.nextLine());
		System.out.println("");
		System.out.println("Inserisci i litri di carburante utilizzati: ");
		double oil = Double.parseDouble(sc.nextLine());
		System.out.println("");
		double tot = (oil / km);
		System.out.println("Hai consumato " + tot + " litri/km");
		System.out.println("");
	}
}
