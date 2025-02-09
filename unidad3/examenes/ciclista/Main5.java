package unidad3.examenes.ciclista;

public class Main5 {
	    public static void main(String[] args) {
	        // Crear un equipo de ciclistas
	        EquipoCiclista5 equipo = new EquipoCiclista5();

	        // Añadir algunos ciclistas al equipo
	        Ciclista5 ciclista1 = new Ciclista5(1, "Juan", 25, "Modelo1", 70.5f, "Delantero", "montaña");
	        Ciclista5 ciclista2 = new Ciclista5(2, "Pedro", 30, "Modelo2", 80.0f, "Defensa", "contrareloj");

	        equipo.anadirCiclista(ciclista1);
	        equipo.anadirCiclista(ciclista2);

	        // Mostrar información del equipo
	        System.out.println("Número de ciclistas: " + equipo.numCiclistas());
	        System.out.println("Peso máximo: " + equipo.maxPeso());
	        System.out.println("Número de ciclistas de montaña: " + equipo.numCiclistas("montaña"));

	        // Buscar un ciclista por nombre
	        Ciclista5 ciclistaEncontrado = equipo.buscarCiclista("Juan");
	        if (ciclistaEncontrado != null) {
	            System.out.println("Ciclista encontrado: " + ciclistaEncontrado.toString());
	        } else {
	            System.out.println("Ciclista no encontrado.");
	        }
	    }
	}

