package bytebank;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario yoto = new Contador();
		yoto.setNombre("Jonathan");
		yoto.setDocumento("123456789");
		yoto.setSalario(3000);
		yoto.setTipo(0);
		
		System.out.println(yoto.getSalario());
		System.out.println(yoto.getBonificacion());
	}
}