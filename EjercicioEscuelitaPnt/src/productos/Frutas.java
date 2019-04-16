package productos;

public class Frutas extends Producto {
	String unity;

	public Frutas(String name, int price, String unity) {
		super(name, price);
		this.unity = unity;
	}

	@Override
	public String toString() {
		return "Nombre: " + name + " /// Precio: $" + price + " /// Unidad de venta: " + unity;
	}

}
