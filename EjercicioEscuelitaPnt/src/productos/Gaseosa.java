package productos;

public class Gaseosa extends Producto {

	float liters;

	public Gaseosa(String name, float liters, int price) {
		super(name, price);
		this.liters = liters;
	}

	@Override
	public String toString() {
		return "Nombre: " + name + " ///  Litros: " + liters + " /// Precio: $" + price;
	}

}
