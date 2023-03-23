package bytebank;

public class TestReferencias {

	public static void main(String[] args) {

		// Element more generic can be adapted to the element more specific
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");

		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");

		funcionario.setSalario(2000);
		gerente.setSalario(10000);

		gerente.iniciarSesion("_dddd");

	}
}
