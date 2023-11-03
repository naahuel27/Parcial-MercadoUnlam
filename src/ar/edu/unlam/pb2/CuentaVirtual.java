package ar.edu.unlam.pb2;

public class CuentaVirtual extends Cuenta{

	private String cvu;

	public CuentaVirtual(String numero, String entidad, String titular) throws CVUInvalidoException {
		super(numero, entidad, titular);
		this.setNumero(numero);
	}

	public void setNumero(String numero) throws CVUInvalidoException {
		if (numero.toString().length() != 23) {
			throw new CVUInvalidoException("El numero de CVU es invalido");
		}
		
		this.cvu = numero;
	}
	

	

}
