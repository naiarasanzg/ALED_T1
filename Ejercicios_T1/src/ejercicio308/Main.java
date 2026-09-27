package ejercicio308;

public class Main {

	public static void main(String[] args) {
//		Cuente el número de valores negativos que hay en un array de floats.
		float[] arr = {-1.0f, 3.7f, -5.3f, 8.9f, -2.0f};
		
		System.out.println("En total hay "+ cuentaNumNeg(arr)+ " números negativos en el array");
	}
	public static int cuentaNumNeg (float[] arr) {
		if(arr == null) {
			return -1;
		}
		int totalNeg = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				totalNeg++;
			}
		}
		return totalNeg;
	}
}
