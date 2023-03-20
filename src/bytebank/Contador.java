package bytebank;

public class Contador extends Funcionario {

	//@Override
	public double getBonificacion() {
		// Over-write method
		System.out.println("Ejecutando desde Contador");
		return 200;
	}
}