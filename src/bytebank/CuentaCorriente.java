package bytebank;


public class CuentaCorriente extends Cuenta {

	// Constructor for default
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	// Over-write this method from Account
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		// with Super we can access to methods from the mother class
		return super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		
	}

//	// Implementado por la abstracción
//	@Override
//	public void depositar(double valor) {
//		this.saldo += valor;
//	}
//	
//	@Override
//    public double getValorImpuesto() {
//        return super.saldo * 0.01;
//    }
}
