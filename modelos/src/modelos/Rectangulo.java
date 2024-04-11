package modelos;
/**
 * 
 * Clase que representa un rectangulo.
 * Contiene metodos para calcular su area y perimetro.
 * 
 * @version 1.0
 * 
 * @author Pablo
 */
public class Rectangulo extends Figuras{
	private double base;
	private double altura;
	/**
	 * Constructor por defecto. Crea un rectangulo con base y altura 1, en metros.
	 */
	public Rectangulo() {
		this.base=1;
		this.altura=1;
	}
	/**
	 * 
	 * @param base 		la base del rectangulo en metros
	 * @param altura	la altura del rectangulo en metros cuadrados. 	
	 */
	public Rectangulo(double base, double altura) {
		
	}
	/**
	 * 
	 * @see modelos.Figuras#area()
	 */
@Override
public double area() {
	return base * altura;
}
/**
 * 
 * @see modelos.Figuras#perimetro()
 */
@Override
public double perimetro() {
	return 2*base + 2*altura;
}
}
