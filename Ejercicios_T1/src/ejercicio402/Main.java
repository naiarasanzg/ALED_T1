package ejercicio402;

public class Main {
//	Indique cuántas veces aparece un char en un String.
	public static int numChar(String str, char c) {
		int num = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				num++;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
	String str = "Hola 2026, bienvenido";
	char letra = 'e';
	
	System.out.println("El char '"+ letra+ "' aparece "+ numChar(str,letra)+" veces en el String");
	}

}
