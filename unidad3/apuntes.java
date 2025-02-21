package unidad3;

import java.util.ArrayList;
import java.util.List;

import unidad3.examenes.avion.Pasajero1;
import unidad3.examenes.ciclista.Ciclistas;
import unidad3.examenes.hospital.Departamento;
import unidad3.examenes.libreria.Libro;
import unidad3.examenes.mazmorra.Monstruo2;
import unidad3.examenes.mazmorra.Trampa2;

public class apuntes {

	// Devuelve el número total de pasajeros en la lista
	public int numPasajeros() {
		return this.listaPasajeros.length; // Solo devuelve la longitud del array
	}

	// Devuelve el número de pasajeros con una edad mayor o igual a la que le pases
	// como parámetro
	public int numPasajeros(int edad) {
		int cantPasajeros = 0;
		// Recorremos todos los pasajeros en la lista
		for (int i = 0; i < this.listaPasajeros.length; i++) {
			if (listaPasajeros[i].getEdad() >= edad) {
				cantPasajeros++; // Si el pasajero tiene la edad que buscamos, lo contamos
			}
		}
		return cantPasajeros;
	}

	// Devuelve la edad media de los pasajeros
	public float edadMedia() {
		double sumaEdad = 0;
		// Sumamos todas las edades de los pasajeros
		for (int i = 0; i < this.listaPasajeros.length; i++) {
			sumaEdad += this.listaPasajeros[i].getEdad();
		}
		// Devolvemos el promedio
		return (float) (sumaEdad / this.listaPasajeros.length);
	}

	// Elimina un pasajero de la lista por su NIF
	public int eliminarPasajero(String nif) {
		// Creamos un "pasajero vacío" para reemplazar al que vamos a eliminar
		Pasajero1 vacio = new Pasajero1(1, "vacio", "vacio", 1, 'M', "1", "", false);
		// Buscamos al pasajero con ese NIF
		for (int i = 0; i < this.listaPasajeros.length; i++) {
			if (nif.equals(this.listaPasajeros[i].getNif())) {
				listaPasajeros[i] = vacio; // Reemplazamos con el pasajero vacío
				return 1; // Lo eliminamos con éxito
			}
		}
		return 0; // No encontramos el pasajero
	}

	// Devuelve el número total de ciclistas
	public int numCiclistas() {
		return numCiclistas; // Simplemente devuelve el contador de ciclistas
	}

	// Devuelve el peso máximo de los ciclistas
	public float maxPeso() {
		float maxPeso = 0;
		// Comparamos el peso de cada ciclista para encontrar el mayor
		for (int i = 0; i < ciclistas.length; i++) {
			maxPeso = Math.max(maxPeso, ciclistas[i].getPeso()); // Actualizamos el máximo si encontramos uno mayor
		}
		return maxPeso;
	}

	// Devuelve el número de ciclistas con una especialidad específica
	public int numCiclistas(String especialidad) {
		int contador = 0;
		// Comprobamos todos los ciclistas para ver cuántos tienen la especialidad que
		// buscamos
		for (int i = 0; i < ciclistas.length; i++) {
			if (ciclistas[i].getEspecialidad().equals(especialidad)) {
				contador++;
			}
		}
		return contador;
	}

	// Busca un ciclista por su nombre y lo devuelve, o -1 si no lo encuentra
	public Ciclistas buscarCiclista(String nombre) {
		for (int i = 0; i < ciclistas.length; i++) {
			if (ciclistas[i].getNombre().equals(nombre)) {
				return ciclistas[i]; // Si lo encuentra, lo devuelve
			}
		}
		return null; // Si no lo encuentra, devuelve null
	}

	// Añade un ciclista al equipo, si hay espacio
	public int anadirCiclista(Ciclistas cicli) {
		if (numCiclistas >= ciclistas.length) {
			// Si no hay espacio, aumenta el tamaño del array
			Ciclistas[] nuevoArray = new Ciclistas[numCiclistas + 1];
			// Copiamos los ciclistas al nuevo array
			for (int i = 0; i < ciclistas.length; i++) {
				nuevoArray[i] = ciclistas[i];
			}
			// Añadimos el nuevo ciclista al final
			nuevoArray[numCiclistas] = cicli;
			ciclistas = nuevoArray; // Actualizamos el array de ciclistas
		} else {
			// Si hay espacio, simplemente lo añadimos
			ciclistas[numCiclistas] = cicli;
		}
		numCiclistas++; // Aumentamos el contador
		return 0; // Todo bien
	}

	// Elimina un ciclista por su índice en el array
	public void eliminarCiclistas(int indice) {
		if (indice >= 0 && indice < ciclistas.length) {
			// Si el índice es válido, eliminamos al ciclista
			ciclistas[indice] = null; // Podemos reemplazarlo con null
		}
	}

	// Devuelve el número de personas en la familia
	public int numPersonas() {
		return this.listaPersonas.length;
	}

	// Devuelve el número de personas con ingresos inferiores al parámetro
	public int numPersonasIngresos(int ingreso) {
		int numPersonas = 0;
		for (int i = 0; i < listaPersonas.length; i++) {
			if (listaPersonas[i].getIngresos() < ingreso) {
				numPersonas++;
			}
		}
		return numPersonas;
	}

	// Suma los ingresos de todos los miembros de la familia
	public void sumaIngresos() {
		for (int i = 0; i < listaPersonas.length; i++) {
			ingresosMensuales += listaPersonas[i].getIngresos();
		}
	}

	// Asigna el rol de progenitor a una persona, si no lo tiene
	public boolean asignarRolProgenitor(String nombre) {
		for (int i = 0; i < listaPersonas.length; i++) {
			if (nombre.equals(listaPersonas[i].getNombre()) && !listaPersonas[i].isEsProgenitor()) {
				listaPersonas[i].setEsProgenitor(true);
				return true; // Rol asignado con éxito
			}
		}
		return false; // No se encontró la persona o ya es progenitor
	}

	// Añadir departamentos y empleados
	public void agregarDepartamento(Departamento depto) {
		departamentos.add(depto);
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	// Número de departamentos
	public int numDepartamentos() {
		return departamentos.size();
	}

	// Encuentra el empleado más antiguo
	public Empleado empleadoMasAntiguo() {
		Empleado empleadoAntiguo = null;
		for (Empleado empleado : empleados) {
			if (empleadoAntiguo == null || empleado.getAñosExperiencia() > empleadoAntiguo.getAñosExperiencia()) {
				empleadoAntiguo = empleado;
			}
		}
		return empleadoAntiguo;
	}

	// Encontrar los empleados con el salario más alto
	public List<Empleado> empleadosConMayorSalario() {
		List<Empleado> empleadosAltosSalarios = new ArrayList<>();
		double salarioMaximo = 0.0;
		for (Empleado empleado : empleados) {
			if (empleado.obtenerSalario() > salarioMaximo) {
				salarioMaximo = empleado.obtenerSalario();
			}
		}

		// Añadir a la lista de empleados con el salario más alto
		for (Empleado empleado : empleados) {
			if (empleado.obtenerSalario() == salarioMaximo) {
				empleadosAltosSalarios.add(empleado);
			}
		}
		return empleadosAltosSalarios;
	}

	// Calcular los gastos totales del hospital
	public double calcularGastosHospital() {
		double totalGastos = 0.0;
		for (Empleado empleado : empleados) {
			totalGastos += empleado.obtenerSalario();
		}
		return totalGastos;
	}

	// Prestar un libro
	public boolean prestarLibro(String titulo) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(titulo) && !libro.getPrestado()) {
				libro.setPrestado(true);
				return true;
			}
		}
		return false;
	}

	// Devolver un libro
	public boolean devolverLibro(Libro libro) {
		if (libro.getPrestado()) {
			libro.setPrestado(false);
			librosPrestados--;
			return true;
		}
		return false;
	}

	// Comprobar trampas activas
	public boolean regularTrampas(int nivel) {
		int numTrampas = 0;
		for (Trampa2 t : listaTra) {
			if (!t.activa)
				return false;
			if (t.getNivel() == nivel) {
				numTrampas++;
				if (numTrampas > 3)
					return false;
			}
		}
		return true;
	}

	// Encontrar al "final boss"
	public Monstruo2 enemigoFinal() {
		int maxAtaqueMon = Integer.MIN_VALUE;
		int posMon = -1;

		for (int i = 0; i < listaMon.length; i++) {
			if (listaMon[i].getAtaque() > maxAtaqueMon) {
				maxAtaqueMon = listaMon[i].getAtaque();
				posMon = i;
			}
		}
		return listaMon[posMon];
	}
}
