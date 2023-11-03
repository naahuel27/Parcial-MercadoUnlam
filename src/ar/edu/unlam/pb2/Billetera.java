package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Billetera {

	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;
	private Map<MedioDePago, Consumidor> mediosDePago;
	private List<Compra> compras;
	
	public Billetera(String nombre) {
		this.comercios = new HashSet<>();
		this.consumidores = new TreeSet<>();
		this.mediosDePago = new HashMap<>();
		this.compras = new ArrayList<>();
		this.nombre = nombre;
	}

	public Integer getCantidadDeConsumidores() {
		return this.consumidores.size();
	}

	public void agregarComercio(Comercio comercio) { 
		this.comercios.add(comercio);
		
	}

	private Comercio getComercio(Comercio comercioBuscado) {
		for (Comercio comercio : this.comercios) {
			if (comercio.equals(comercioBuscado)) {
				return comercio;
			}
		}
		return null;
		
	}

	public Integer getCantidadDeComercios() {
		return this.comercios.size();
	}

	public void agregarConsumidor(Consumidor consumidor) {
		this.consumidores.add(consumidor);
	}

	public void agregarMedioDePago(Integer dni, MedioDePago medioDePago) throws NoCoincideTitularException, DniInvalido{
		Consumidor consumidorBuscado = buscarConsumidorPorId(dni);
		
		if (!medioDePago.getTitular().equals(consumidorBuscado.getNombre())) {
			throw new NoCoincideTitularException("El titular ingresado no coincide con el titular del medio de pago ingresado");
		}
		
		this.mediosDePago.put(medioDePago, consumidorBuscado);
	}

	public Consumidor buscarConsumidorPorId(Integer dni) throws DniInvalido {
		for (Consumidor consumidor : this.consumidores) {
			if (consumidor.getDni().equals(dni)) {
				return consumidor;
			}
		}
		
		throw new DniInvalido("El dni ingresado es invalido");
	}

	public Integer getCantidadDeMediosDePago(Integer dni) throws DniInvalido {
		Integer contador = 0;
		Consumidor consumidorBuscado = buscarConsumidorPorId(dni);
		
		for (Map.Entry<MedioDePago, Consumidor> entry : this.mediosDePago.entrySet()) {
			MedioDePago key = entry.getKey();
			Consumidor val = entry.getValue();
			
			if (consumidorBuscado.equals(val)) {
				contador++;
			}
		}
		
		
		return contador;
	}

	public Compra generarCodigoQR(Long cuit, Double importeDeCompra) throws CuitInvalidoException {
		Comercio comercioBuscado = buscarComercioPorCuit(cuit);
		
		Compra compra = new Compra(comercioBuscado, importeDeCompra);
		this.compras.add(compra);
		
		return compra;
	}

	private Comercio buscarComercioPorCuit(Long cuit) throws CuitInvalidoException {
		for (Comercio comercio : this.comercios) {
			if (comercio.getCuit().equals(cuit)) {
				return comercio;
			}
		}
		
		
		throw new CuitInvalidoException("El cuit ingresado es invalido");
	}

	
}
