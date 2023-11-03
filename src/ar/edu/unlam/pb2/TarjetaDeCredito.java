package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Tarjeta {

	private Long numero;
	private String titular;
	private String fechaDeVencimiento;
	private Integer codigoDeSeguridad;
	private final Double LIMITE_DE_COMPRA_EN_PESOS;
	private final Double LIMITE_DE_COMPRA_EN_DOLARES;
	
	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento, Integer codigoDeSeguridad, Double limiteDeCompraEnPesos, Double limiteDeCompraEnDolares) throws NumeroDeTarjetaInvalidoException {
		super(numero, titular, fechaDeVencimiento, codigoDeSeguridad);
		this.LIMITE_DE_COMPRA_EN_PESOS = limiteDeCompraEnPesos;
		this.LIMITE_DE_COMPRA_EN_DOLARES = limiteDeCompraEnDolares;
		
	}
	

	@Override
	public void setSaldo(Double saldo) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public Object getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}


	
	public Double getLimiteDeCompraEnPesos() {
		return this.LIMITE_DE_COMPRA_EN_PESOS;
	}
	
	
	public Double getLimiteDeCompraEnDolares() {
		return this.LIMITE_DE_COMPRA_EN_DOLARES;
	}

}
