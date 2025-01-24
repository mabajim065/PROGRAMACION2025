package unidad3;

public class enemigo extends personaje {// con esto ya tiene to las caracteristicas de personajes
	private int pexperiencia;
	private int dinero;
	private String faccion;

	public enemigo() {
		// generamos la experiencia dpendiendo del ivel, cada nivle son 100 puntos extra
		// de experiencia y un extra aleatorioq sera mas alto deendiendo del nivel
		super();
		int rangoexperiencia = this.getnivel() * 20;
		this.pexperiencia = (this.getnivel() * 100 + (int) (Math.random() * 20)) / 4;
		this.dinero = (int) (Math.random() * 20);
		this.faccion = (int) (Math.random() * 20);
	}

	private int getnivel() {
		// TODO Auto-generated method stub
		return 0;
	}

}
