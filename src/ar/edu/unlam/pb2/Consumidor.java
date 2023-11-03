package ar.edu.unlam.pb2;

import java.util.Objects;

public class Consumidor implements Comparable<Consumidor>{

	private String nombre;
	private Integer dni;
	
	public Consumidor(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(dni, other.dni);
	}


	@Override
	public int compareTo(Consumidor o) {
		return this.nombre.compareTo(o.getNombre());
	}

	public Object getMedioPagador(long l) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
