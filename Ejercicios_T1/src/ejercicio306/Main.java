package ejercicio306;

public class Main {

	public static void main(String[] args) {
//		Reciba una matriz (array bidimensional de floats, siguiendo el orden de primero fila y
//		luego columna), y devuelva un array que contenga el valor máximo de cada fila.
		float[][] matriz = {{3.7f, 5.9f, 6.8f}, {1.0f, 2.7f, 4.6f}, {3.5f, 5.6f, 8.9f}, {}};
		float[] valsMax = valorMaxFila(matriz);
		for(int i=0; i<matriz.length; i++) {
		System.out.println("El valor máx en la fila "+ i + " es " + valsMax[i]);
		}
	}
	public static float[] valorMaxFila(float[][] mat) {
		if(mat == null) {
			return null;
		}
		float[] valMax = new float[mat.length];
		float max = Float.MIN_VALUE;
		for(int i=0; i<mat.length; i++) {
			if (mat[i].length == 0) {
				max = Float.NaN;
			}
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j]>max) {
					max = mat[i][j];
				}
			valMax[i] = max; 
			max = Float.MIN_VALUE;
			}
		}
		return valMax;
	}//Lo que me faltaría en este ejercicio es lo de not a number.
}
