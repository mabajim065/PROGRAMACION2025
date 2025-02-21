package unidad3.examenes.hospital;

public class Empleado {

	private String id;
	private String nombre;
	private int edad;
	private double salario;
	private Departamento departamento;
	private int añosExperiencia;

	// Constructor vacío
	public Empleado() {
		this.id = "";
		this.nombre = "";
		this.edad = 0;
		this.salario = 0.0;
		this.departamento = null;
		this.añosExperiencia = 0;
	}

	// Constructor con parámetros
	public Empleado(String id, String nombre, int edad, double salario, Departamento departamento,
			int añosExperiencia) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.departamento = departamento;
		this.añosExperiencia = añosExperiencia;
	}

	// Métodos getters y setters
	public double obtenerSalario() {
		return salario;
	}

	public String obtenerCargo() {
		if (departamento != null && departamento.getNombre().equals("Médico")) {
			return "Médico";
		} else {
			return "Personal Administrativo";
		}
	}

	public void cambiarDepartamento(Departamento depto) {
		this.departamento = depto;
	}

	public void cambiarSalario(double porcentaje) {
		this.salario += this.salario * (porcentaje / 100);
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}
}
