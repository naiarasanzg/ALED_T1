package ejercicio203;

public class Main {

	public static void main(String[] args) {
//		Calcule la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. También debe
//		calcular cuántos hay y mostrar visualizar cada uno de ellos
		int sumaMultiplos = 0;
		int numMultiplos = 0;
		System.out.print("Los múltiplos de 5 son: ");
		for (int i= 5; i<=100; i+=5) {
			sumaMultiplos += i; 
			numMultiplos++;
			System.out.print(i + ", ");
		}
		System.out.println("\nTenemos " + numMultiplos + " multiplos de 5");
		System.out.println("La suma total de estos es de: " + sumaMultiplos);
	}
	// Importante aquí: inicializo las variables con las que voy a tratar dentro del bucle for fuera
	// De esta manera puedo tratar con ellos fuera del bucle y no me da error
	// Para imprimir en la misma linea pongo el sysout sin el ln
	// Para imprimir y pasar a la siguiente línea debo de poner /n
}
