package unidad3ejercicios;

public class RECUERDOS {

	/******************************************************************************
	 * 1.Crear una clase denominada recuerdo, la cual tendrá como variables miembro
	 * las siguientes (nombre,duración, fidelidad(porcentaje de 1 a 100),
	 ******************************************************************************/

	// Aquí están las variables de la clase, que van a almacenar la información del
	// recuerdo
	private String nombre; // El nombre del recuerdo, como "Primer día de clases"
	private int duracion; // Cuánto dura el recuerdo en minutos (por ejemplo, 120 minutos)
	private int fidelidad; // Qué tan claro o fiel es el recuerdo, de 1 a 100 (100 es lo más fiel)

	// Constructor vacío: Este se usa cuando no se le pasan datos al crear el
	// objeto.
	// Lo que hace es poner valores predeterminados, como un "relleno".
	public RECUERDO() {
	        this.nombre = "Recuerdo desconocido"; // Si no me dices el nombre, lo pongo como "Desconocido"
	        this.duracion = 0; // Si no me dices cuánto dura, pongo 0 minutos por defecto
	        this.fidelidad = 50; // Y pongo una fidelidad media (50%) por defecto
	    }

	// Constructor con parámetros: Este sirve cuando ya sabes qué valores quieres
	// poner
	// Aquí puedes pasar el nombre, duración y fidelidad directamente cuando creas
	// el objeto.
	public RECUERDO(String nombre, int duracion, int fidelidad) {
	        this.nombre = nombre;   // Se asigna el nombre que pasas al crear el objeto
	        this.duracion = duracion; // Se asigna la duración que pasas al crear el objeto
	        this.fidelidad = fidelidad; // Se asigna la fidelidad que pasas al crear el objeto
	    }

	// Aquí van los "getters" y "setters". Son métodos que te permiten conseguir o
	// cambiar
	// la información del objeto después de que lo has creado.

	// Getter para el nombre: Este te devuelve el nombre del recuerdo cuando lo
	// llamas
	public String getNombre() {
		return nombre; // Aquí simplemente devuelvo el valor de "nombre"
	}

	// Setter para el nombre: Este te permite cambiar el nombre del recuerdo después
	// de crear el objeto
	public void setNombre(String nombre) {
		this.nombre = nombre; // Cambia el nombre del recuerdo por el que pasas como parámetro
	}

	// Getter para la duración: Este te devuelve el valor de la duración cuando lo
	// llamas
	public int getDuracion() {
		return duracion; // Devuelvo el valor de "duracion"
	}

	// Setter para la duración: Este te permite cambiar la duración del recuerdo
	// después de crear el objeto
	public void setDuracion(int duracion) {
		this.duracion = duracion; // Cambia la duración del recuerdo por la que pasas como parámetro
	}

	// Getter para la fidelidad: Este te devuelve el valor de fidelidad cuando lo
	// llamas
	public int getFidelidad() {
		return fidelidad; // Devuelvo el valor de "fidelidad"
	}

	// Setter para la fidelidad: Este te permite cambiar la fidelidad del recuerdo
	// después de crearlo
	public void setFidelidad(int fidelidad) {
		// Aquí hago una pequeña comprobación para asegurarme de que la fidelidad esté
		// entre 1 y 100
		if (fidelidad >= 1 && fidelidad <= 100) {
			this.fidelidad = fidelidad; // Si está bien, cambio la fidelidad
		} else {
			// Si no está entre 1 y 100, muestro un mensaje diciendo que algo salió mal
			System.out.println("La fidelidad debe estar entre 1 y 100.");
		}
	}

	// Este método es solo para mostrar la información del recuerdo de manera bonita
	public void mostrarRecuerdo() {
		// Imprime en pantalla el nombre, duración y fidelidad del recuerdo
		System.out.println("Recuerdo: " + nombre);
		System.out.println("Duración: " + duracion + " minutos");
		System.out.println("Fidelidad: " + fidelidad + "%");
	}
}
