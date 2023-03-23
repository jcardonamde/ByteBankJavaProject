package bytebank;

public class ControlBonificacion {

	private double suma;

	// Apply Polymorphism
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}

	/*
	 * public double registrarSalario(Gerente gerente) { this.suma =
	 * gerente.getBonificacion() + this.suma; System.out.println("Calculo actual: "
	 * + this.suma); return this.suma; }
	 * 
	 * public double registrarSalario(Contador contador) { this.suma =
	 * contador.getBonificacion() + this.suma; System.out.println("Calculo actual: "
	 * + this.suma); return this.suma; } When do you have a method but with
	 * different names, you a have a overload in your method
	 */
}