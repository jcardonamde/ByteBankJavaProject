package bytebank;

// Entity Account:
public abstract class Cuenta {

	// Attributes
	// private double saldo; // No can modified the variable
	protected double saldo; // It's available from the child class
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	// This variable is not the instance is for the Class
	private static int total = 0;

	public Cuenta() {

	}

	// Los constructores no se heredan
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una Cuenta");

		Cuenta.total++;
	}

	// Define Method for Deposit Account
	public abstract void depositar(double valor);

	// This method return a value
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }
	
	public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

////Define Method for Deposit Account
//public void depositar(double valor) {
//	// Void is a method that no return nothing
//	this.saldo += valor;
//}

}