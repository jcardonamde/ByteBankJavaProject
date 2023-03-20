package bytebank;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	// Implementado por la abstracción
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

}
