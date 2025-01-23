package unidad3;

import java.util.ArrayList;

public class personaje {
	// variables miembro de la clase

	// estas si son accequibles directamente dese el objeto
	public int fuerza;
	public int inteligencia;
	private int carisma;
	public int clase;
	// no son accequible directamente desde el objeto
	public int puntosvida;
	private int puntospoder;

	// para definir un arrYS LIST HAY QUE DEFINIR EL TIPO DE OBJETO QUE VA A
	// ALMACENAR ENTRE<> AL CONTRARIO QUE CON UN ARRAY NORMAL QUE NO HACE FALTA
	// DEFINIR EL TAMAÑO,, SEGUN AÑDIMOS ELEMENTOS AL ARRAYLIST VA HACIENDOSE mas
	// GRANDE

	private ArrayList<arma> armas = new arrayList<arma>();

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

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getPuntosvida() {
		return puntosvida;
	}

	public void setPuntosvida(int puntosvida) {
		this.puntosvida = puntosvida;
	}

	public int getPuntospoder() {
		return puntospoder;
	}

	public void setPuntospoder(int puntospoder) {
		this.puntospoder = puntospoder;
	}

	public Arraylist<Arma> getArmas() {
		return armas;
	}

	public void setArmas(Arraylist<Arma> armas) {
		this.armas = armas;
	}

	public void addarma(arma armarecibida) {
		this.armas.add(armarecibida);

	}
//añadimos con add el arma recibida . em la ultima posicion del arraylist de armas.

	/**
	 * la funcion devuelve la primera arma de la lista de armas que se supone la
	 * principal si la lista de armas esta vaci adevuelve null
	 * 
	 * @return devuelve el arma principal del personaje
	 */
	public arma armaprincipal() {
		// solo cogemos el arma de la posicion 0 si en la lista de armas hay por lo
		// menos
		if (armas.size() >= 1)
			return this.armas.get(0);
		return null;
	}

}
