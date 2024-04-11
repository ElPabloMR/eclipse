package Figura;
import java.util.*;

/**
 * 
 */
public class Rectangulo {
    private int Base;
    private int Altura;
    private int area;
    private int perimetro;

    public Rectangulo() {
        /**
         * @param int Base 
         * @param int Altura
         */
    }


    public Rectangulo(int Base, int Altura) {
        this.Base=Base;
        this.Altura=Altura;
    }

    /**
     * @return
     */
    public int getBase() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return 0;
    }

    /**
     * @param int Base
     */
    public void setBase( int Base) {
        // TODO implement here
    }

    /**
     * @param int Altura
     */
    public void setAltura( int Altura) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String ToString() {
        // TODO implement here
        return "";
    }
    public int area (){
    	area=Base*Altura;
    	return area;
    }
    public int perimetro () {
    	perimetro=Base+Altura;
    	return perimetro;
    }

}