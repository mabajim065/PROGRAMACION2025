package unidad3.examenes.hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private String id;
	private String nombre;
	private String ubicacion;
	private List<Departamento> departamentos;
	private List<Empleado> empleados;

	// Constructor vacío
	public Hospital() {
		this.id = "";
		this.nombre = "";
		this.ubicacion = "";
		this.departamentos = new ArrayList<>();
		this.empleados = new ArrayList<>();
	}

	// Constructor con parámetros
	public Hospital(String id, String nombre, String ubicacion) {
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.departamentos = new ArrayList<>();
		this.empleados = new ArrayList<>();
	}

	// Métodos para agregar departamentos y empleados
	public void agregarDepartamento(Departamento depto) {
		departamentos.add(depto);
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	// Método para obtener el número de departamentos
	public int numDepartamentos() {
		return departamentos.size();
	}

	// Método para obtener el empleado más antiguo
	public Empleado empleadoMasAntiguo() {
		Empleado empleadoAntiguo = null;
		for (Empleado empleado : empleados) {
			if (empleadoAntiguo == null || empleado.getAñosExperiencia() > empleadoAntiguo.getAñosExperiencia()) {
				empleadoAntiguo = empleado;
			}
		}
		return empleadoAntiguo;
	}

	// Método para obtener empleados con mayor salario
	public List<Empleado> empleadosConMayorSalario() {
		List<Empleado> empleadosAltosSalarios = new ArrayList<>();
		double salarioMaximo = 0.0;
		for (Empleado empleado : empleados) {
			if (empleado.obtenerSalario() > salarioMaximo) {
				salarioMaximo = empleado.obtenerSalario();
			}
		}
		for (Empleado empleado : empleados) {
			if (empleado.obtenerSalario() == salarioMaximo) {
				empleadosAltosSalarios.add(empleado);
			}
		}
		return empleadosAltosSalarios;
	}

	// Método para calcular los gastos del hospital
	public double calcularGastosHospital() {
		double totalGastos = 0.0;
		for (Empleado empleado : empleados) {
			totalGastos += empleado.obtenerSalario();
		}
		return totalGastos;
	}
}
