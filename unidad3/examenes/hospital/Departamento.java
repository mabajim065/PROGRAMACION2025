package unidad3.examenes.hospital;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String id;
	private String nombre;
	private List<Empleado> empleados;
	private double presupuesto;

	// Constructor vacío
	public Departamento() {
		this.id = "";
		this.nombre = "";
		this.empleados = new ArrayList<>();
		this.presupuesto = 0.0;
	}

	// Constructor con parámetros
	public Departamento(String id, String nombre, double presupuesto) {
		this.id = id;
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
		this.presupuesto = presupuesto;
	}

	// Métodos para agregar empleados
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	// Método para obtener empleados con salario mayor
	public List<Empleado> obtenerEmpleadosConSalarioMayor(double salario) {
		List<Empleado> empleadosFiltrados = new ArrayList<>();
		for (Empleado empleado : empleados) {
			if (empleado.obtenerSalario() > salario) {
				empleadosFiltrados.add(empleado);
			}
		}
		return empleadosFiltrados;
	}

	// Método para calcular presupuesto gastado
	public double calcularPresupuestoGastado() {
		double totalGastado = 0.0;
		for (Empleado empleado : empleados) {
			totalGastado += empleado.obtenerSalario();
		}
		return totalGastado;
	}

	public String getNombre() {
		return nombre;
	}
}
