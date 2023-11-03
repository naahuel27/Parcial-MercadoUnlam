package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Tarjeta implements Pagadora, MedioDePago {
	
	private Long numero;
	private String titular;
	private String fechaDeVencimiento;
	private Integer codigoDeSeguridad;
	private Double saldo;
	
	public Tarjeta(Long numero, String titular, String fechaDeVencimiento, Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setTitular(titular);;
		this.setFechaDeVencimiento(fechaDeVencimiento);;
		this.setNumero(numero);

	
	}	
	
	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	@Override
	public Long getNumero() {
		return this.numero;
	}


	@Override
	public String getTitular() {
		return this.titular;
	}


	@Override
	public Integer getCodigoDeSeguridad() {
		return this.codigoDeSeguridad;
	}


	@Override
	public String getFechaDeVencimiento() {
		return this.fechaDeVencimiento;
	}


	@Override
	public Object getSaldo() {
		return this.saldo;
	}

	


	public void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException {
		if (numero.toString().length() != 16) {
			throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta es invalido");
		}
		
		this.numero = numero;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}


	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
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
		
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(numero, other.numero);
	}
	
	

}