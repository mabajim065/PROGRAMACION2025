package unidad3.examenes.ciclista;

public class EquipoCiclista5 {

	    // Atributos de la clase EquipoCiclista
	    private String identificador;  // Identificador del equipo (puede contener números y letras)
	    public String nombreEquipo;    // Nombre del equipo (público)
	    private int numeroCiclistas;   // Número de ciclistas en el equipo
	    private Ciclista5[] ciclistas;  // Array de ciclistas

	    // Constructor vacío
	    public EquipoCiclista5() {
	        // Generar valores numéricos aleatorios
	        this.identificador = "";  // Inicializar identificador como cadena vacía
	        this.nombreEquipo = "";   // Inicializar nombre del equipo como cadena vacía
	        this.numeroCiclistas = (int) (Math.random() * 10); // Número aleatorio de ciclistas entre 0 y 9

	        // Inicializar el array de ciclistas con un tamaño aleatorio
	        this.ciclistas = new Ciclista5[this.numeroCiclistas];
	        for (int i = 0; i < this.numeroCiclistas; i++) {
	            this.ciclistas[i] = new Ciclista5(); // Crear ciclistas con valores aleatorios
	        }
	    }

	    // Constructor con parámetros
	    public EquipoCiclista5(String identificador, String nombreEquipo, int numeroCiclistas, Ciclista5[] ciclistas) {
	        this.identificador = identificador;
	        this.nombreEquipo = nombreEquipo;
	        this.numeroCiclistas = numeroCiclistas;
	        this.ciclistas = ciclistas;
	    }

	    // Métodos get y set para cada atributo
	    public String getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(String identificador) {
	        this.identificador = identificador;
	    }

	    public int getNumeroCiclistas() {
	        return numeroCiclistas;
	    }

	    public void setNumeroCiclistas(int numeroCiclistas) {
	        this.numeroCiclistas = numeroCiclistas;
	    }

	    public Ciclista5[] getCiclistas() {
	        return ciclistas;
	    }

	    public void setCiclistas(Ciclista5[] ciclistas) {
	        this.ciclistas = ciclistas;
	    }

	    // Método para obtener el número de ciclistas en el equipo
	    public int numCiclistas() {
	        return this.numeroCiclistas;
	    }

	    // Método para obtener el peso máximo de los ciclistas
	    public float maxPeso() {
	        float maxPeso = 0;
	        for (Ciclista5 ciclista : this.ciclistas) {
	            if (ciclista.getPeso() > maxPeso) {
	                maxPeso = ciclista.getPeso();
	            }
	        }
	        return maxPeso;
	    }

	    // Método para obtener el número de ciclistas de una especialidad específica
	    public int numCiclistas(String especialidad) {
	        int count = 0;
	        for (Ciclista5 ciclista : this.ciclistas) {
	            if (ciclista.getEspecialidad().equals(especialidad)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Método para buscar un ciclista por nombre
	    public Ciclista5 buscarCiclista(String nombre) {
	        for (Ciclista5 ciclista : this.ciclistas) {
	            if (ciclista.getNombre().equals(nombre)) {
	                return ciclista;
	            }
	        }
	        return null; // Devuelve null si no encuentra el ciclista
	    }

	    // Método para añadir un ciclista al equipo
	    public int anadirCiclista(Ciclista5 cicli) {
	        try {
	            // Crear un nuevo array con una posición más
	            Ciclista5[] nuevoArray = new Ciclista5[this.ciclistas.length + 1];

	            // Copiar los ciclistas del array original al nuevo array
	            for (int i = 0; i < this.ciclistas.length; i++) {
	                nuevoArray[i] = this.ciclistas[i];
	            }

	            // Añadir el nuevo ciclista en la última posición
	            nuevoArray[this.ciclistas.length] = cicli;

	            // Asignar el nuevo array como el array de ciclistas del equipo
	            this.ciclistas = nuevoArray;
	            this.numeroCiclistas++;

	            return 0; // Todo ha ido bien
	        } catch (Exception e) {
	            return -1; // Ha ocurrido un error
	        }
	    }
	}