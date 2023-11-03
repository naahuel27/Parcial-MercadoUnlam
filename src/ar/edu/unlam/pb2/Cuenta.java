package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Cuenta implements Transferible, MedioDePago {
	
	private String numero;
	private String entidad;
	private String titular;
	private Double saldo;

	public Cuenta(String numero, String entidad, String titular) {
		this.numero = numero;
		this.entidad = entidad;
		this.titular = titular;
	}
		

	@Override
	public Double getSaldo() {
		return this.saldo;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String getNumero() {
		return this.numero;
	}

	@Override
	public String getEntidad() {
		return this.entidad;
	}

	@Override
	public String getTitular() {
		return this.titular;
	}


	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Cuenta other = (Cuenta) obj;
		return Objects.equals(numero, other.numero);
	}
	
	
}
