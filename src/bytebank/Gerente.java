package bytebank;

//Gerente extends from Funcionario which means inheriting from Funcionario
public class Gerente extends Funcionario implements Autenticable {

	// Over-write of the method
	public double getBonificacion() {
		// Over-write method
		System.out.println("Ejecutando desde Gerente");
		// with Super we can access to methods from the father class
		// return super.getSalario() + this.getSalario() * 0.05;
		return 2000;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return false;
	}

	@Override
	public void setClave(String clave) {
		
	}
}