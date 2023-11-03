package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends Tarjeta{
	
	
	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento, Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		super(numero, titular, fechaDeVencimiento, codigoDeSeguridad);
		
	}
	
	
	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		
		
		return null;
	}


	
	


	

	
}
