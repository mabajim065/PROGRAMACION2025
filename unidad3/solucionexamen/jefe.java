package unidad3.examenrepaso;

public class Jefe extends Empleado {

	/**************************************************************
	 * VARIABLES
	 *************************************************************/
	private double gastoTarjeta;
	private String consejo;
	private String sede;
	

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	
	public Jefe(int id, String nombre, int edad, double ingresos, int puesto) {
		//llamamos al constructor de la clase padre que recibe todos las variables miembro
		super(id, nombre, edad, ingresos, puesto);
		// TODO Auto-generated constructor stub
		this.gastoTarjeta = Math.random()*5000;
		this.consejo = "";
		this.sede = "";
	}
	
	
	public Jefe(double gastoTarjeta, String consejo, String sede) {
		super();
		this.gastoTarjeta = gastoTarjeta;
		this.consejo = consejo;
		this.sede = sede;
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/
	public double getGastoTarjeta() {
		return gastoTarjeta;
	}


	public void setGastoTarjeta(double gastoTarjeta) {
		this.gastoTarjeta = gastoTarjeta;
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

	/**************************************************************
	 * TO STRING
	 *************************************************************/
	@Override
	public String toString() {
		return "Jefe [gastoTarjeta=" + gastoTarjeta + ", consejo=" + consejo + ", sede=" + sede + "]";
	}
	
}
