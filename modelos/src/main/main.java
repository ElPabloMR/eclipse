package main;

import modelos.Rectangulo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo(3,2);
		
		double area_r1=r1.area();
		double perimetro_r2=r2.perimetro();
		
		System.out.println(area_r1);
		System.out.println(perimetro_r2);
	}

}
