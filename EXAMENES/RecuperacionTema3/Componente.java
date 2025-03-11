package EXAMENES.RecuperacionTema3;

public class Componente {
	public static final int PROCESADOR = 1;
	public static final int MEMORIA = 2;
	public static final int CPU = 3;
	public static final int GRAFICA = 4;
	public static int length;

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void remove(int id2) {
		// TODO Auto-generated method stub

	}

	private int id;
	private String nombre;
	private String marca;
	private String modelo;
	private int tipo;
	private float potenciaWatts;
	private String compatibilidad;

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	/**
	 * @param id
	 * @param nombre
	 * @param marca
	 * @param modelo
	 * @param tipo
	 * @param potenciaWatts
	 * @param compatibilidad
	 */
	public Componente(int id, String nombre, String marca, String modelo, int tipo, float potenciaWatts,
			String compatibilidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.potenciaWatts = potenciaWatts;
		this.compatibilidad = compatibilidad;
	}

	/**
	 * 
	 */
	public Componente() {
		super();
		this.id = (int) (Math.random() * 1000);
		this.nombre = "";
		this.marca = "";
		this.modelo = "";
		this.tipo = 0;
		this.potenciaWatts = (int) (Math.random() * 500);
		this.compatibilidad = "";
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the potenciaWatts
	 */
	public float getPotenciaWatts() {
		return potenciaWatts;
	}

	/**
	 * @param potenciaWatts the potenciaWatts to set
	 */
	public void setPotenciaWatts(float potenciaWatts) {
		this.potenciaWatts = potenciaWatts;
	}

	/**
	 * @return the compatibilidad
	 */
	public String getCompatibilidad() {
		return compatibilidad;
	}

	/**
	 * @param compatibilidad the compatibilidad to set
	 */
	public void setCompatibilidad(String compatibilidad) {
		this.compatibilidad = compatibilidad;
	}

	/**
	 * @return the procesador
	 */
	public static int getProcesador() {
		return PROCESADOR;
	}

	/**
	 * @return the memoria
	 */
	public static int getMemoria() {
		return MEMORIA;
	}

	/**
	 * @return the cpu
	 */
	public static int getCpu() {
		return CPU;
	}

	/**
	 * @return the grafica
	 */
	public static int getGrafica() {
		return GRAFICA;
	}

	/**************************************************************
	 * TO STRING
	 *************************************************************/
	@Override
	public String toString() {
		return "Componente:" + "\n**********************************************" + "\nid=" + id + "\nnombre=" + nombre
				+ "\nmarca=" + marca + "\nmodelo=" + modelo + "\ntipo=" + tipo + "\npotenciaWatts=" + potenciaWatts
				+ "\ncompatibilidad=" + compatibilidad + "\n**********************************************";
	}

}
