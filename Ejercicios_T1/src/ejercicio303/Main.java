package ejercicio303;

public class Main {

	public static void main(String[] args) {
//		Genere un array de 300 enteros en el que cada posición contenga su índice módulo 16. Es
//		decir, que siga la siguiente secuencia:
//		0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0,1,2...
		int[] arr = new int[300];
		for(int i=0; i<arr.length; i++) {
			arr[i]= i%16; //Como dice módulo, pongo el %.
			System.out.println(arr[i]);
		}
	}
}
