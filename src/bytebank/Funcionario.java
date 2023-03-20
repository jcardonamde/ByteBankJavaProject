package bytebank;

// Una clase abstract no puede ser instanciada porque es una representación conceptual mas no fisica.
// Para crear una instancia, es necesario crear primero una clase hija no abstracta.
public abstract class Funcionario {

	private String nombre;
	private String documento;
	private double salario;
	private int tipo;

	// Constructor for default
	public Funcionario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

//	public double getBonificacion() {
//		return this.salario * 0.05;
//	}

	// An abstract method has no body, it only define the sign(visibility, return, method name and parameters).
	public abstract double getBonificacion();

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}