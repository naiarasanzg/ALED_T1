package ejerciciolibro2_7;

public class Asignaturas {
//	Escriba un programa que disponga de una clase para representar las asignaturas de una
//	carrera. Una asignatura tiene un nombre, un código numérico y el curso en el cual se imparte
//	Los valores iniciales han de proporcionarse en el constructor. La clase ha de tener métodos
//	para obtener los valores: nombre 'Matemáticas', código 1017, curso 1. A continuación, el programa
//	ha de imprimir los valores del objeto por pantalla.
	
	//Atributos privados
	private String nombre;
	private int codNum;
	private int curso;
	
	//Constructor con los datos de cada asignatura
	public Asignaturas(String nombre, int codNum, int curso) {
		this.nombre=nombre;
		this.codNum=codNum;
		this.curso=curso;
	}
	
	//Métodos get y set
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getCodNum() {
		return this.codNum;
	}
	public void setCodNum(int codNum) {
		this.codNum=codNum;
	}
	public int getCurso() {
		return this.curso;
	}
	public void setCurso(int curso) {
		this.curso=curso;
	}
	
	//Creo el objeto con los atributos
	public static void main(String[] args) {
	Asignaturas asig1= new Asignaturas("Matemáticas", 1017, 1);
	String nomb = asig1.getNombre();
	int codigo = asig1.getCodNum();
	int curso = asig1.getCurso();
	
	System.out.println("Nombre "+ nomb+", código "+codigo+", curso "+curso);

	}

}
