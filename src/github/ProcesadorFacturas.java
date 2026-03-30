package github;
import java.util.List;

public class ProcesadorFacturas {
	

	// SMELL: Nombre de método poco claro y parámetros que podrían ser un objeto
	public void procesarFactura (List<Double> precios, String nombreCliente, double impuesto, boolean vip) {
	double total = 0;
	// SMELL: Lógica de cálculo mezclada con impresión (Método Largo)
	total = CalcularSumarBase(precios, total);
	// SMELL: Código duplicado y números "mágicos" (0.10, 0.05)
	if (vip) {
	total = total - (total * 0.10);
	System.out.println("Cliente VIP: " + nombreCliente);
	System.out.println("Total con descuento: " + total);
	} else {
	total = total + (total * impuesto);
	System.out.println("Cliente Normal: " + nombreCliente);
	System.out.println("Total con impuestos: " + total);
	}
	// SMELL: Más código duplicado (la impresión del nombre)
	}

	private double CalcularSumarBase(List<Double> precios, double total) {
		for (Double d : precios) {
		total += d;
		}
		return total;
	}
	}

	

	


