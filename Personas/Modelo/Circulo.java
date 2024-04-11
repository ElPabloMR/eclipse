package Figura;
import java.util.*;

/**
 * 
 */
public class Circulo {

    private int radio;
    private int perimetro;
    private double area;
    public Circulo() {
        /**
         * @param int radio
         */
    }


    public Circulo(int radio) {
        this.radio=radio;
    }

    /**
     * @param int radio
     */
    public void setRadio(int radio) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getRadio() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int perimetro() {
    	perimetro=radio+radio;
    	return perimetro;

    }

    /**
     * @return
     */
    public double area() {
    	area=radio*radio*3.14;
    	return area;

    }

}