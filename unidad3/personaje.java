package unidad3;

public class personaje {
	// variables miembro de la clase

	// estas si son accequibles directamente dese el objeto
	public int fuerza;
	public int inteligencia;
	public int carisma;

	// no son accequible directamente desde el objeto
	public int puntosvida;
	private int puntospoder;

	/**
	 * contructor vacio
	 */

	public personaje() {
		System.out.println(" generando el personaje...");
		this.fuerza = (int) (Math.random() * 20);
		this.inteligencia = (int) (Math.random() * 20);
		this.carisma = (int) (Math.random() * 20);
		this.puntosvida = (int) (Math.random() * 20);
		this.puntospoder = (int) (Math.random() * 20);

	}

	/**
	 * funciones
	 * 
	 * @return
	 * @return
	 */
	public void recibirdanio(int danio) {
		this.puntosvida = this.puntosvida - danio;
	}

}
