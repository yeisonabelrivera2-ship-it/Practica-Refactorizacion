package github;

public class Calculadora {
	
	
	/** 
	 * Clase que proporciona métodos para convertir temperaturas entre grados Celsius y Fahrenheit,
	 * así como para evaluar condiciones relacionadas con el punto de congelación.
	 * Permite validaciones de temperatura física y conversiones precisas.
	 * @author [Tu Nombre]
	 * @version 1.0
	 */ 
	public class ConversorClima { 

	    /** Valor constante para la conversión a grados Fahrenheit. */ 
	    private static final double OFFSET_FAHRENHEIT = 32.0; 

	    /** 
	     * Convierte una temperatura dada en grados Celsius a grados Fahrenheit.
	     * @param celsius La temperatura a convertir, expresada en grados Celsius.
	     * @return La temperatura equivalente en grados Fahrenheit, calculada con la fórmula F = C * 9/5 + 32.
	     * @throws IllegalArgumentException Si la temperatura ingresada es menor que -273.15 °C (cero absoluto), 
	     *         ya que no es físicamente posible.
	     */ 
	    public double celsiusAFahrenheit(double celsius) throws IllegalArgumentException { 
	        if (celsius < -273.15) { 
	            throw new IllegalArgumentException("Temperatura por debajo del cero absoluto."); 
	        } 
	        return (celsius * 9 / 5) + OFFSET_FAHRENHEIT; 
	    } 

	    /** 
	     * Determina si una temperatura dada corresponde al punto de congelación del agua o está por debajo.
	     * @param temperatura La temperatura a evaluar, expresada en grados Celsius.
	     * @return true si la temperatura es menor o igual a 0 °C (punto de congelación), false si es mayor.
	     */ 
	    public boolean esPuntoCongelacion(double temperatura) { 
	        return temperatura <= 0; 
	    } 
	}
}
