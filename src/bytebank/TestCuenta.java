package bytebank;

public class TestCuenta {

	public static void main(String[] args) throws SaldoInsuficienteException {

		CuentaCorriente cc = new CuentaCorriente(111, 111);
		cc.depositar(1000);

		CuentaAhorros ca = new CuentaAhorros(222, 222);
		ca.depositar(2000);

		cc.transferir(1100, ca);

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CA: " + ca.getSaldo());
	}
}