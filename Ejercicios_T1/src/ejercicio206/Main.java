package ejercicio206;

public class Main {

	public static void main(String[] args) {
//		Muestre por pantalla la lista de los 100 primeros números primos.
		int contador = 0;
		boolean esPrimo = true;
		System.out.println("Lista de los 100 primeros números primos");
			for (int i=2; contador< 100; i++) {
				esPrimo = true;
				for(int j=2; j<i; j++) { //empiezo con 2 porque todos son divisibles entre 1
					if(i%j == 0) {
						esPrimo = false;
					}
				}
			if(esPrimo) {
				contador++;
				System.out.print(i+ ", ");
			}
			}	
		}
	}	
