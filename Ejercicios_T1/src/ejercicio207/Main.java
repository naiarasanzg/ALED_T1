package ejercicio207;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Tome un número entero escrito por el usuario y lo descomponga en factores primos. Por
//		ejemplo: 40 = 2×2×2×5.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero para su descomposición en factores primos");
		int numEnt = sc.nextInt();
		sc.close();
		
		boolean esPrimo = true;
		int numActual = numEnt;
		System.out.print(numEnt + " = ");
		
		if(numEnt<=1) {
			System.out.println("El numero introducido debe ser mayor a uno");
		}else {
			while (numActual != 1) {
			for (int i=2; i<=numActual; i++) {
				esPrimo = true;
				for(int j=2; j<i; j++) { //empiezo con 2 porque todos son divisibles entre 1
					if (i%j == 0) {
						esPrimo = false;
					}
				}
				if(esPrimo && (numActual%i == 0)){
					numActual /= i;
					System.out.print(i + "x");
					}
				}
			}
		}
	}
}
