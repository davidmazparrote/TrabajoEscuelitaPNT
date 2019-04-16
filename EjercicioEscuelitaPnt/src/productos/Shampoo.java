package productos;

public class Shampoo extends Producto {

	int content;

	public Shampoo(String name, int content, int price) {
		super(name, price);
		this.content = content;

	}

	@Override
	public String toString() {
		return "Nombre: " + name + " /// Contenido: " + content + "ml" + " /// precio: $" + price;
	}

}
