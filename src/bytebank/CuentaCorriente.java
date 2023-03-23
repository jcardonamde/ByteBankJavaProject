package bytebank;

public class CuentaCorriente extends Cuenta {

	// Constructor for default
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	// Over-write this method from Account
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.retirar(valorASacar);
		// with Super we can access to methods from the mother class
	}

	@Override
	public void depositar(double valor) {

	}
}
