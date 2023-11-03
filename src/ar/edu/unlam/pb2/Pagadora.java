package ar.edu.unlam.pb2;

public interface Pagadora {

	Boolean pagar(Persona vendedor, Double importe);

	void setSaldo(Double saldo);

	Object getNumero();

	Object getTitular();

	Object getCodigoDeSeguridad();

	Object getFechaDeVencimiento();

	Object getSaldo();


	
}

