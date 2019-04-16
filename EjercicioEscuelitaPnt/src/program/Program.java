
package program;

import java.util.ArrayList;

import productos.Frutas;
import productos.Gaseosa;
import productos.Producto;
import productos.Shampoo;

public class Program {

	public static void main(String[] args) {

		ArrayList<Producto> productos = cargarListaProductos();
		Producto productoCaro = productos.get(0);
		Producto productoBarato = productos.get(0);

		for (Producto p : productos) {

			if (p.compareTo(productoCaro) > 0) {

				productoCaro = p;

			} else if (p.compareTo(productoBarato) < 0) {

				productoBarato = p;

			}

		}

		String mensaje = "";
		for (Producto p : productos) {
			mensaje += p.toString() + "\n";
		}
		mensaje += "=============================\n";
		mensaje += "Producto más caro: " + productoCaro.getName() + "\n";
		mensaje += "Producto más barato: " + productoBarato.getName();
		System.out.println(mensaje);
	}

	public static ArrayList<Producto> cargarListaProductos() {

		ArrayList<Producto> productos = new ArrayList<Producto>();

		productos.add(new Gaseosa("Coca-Cola Zero", 1.5f, 20));
		productos.add(new Gaseosa("Coca-Cola", 1.5f, 18));
		productos.add(new Shampoo("Shampoo Sedal", 500, 19));
		productos.add(new Frutas("Frutillas", 64, "Kilo"));

		return productos;

	}

}
