package ejercicio401;

public class Main {
//	Imprima por pantalla el primer número que aparezca en un String.
	public static int primerNum (String str) {
		int num;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				num = Character.getNumericValue(str.charAt(i));
				return num;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	String str = "Hola 2026";
	System.out.println("El primer número del String es:" + primerNum(str));
	}
}
