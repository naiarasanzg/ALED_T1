package ejercicio204;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Calcule el mínimo y el máximo de una serie de números enteros positivos introducidos por
//		el usuario. Cuando el usuario introduzca un número negativo se considerará que el anterior
//		a este es el último número.
		
		System.out.println("Introduzca una serie de números enteros positivos, se considerará final cuando introducas número negativo");
		Scanner sc= new Scanner(System.in); //Para que lea lo que introduce el usuario
		int numero = sc.nextInt(); //Introducción primer num
		int max = 0;
		int min = 0;
		if(numero >= 0) {
		max = numero;
		min = numero;
			while(numero >= 0) {
				numero = sc.nextInt();
				if (numero > max && numero>=0) {
					max = numero;
				} else if (numero < min && numero>=0) {
					min = numero;
				}
			}
		sc.close();
		System.out.println("El máximo introducido es: " + max);
		System.out.println("El mínimo introducido es: " + min);
		} else {
			System.out.println ("Al introducir un número negativo, no se puede decir máx y mín");
		}
	}
}