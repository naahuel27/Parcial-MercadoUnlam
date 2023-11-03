package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio{

	private String nombre;
	private Long cuit;
	
	public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
		this.nombre = nombre;
		this.setCuit(cuit);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) throws CuitInvalidoException {
		Integer longitud = cuit.toString().length();
		String primerosNumeros = cuit.toString().substring(0, 2);
		
		if (longitud != 11 || !(primerosNumeros.equals("30"))) {
			throw new CuitInvalidoException("El cuit ingresado es invalido");
		}
		
		this.cuit = cuit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuit, other.cuit);
	}
	
	
	
	
}
