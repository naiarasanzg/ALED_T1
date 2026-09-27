package ejercicio403;

public class Main {
//	Elimine los espacios en blanco al final de un String
	public static String eliminaEsp(String str) {
		String strBlanco;
		int posChar = 0;
		for(int i=str.length()-1; i>=0;i--){
			if(str.charAt(i) != ' ') {
			posChar = i;
			break;
			}
		}
		strBlanco= str.substring(0, posChar+1);
		return strBlanco;
	}
	public static void main(String[] args) {
		String str = "Hola 2026    ";
		
		System.out.println("El string '"+ str + "' arreglado es '" + eliminaEsp(str)+"'");

	}//Con la función trim podemos quitar espacios delante y detrás

}
