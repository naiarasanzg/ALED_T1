package ejercicio205;

public class Main {

	public static void main(String[] args) {
//		Muestre por pantalla la tabla de multiplicar de los 10 primeros números naturales.
		int multip = 0;
		for(int i=0; i<=10; i++) {
			System.out.println("La tabla del "+ i);
			for(int j=0; j<=10; j++) {
				multip = i*j;
				System.out.println(i +"x"+j+"= " + multip);
			}
		}
	}

}
