package unidad3.examenes.ciclista;

public class Ciclista5 {

	    // Atributos privados de la clase Ciclista
	    private int identificador;  // Identificador numérico del ciclista
	    private String nombre;      // Nombre del ciclista
	    private int edad;           // Edad del ciclista
	    private String modeloBici;  // Modelo de la bicicleta del ciclista
	    private float peso;         // Peso del ciclista
	    private String posicion;    // Posición del ciclista en el equipo
	    private String especialidad; // Especialidad del ciclista (montaña, contrareloj, todoterreno)

	    // Constructor vacío
	    public Ciclista5() {
	        // Generar valores numéricos aleatorios
	        this.identificador = (int) (Math.random() * 1000); // Identificador aleatorio entre 0 y 999
	        this.edad = (int) (Math.random() * 50) + 18; // Edad aleatoria entre 18 y 67
	        this.peso = (float) (Math.random() * 100) + 50; // Peso aleatorio entre 50 y 150 kg

	        // Inicializar cadenas de texto vacías
	        this.nombre = "";
	        this.modeloBici = "";
	        this.posicion = "";
	        this.especialidad = "";
	    }

	    // Constructor con parámetros
	    public Ciclista5(int identificador, String nombre, int edad, String modeloBici, float peso, String posicion, String especialidad) {
	        this.identificador = identificador;
	        this.nombre = nombre;
	        this.edad = edad;
	        this.modeloBici = modeloBici;
	        this.peso = peso;
	        this.posicion = posicion;
	        this.especialidad = especialidad;
	    }

	    // Métodos get y set para cada atributo
	    public int getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(int identificador) {
	        this.identificador = identificador;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public String getModeloBici() {
	        return modeloBici;
	    }

	    public void setModeloBici(String modeloBici) {
	        this.modeloBici = modeloBici;
	    }

	    public float getPeso() {
	        return peso;
	    }

	    public void setPeso(float peso) {
	        this.peso = peso;
	    }

	    public String getPosicion() {
	        return posicion;
	    }

	    public void setPosicion(String posicion) {
	        this.posicion = posicion;
	    }

	    public String getEspecialidad() {
	        return especialidad;
	    }

	    public void setEspecialidad(String especialidad) {
	        this.especialidad = especialidad;
	    }

	    // Método toString para mostrar los detalles del ciclista
	    @Override
	    public String toString() {
	        return "Ciclista: *************************************************************\n" +
	               "Nombre: <" + nombre + ">\n" +
	               "Identificador: <" + identificador + ">\n" +
	               "Edad: <" + edad + ">\n" +
	               "Modelo de Bicicleta: <" + modeloBici + ">\n" +
	               "Peso: <" + peso + ">\n" +
	               "Posición: <" + posicion + ">\n" +
	               "Especialidad: <" + especialidad + ">\n" +
	               "*************************************************************";
	    }
	}