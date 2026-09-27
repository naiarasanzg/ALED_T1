package ejercicio405;

public class Main {
//	Indique cuántas veces aparece un String dentro de otro String.
	public static String minusc (String str) { //Paso a minusc para que reconozca misma palabra independientemente de mayusc o minusc
		String textoMinusc = str.toLowerCase();
		return textoMinusc;
	}
	public static int stringRep(String str, String palabra) { //Algo falla
		int num=0;
		int indice=0;
		String str1= minusc(str);
		String str2= minusc(palabra);
		String strCortado = str1;
		
		if(str1.contains(str2)) {
			while(strCortado.contains(str2)) {
				num++;
				indice= strCortado.indexOf(str2);
				strCortado = strCortado.substring(indice+str2.length());
			}
		}
		return num;
	}

	public static void main(String[] args) {
		String str = "El gato salió de el suelo";
		String pal = "el";
		System.out.println("La palabra '"+ pal + "' se repite "+ stringRep(str, pal)+ " veces");
	}

}//El problema que tengo es que si busco el me busca todo lugar donde ponga el (sake 3 por suelo)
