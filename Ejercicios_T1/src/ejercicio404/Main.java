package ejercicio404;

public class Main {
//	Pase un String a TODO MAYÚSCULAS. Luego, a todo minúsculas.
	public static String mayusc (String str) {
		String textoMayusc = str.toUpperCase();
		return textoMayusc;
	}
	public static String minusc (String str) {
		String textoMinusc = str.toLowerCase();
		return textoMinusc;
	}

	public static void main(String[] args) {
		String str = "Hola 2026";
		
		System.out.println(mayusc(str));
		System.out.println(minusc(str));
	}

}
