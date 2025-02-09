package unidad3.examenes.familia;

public class PruebaExamen3 {


		public static void main(String[] args) {

			Persona3 mario1 = new Persona3();

			Persona3 monica = new Persona3(1, "Monica", 19, 500, true);
			Persona3 mario = new Persona3(2, "Mario", 45, 3500, true);
			Persona3 fran = new Persona3(3, "Fran", 2, 200, false);

			Persona3 listaPersonas[] = new Persona3[3];

			listaPersonas[0] = monica;
			listaPersonas[1] = mario;
			listaPersonas[2] = fran;

			Familia3 losPiscineros = new Familia3("id1", "Los Pisci", "calle la piscina", false, false, 10, listaPersonas);

			System.out.println("La longitud del array es " + listaPersonas.length);

			Persona3 listaPersonas2[] = { monica, mario, fran };

			// System.out.println(monica);

			System.out.println("La familia tiene " + losPiscineros.numPersonas() + " miembros");

			System.out.println(losPiscineros.numPersonasIngresos(200) + " cobran menos de 600 euros");

			losPiscineros.asignarRolProgenitor("fran", true);

			System.out.println(losPiscineros);
			//hbarlhbalirbaf

		}

	}

