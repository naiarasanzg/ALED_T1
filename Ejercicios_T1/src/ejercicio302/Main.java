package ejercicio302;

public class Main {
	public static void main(String[] args) {
//		Busque un valor específico en un array de ints (no ordenado) y devuelva su posición, o -1
//		si el valor no existe.
		int[] arr= {2,7,9,1,4,0,6,8};
		int numABuscar = 9;
		
		int pos = buscarNum(arr, numABuscar);
		System.out.println("Posción en la que está el "+ numABuscar+ " es en "+ pos);
	}
	private static int buscarNum(int[] arr, int num) {
		if(arr == null) {
			return -1;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return i;
			} 
		}
		return -1;
	}
}
