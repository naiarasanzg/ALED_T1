package ejercicio301;

public class Main {
	

	public static void main(String[] args) {
//		Tome un array de floats y devuelva la suma de todos sus elementos.
		float[] arr = {1.5f, 4.6f, 5.3f, 9.8f}; //Debo añadir la f para que lo considere como float
		System.out.println("La suma de los elementos es: " + suma(arr));
	}

	private static float suma (float[] arr) {
		float total = 0.0f;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}
