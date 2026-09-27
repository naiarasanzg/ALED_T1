package ejercicio305;

public class Main {

	public static void main(String[] args) {
//		Dado un array de floats, devuelva el promedio de todos ellos.
		float[] arr = {1.5f, 4.9f, 5.2f, 3.6f};
		double promed = promedio(arr);
		System.out.println("El promedio del array de floats es de: " + promed);
	}
	private static double promedio(float[] numeros) {
		double suma = 0;
		int totalNum = 0;
		if(numeros == null) {
			return 0;
		}
		for(int i=0; i<numeros.length; i++) {
			suma += (double)(numeros[i]);
			totalNum++; //No hace falta ponerlo porque ya lo tenemos mirando la longitud
		}
		return suma/totalNum;
	}
}
