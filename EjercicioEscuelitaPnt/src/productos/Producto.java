package productos;

public abstract class Producto implements Comparable<Producto> {

	String name;
	int price;

	public Producto(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * Compara por el precio
	 *
	 * @param product
	 * @return
	 */
	public int compareTo(Producto product) {

		int resultado = 0;

		if (this.price < product.price) {
			resultado = -1;

		} else if (this.price > product.price) {
			resultado = 1;
		}
		return resultado;

	}
	/* otra forma:
	 * public int compareTo(Product product){ 
	 * return this.price - product.price;
	 * }
	 */

	public String getName() {
		return this.name;
	}

}
