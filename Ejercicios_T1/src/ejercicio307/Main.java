package ejercicio307;

public class Main {

	public static void main(String[] args) {
//		Copie los elementos de un array de ints a otro, pero multiplicando cada valor por un factor
//		fijo representado en forma de int.
		int[] arr1 = {2,5,7,9,10,3,1};
		int valorFijo = 2;
		int[] arr2 = multipEnTodos(arr1, valorFijo);
		
		for(int i=0; i<arr1.length; i++) {
		System.out.println(arr2[i]);
		}
	}
	public static int[] multipEnTodos(int[] arr, int valFijo) {
		int[] arrMult = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arrMult[i] = arr[i]*valFijo;
		}
		return arrMult;
	}
}
