package bytebank;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(2000);
		try {
			cuenta.retirar(2000);
			cuenta.retirar(100);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
