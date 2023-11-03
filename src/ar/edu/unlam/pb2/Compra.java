package ar.edu.unlam.pb2;

public class Compra {

	private Double importeDeCompra;
	private Comercio comercio;

	public Compra(Comercio comercio, Double importeDeCompra) {
		this.comercio = comercio;
		this.importeDeCompra = importeDeCompra;
	}

}
