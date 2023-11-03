package ar.edu.unlam.pb2;

public class CuentaBancaria extends Cuenta{

	private String cbu;

	public CuentaBancaria(String numero, String entidad, String titular) throws CBUInvalidoException {
		super(numero, entidad, titular);
		this.setNumero(numero);
	}

	public void setNumero(String numero) throws CBUInvalidoException {
		if (numero.toString().length() != 20) {
			throw new CBUInvalidoException("El numero de CBU es invalido");
		}
		
		this.cbu = numero;
	}
	
	

	

}
