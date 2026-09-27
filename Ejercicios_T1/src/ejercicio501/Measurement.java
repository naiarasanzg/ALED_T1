package ejercicio501;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class Measurement {
	private float[] valores;
	
	public Measurement(float[] valores) {
		this.valores=valores;
	}
	
//		Modifique la clase Measurement para añadir un método toString().
	public String toString() {
		return "[" + Arrays.toString(valores)+"]";
	}
	

	public static void main(String[] args) {
		
//		Cree un Set de Measurements (Measurement es una clase que contiene un float[] con 4
//		elementos) y añada 10 Measurements introducidos por el usuario.

		HashSet<Measurement> medidas = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 10 medidas:");
		for(int i=1; i<=10; i++) {
			System.out.println("Medida " + i + ":");
			float[] valores = new float[4];
			for(int j=0; j<valores.length; j++) {
				System.out.print("Valor " + j +":");
				valores[j] = sc.nextFloat();
			}
			medidas.add(new Measurement(valores));
		}
		sc.close();
		System.out.println("Las medidas almacenadas por el usuario son:");
		System.out.println(medidas);
	}

}
