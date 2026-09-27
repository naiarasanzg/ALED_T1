package ejercicio208;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Solicite al usuario dos vectores tridimensionales e imprima su producto escalar.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los elementos del primer vector:");
		System.out.print("Componente X: ");
		int v1_1 = sc.nextInt();
		System.out.print("Componente Y: ");
		int v1_2 = sc.nextInt();
		System.out.print("Componente Z: ");
		int v1_3 = sc.nextInt();
		
		System.out.println("Introduzca los elementos del segundo vector:");
		System.out.print("Componente X: ");
		int v2_1 = sc.nextInt();
		System.out.print("Componente Y: ");
		int v2_2 = sc.nextInt();
		System.out.print("Componente Z: ");
		int v2_3 = sc.nextInt();
		
		sc.close();
		int prodEsc = v1_1*v2_1 + v1_2*v2_2 + v1_3*v2_3;
		System.out.println("El producto escalar de los vectores dados es:" + prodEsc);
	}
}
