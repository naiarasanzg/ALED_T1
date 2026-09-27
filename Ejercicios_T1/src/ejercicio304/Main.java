package ejercicio304;

public class Main {

	public static void main(String[] args) {
//		Haga lo mismo que el ejercicio anterior, pero ahora usando un array de chars con la
//		representación en hexadecimal de los dígitos. Es decir, que siga la siguiente secuencia:
		char[] arr = new char[300];
		for(int i=0; i<arr.length; i++) {
			arr[i]= Integer.toHexString(i%16).toUpperCase().charAt(0);
			System.out.println(arr[i]);
		}
	}
}
