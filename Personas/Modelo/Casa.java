package Modelo;
import java.util.*;

/**
 * Representa una casa del mundo real.
 */
public class Casa {
    private String direccion;
    private int numHabitaciones;
    private int metrosCuadrados;
    public Casa() {
    	/**
         * Constructor que recibe como parametros la direccion, el numero de habitacion y los metros cuadrados
         * 
         * @param direccion  La direccion de la casa
         * @param numHabitaciones  El numero de habitaciones de la casa
         * @param metrosCuadrados Los metros cuadrados de la casa
         */
    }
    public Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
    	this.direccion=direccion;
    	this.numHabitaciones=numHabitaciones;
    	this.metrosCuadrados=metrosCuadrados;
    }



    public void Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getDireccion() {
        // TODO implement here
        return this.direccion;
    }

    /**
     * @return
     */
    public int getnumHabitaciones() {
        // TODO implement here
        return this.numHabitaciones;
    }

    /**
     * @return
     */
    public int getmetrosCuadrados() {
        // TODO implement here
        return this.metrosCuadrados;
    }

    /**
     * @param direccion La direccion de la casa
     */
    public void setDireccion(String direccion) {
        // TODO implement here
    	this.direccion=direccion;
    }

    /**
     * @param numHabitaciones El numero de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        // TODO implement here
    	this.numHabitaciones=numHabitaciones;
    }

    /**
     * @param metrosCuadrados El numero de metros cuadrados
     */
    public void setMetrosCuadrados(int metrosCuadrados) {
        // TODO implement here
    	this.metrosCuadrados=metrosCuadrados;
    }

    /**
     * @return Una cadena con la direccion, el numero de habitaciones y los metros cuadrados
     */
    public String toString() {
        // TODO implement here
        return direccion+" "+numHabitaciones+" "+metrosCuadrados;
    }

}