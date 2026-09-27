package ejercicio201;

public class Main {

	public static void main(String[] args) {
//		Defina variables que representen el número de días de un año, el número de horas que
//		tiene un día, el número de minutos que tiene una hora y el número de segundos que tiene
//		un minuto. Emplee las variables que ocupen el mínimo espacio de memoria posible. A
//		continuación, calcule el número de segundos que tiene un año y almacene el valor de dicho
//		cálculo en otra variable.
		short numDiasAño = 365; //un short son 2 bytes
		byte numHorasDia = 24; //un byte es lo mejor para este
		byte numMinHora = 60;
		byte numSegMin = 60;
		
		int numSegAño = numDiasAño*numHorasDia*numMinHora*numSegMin;
		System.out.println("El número de segundos en un año es de: " + numSegAño);
		
//		Existe una conversión manual llamada cast, si quiero realizar el calculo y obligar a que la
//		variable que salga sea short (por ejemplo), tengo que hacer lo siguiente:
//		short numSeg = (short) (numDiasAño*numMinHora);
	}

}
