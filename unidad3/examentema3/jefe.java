package unidad3.examentema3;

public class jefe extends Empleado { // habia que poner extends para que fuera una clase hijo

	/********************************************
	 * VARIABLES ESTATICAS *
	 *******************************************/

	/********************************************
	 * VARIABLES MIEMBRO *
	 *******************************************/

	private int gastotarjeta = 0;
	private String consejo = "";
	private String sede = "";

	/********************************************
	 * CONSTRUCTORES
	 ********************************************/
	/**
	 * 
	 */
	public jefe() {
		super();
		this.gastotarjeta = (int) (Math.random() * 5);
		this.consejo = "";
		this.sede = "";
	}

	/**
	 * 
	 * @param gastotarjeta
	 * @param consejo
	 * @param sede
	 */
	public jefe(int gastotarjeta, String consejo, String sede) {
		super();
		this.gastotarjeta = gastotarjeta;
		this.consejo = consejo;
		this.sede = sede;
	}

	/********************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 ********************************************/
	/**
	 * 
	 * @return
	 */
	public int getGastotarjeta() {
		return gastotarjeta;
	}

	public void setGastotarjeta(int gastotarjeta) {
		this.gastotarjeta = gastotarjeta;
	}

	public String getConsejo() {
		return consejo;
	}

	public void setConsejo(String consejo) {
		this.consejo = consejo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	@Override
	public String toString() {
		return "****************************" + "\njefe:" + "\ngastotarjeta=" + gastotarjeta + "\nconsejo=" + consejo
				+ "\nsede=" + sede + "\n******************";
	}

	/********************************************
	 * METODOS O FUNCIONES *
	 *******************************************/
}
