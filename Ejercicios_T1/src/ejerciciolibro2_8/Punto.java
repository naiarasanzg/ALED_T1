package ejerciciolibro2_8;

public class Punto {
//	Definir una clase que represente un punto en un espacio bidimensional. La clase
//	debe disponer de un constructor con las coordenadas del punto y métodos accesores
//	a las coordenadas.
	
	//Defino los atributos
	private double coordX;
	private double coordY;
	
	//Defino el constructor
	public Punto(double coordX, double coordY) {
		this.coordX=coordX;
		this.coordY=coordY;
	}
	
	//Defino los métodos accesores
	public double getX() {
		return this.coordX;
	}
	public void setX(double coordX) {
		this.coordX=coordX;
	}
	public double getY() {
		return this.coordY;
	}
	public void setY(double coordY) {
		this.coordY=coordY;
	}
	//Añado método que devuelve la distancia entre dos puntos
	public static double distEntrePuntos(Punto p1, Punto p2) {
		double p1_X = p1.getX();
		double p1_Y = p1.getY();
		double p2_X = p2.getX();
		double p2_Y = p2.getY();
		
		double difX = p2_X - p1_X;
		double difY = p2_Y - p1_Y;
		
		double dist = Math.sqrt(Math.pow(difX, 2)+Math.pow(difY, 2));
		return dist;
	}
	//Aplicación
	public static void main(String[] args) {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(3.5,8);
		Punto p3 = new Punto(2.4,8.9);
		
		System.out.println("El punto p2 está en " + p2.getX()+", "+ p2.getY());
		double distP1P3 = distEntrePuntos(p1, p3);
		System.out.println("La distancia entre p1 y p3 es: "+ distP1P3);
	}

}
