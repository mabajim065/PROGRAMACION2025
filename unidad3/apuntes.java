package apuntes;

public class apuntestema3 {

	/**
	 * Apuntes.java
	 *
	 * Este archivo contiene apuntes y ejemplos de métodos en Java, arrays, bucles, condicionales
	 * y otros conceptos importantes. Cada método incluye comentarios explicativos en un lenguaje sencillo.
	 *
	 * Nota: Este archivo NO contiene definiciones de las clases (como Empleado, Ciclista, etc.), 
	 * ya que se asume que las tienes definidas en tu proyecto.
	 *
	 * Puedes utilizar este archivo en Eclipse para repasar conceptos y ejemplos que pueden entrar en un examen.
	 */
	    public static void main(String[] args) {
	        // El método main se deja vacío; su función es solo compilar el archivo.
	    }

	    // ----------------------------------------------------------
	    // 1. Métodos básicos y estructuras de control
	    // ----------------------------------------------------------

	    /**
	     * Devuelve el número de empleados en una lista.
	     * Se utiliza el método size() de la lista para obtener el total.
	     *
	     * @param empleados Lista de empleados.
	     * @return número de empleados.
	     */
	    public int numEmpleados(java.util.List<?> empleados) {
	        return empleados.size();
	    }

	    // ----------------------------------------------------------
	    // 2. Ejemplos de recorrido de arrays y ArrayLists
	    // ----------------------------------------------------------

	    /**
	     * Recorre un array de pasajeros y los imprime.
	     *
	     * @param listaPasajeros Array de nombres de pasajeros.
	     */
	    public void recorrerArray(String[] listaPasajeros) {
	        for (int i = 0; i < listaPasajeros.length; i++) {
	            System.out.println(listaPasajeros[i]);
	        }
	    }

	    /**
	     * Recorre un ArrayList de empleados y los imprime.
	     *
	     * @param empleados Lista de nombres de empleados.
	     */
	    public void recorrerArrayList(java.util.List<String> empleados) {
	        for (String empleado : empleados) {
	            System.out.println(empleado);
	        }
	    }

	    // ----------------------------------------------------------
	    // 3. Condicionales y operadores lógicos en métodos
	    // ----------------------------------------------------------

	    /**
	     * Busca y devuelve el empleado con mayores ingresos.
	     * Puede filtrar por puesto; si se pasa -1 se ignora la condición de puesto.
	     *
	     * @param empleados Lista de empleados.
	     * @param puesto    Puesto a filtrar o -1 para ignorar.
	     * @return el empleado con mayores ingresos o null si la lista está vacía.
	     */
	    public Empleado empleadoMasCaro(java.util.List<Empleado> empleados, int puesto) {
	        Empleado mejorPagado = null;
	        for (Empleado e : empleados) {
	            // Se evalúa:
	            // - (puesto == -1 || e.puesto == puesto): si se ignora el puesto o se cumple.
	            // - (mejorPagado == null || e.getIngresos() > mejorPagado.getIngresos()): si es el primero o tiene ingresos mayores.
	            if ((puesto == -1 || e.puesto == puesto) &&
	                (mejorPagado == null || e.getIngresos() > mejorPagado.getIngresos())) {
	                mejorPagado = e;
	            }
	        }
	        return mejorPagado;
	    }

	    /**
	     * Asigna el rol de jefe a un empleado que tenga el nombre indicado y que no lo sea ya.
	     * Usa .equals para comparar cadenas.
	     *
	     * @param empleados Lista de empleados.
	     * @param nombre    Nombre del empleado a modificar.
	     * @return true si se asigna el rol, false en caso contrario.
	     */
	    public boolean asignarJefeEquipo(java.util.List<Empleado> empleados, String nombre) {
	        for (Empleado e : empleados) {
	            if (e.getNombre().equals(nombre) && e.puesto != Empleado.PUESTO_JEFE) {
	                e.puesto = Empleado.PUESTO_JEFE;
	                return true;
	            }
	        }
	        return false;
	    }

	    // ----------------------------------------------------------
	    // 4. Uso de instanceof y casting en funciones complejas
	    // ----------------------------------------------------------

	    /**
	     * Suma los ingresos de los empleados que tengan una edad menor que el parámetro.
	     * Si el empleado es de tipo Jefe, se suma también su gasto de tarjeta.
	     * Esta función es un ejemplo de cómo combinar condiciones, uso de instanceof y casting.
	     *
	     * @param empleados Lista de empleados.
	     * @param edad      Edad límite para sumar ingresos.
	     */
	    public void sumaIngresos(java.util.List<Empleado> empleados, int edad) {
	        double suma = 0;
	        for (Empleado e : empleados) {
	            if (e.getEdad() < edad) {
	                suma += e.getIngresos();
	                // Uso de instanceof: verificamos si 'e' es un objeto de la clase Jefe.
	                if (e instanceof Jefe) {
	                    // Casting a Jefe para acceder a métodos específicos.
	                    suma += ((Jefe) e).getGastoTarjeta();
	                }
	            }
	        }
	        // Asigna el total a un atributo (suponiendo que esté definido en la clase).
	        this.gastosEmpleados = suma;
	    }
	    private double gastosEmpleados;

	    /**
	     * Asigna un proyecto a un empleado buscando ambos por su ID.
	     * Se usa break para salir del bucle una vez encontrado el elemento.
	     *
	     * @param empleados   Lista de empleados.
	     * @param proyectos   Lista de proyectos.
	     * @param empleadoId  ID del empleado.
	     * @param proyectoId  ID del proyecto.
	     */
	    public void asignarProyectoAEmpleado(java.util.List<Empleado> empleados, java.util.List<Proyecto> proyectos,
	                                         String empleadoId, String proyectoId) {
	        Empleado emp = null;
	        Proyecto proy = null;
	        for (Empleado e : empleados) {
	            if (e.getId().equals(empleadoId)) {
	                emp = e;
	                break;
	            }
	        }
	        for (Proyecto p : proyectos) {
	            if (p.getId().equals(proyectoId)) {
	                proy = p;
	                break;
	            }
	        }
	        if (emp != null && proy != null) {
	            proy.agregarEmpleado(emp.getId());
	        }
	    }

	    // ----------------------------------------------------------
	    // 5. Ejemplos con Arrays: Pasajeros
	    // ----------------------------------------------------------

	    /**
	     * Retorna el número de pasajeros en el array.
	     *
	     * @param listaPasajeros Array de pasajeros.
	     * @return número de pasajeros.
	     */
	    public int numPasajeros(Pasajero1[] listaPasajeros) {
	        return listaPasajeros.length;
	    }

	    /**
	     * Cuenta cuántos pasajeros tienen una edad mayor o igual a la indicada.
	     *
	     * @param listaPasajeros Array de pasajeros.
	     * @param edad           Edad mínima.
	     * @return cantidad de pasajeros que cumplen la condición.
	     */
	    public int numPasajeros(Pasajero1[] listaPasajeros, int edad) {
	        int cantPasajeros = 0;
	        for (int i = 0; i < listaPasajeros.length; i++) {
	            if (listaPasajeros[i].getEdad() >= edad) {
	                cantPasajeros++;
	            }
	        }
	        return cantPasajeros;
	    }

	    /**
	     * Calcula la edad media de los pasajeros.
	     *
	     * @param listaPasajeros Array de pasajeros.
	     * @return edad media como float.
	     */
	    public float edadMedia(Pasajero1[] listaPasajeros) {
	        double sumaEdad = 0;
	        for (int i = 0; i < listaPasajeros.length; i++) {
	            sumaEdad += listaPasajeros[i].getEdad();
	        }
	        return (float) (sumaEdad / listaPasajeros.length);
	    }

	    /**
	     * Elimina un pasajero del array buscando por NIF.
	     * Si se encuentra, se reemplaza por un pasajero "vacío" y se retorna 1; si no, se retorna 0.
	     *
	     * @param listaPasajeros Array de pasajeros.
	     * @param nif            NIF del pasajero a eliminar.
	     * @return 1 si se elimina correctamente, 0 si no se encuentra.
	     */
	    public int eliminarPasajero(Pasajero1[] listaPasajeros, String nif) {
	        // Se crea un pasajero "vacío"; se debe tener definida la clase Pasajero1.
	        Pasajero1 vacio = new Pasajero1(1, "vacio", "vacio", 1, 'M', "1", "", false);
	        for (int i = 0; i < listaPasajeros.length; i++) {
	            if (nif.equals(listaPasajeros[i].getNif())) {
	                listaPasajeros[i] = vacio;
	                return 1;
	            }
	        }
	        return 0;
	    }

	    // ----------------------------------------------------------
	    // 6. Métodos para Ciclistas (Funciones complejas que pueden entrar en examen)
	    // ----------------------------------------------------------

	    // Se asume que existe un array de Ciclista y un contador de ciclistas.
	    private int numCiclistas;
	    private Ciclista[] ciclistas;

	    /**
	     * Devuelve la cantidad de ciclistas.
	     *
	     * @return número de ciclistas.
	     */
	    public int numCiclistas() {
	        return numCiclistas;
	    }

	    /**
	     * Retorna el peso máximo entre todos los ciclistas.
	     *
	     * @return peso máximo.
	     */
	    public float maxPeso() {
	        float maxPeso = 0;
	        for (int i = 0; i < ciclistas.length; i++) {
	            maxPeso = Math.max(maxPeso, ciclistas[i].getPeso());
	        }
	        return maxPeso;
	    }

	    /**
	     * Cuenta la cantidad de ciclistas que tienen una especialidad específica.
	     * Esta función es importante en exámenes para demostrar dominio de arrays y condiciones.
	     *
	     * @param especialidad Código de especialidad (por ejemplo, 1 = montaña, 2 = contrarreloj, 3 = todoterreno).
	     * @return cantidad de ciclistas con esa especialidad.
	     */
	    public int numCiclistasPorEspecialidad(int especialidad) {
	        int contador = 0;
	        for (int i = 0; i < ciclistas.length; i++) {
	            if (ciclistas[i].getEspecialidad() == especialidad) {
	                contador++;
	            }
	        }
	        return contador;
	    }

	    /**
	     * Busca un ciclista por nombre en el array de ciclistas.
	     * Usa .equals para comparar el contenido de la cadena.
	     *
	     * @param nombre Nombre del ciclista a buscar.
	     * @return el objeto Ciclista si se encuentra, o null si no.
	     */
	    public Ciclista buscarCiclista(String nombre) {
	        for (int i = 0; i < ciclistas.length; i++) {
	            if (ciclistas[i].getNombre().equals(nombre)) {
	                return ciclistas[i];
	            }
	        }
	        return null;
	    }

	    /**
	     * Añade un nuevo ciclista al array.
	     * Si el array está lleno (número de ciclistas igual o mayor que el tamaño del array),
	     * se crea un nuevo array con una posición adicional, se copian los elementos y se añade el nuevo.
	     *
	     * @param cicli Objeto Ciclista a añadir.
	     * @return 0 si la operación se realiza correctamente, -1 en caso de fallo.
	     */
	    public int anadirCiclista(Ciclista cicli) {
	        if (numCiclistas >= ciclistas.length) {
	            // Se crea un nuevo array con tamaño incrementado.
	            Ciclista[] nuevoArray = new Ciclista[numCiclistas + 1];
	            for (int i = 0; i < ciclistas.length; i++) {
	                nuevoArray[i] = ciclistas[i];
	            }
	            ciclistas = nuevoArray;
	        }
	        ciclistas[numCiclistas] = cicli;
	        numCiclistas++;
	        return 0;
	    }

	    /**
	     * Elimina un ciclista del array en la posición indicada.
	     *
	     * @param indice Índice del ciclista a eliminar.
	     */
	    public void eliminarCiclistas(int indice) {
	        if (indice >= 0 && indice < ciclistas.length) {
	            // Aquí se elimina asignando null. En un examen, podrías discutir sobre la reestructuración del array.
	            ciclistas[indice] = null;
	        }
	    }

	    // ----------------------------------------------------------
	    // 7. Métodos para trabajar con Personas (Familia)
	    // ----------------------------------------------------------

	    private Persona[] listaPersonas;
	    private double ingresosMensuales;

	    /**
	     * Devuelve el número de personas en la familia (longitud del array).
	     *
	     * @return número de personas.
	     */
	    public int numPersonas() {
	        return this.listaPersonas.length;
	    }

	    /**
	     * Devuelve la cantidad de personas de la familia con ingresos inferiores al valor dado.
	     *
	     * @param ingreso Valor de referencia para los ingresos.
	     * @return cantidad de personas que cumplen la condición.
	     */
	    public int numPersonasIngresos(int ingreso) {
	        int numPersonas = 0;
	        for (int i = 0; i < listaPersonas.length; i++) {
	            if (listaPersonas[i].getIngresos() < ingreso) {
	                numPersonas++;
	            }
	        }
	        return numPersonas;
	    }

	    /**
	     * Suma los ingresos de todos los miembros de la familia y los asigna a la variable ingresosMensuales.
	     * Es importante en exámenes saber cómo acumular valores en un bucle.
	     */
	    public void sumaIngresos() {
	        for (int i = 0; i < listaPersonas.length; i++) {
	            ingresosMensuales += listaPersonas[i].getIngresos();
	        }
	    }

	    /**
	     * Busca en el array de personas a la que tenga el nombre indicado.
	     * Si se encuentra y NO es progenitor, lo marca como progenitor y devuelve true.
	     * Si ya es progenitor o no se encuentra, devuelve false.
	     *
	     * @param nombre       Nombre a buscar.
	     * @param esProgenitor Parámetro (no usado en la búsqueda).
	     * @return true si se asigna el rol de progenitor, false en caso contrario.
	     */
	    public boolean asignarRolProgenitor(String nombre, boolean esProgenitor) {
	        boolean encontrado = false;
	        for (int i = 0; i < listaPersonas.length; i++) {
	            if (nombre.equalsIgnoreCase(listaPersonas[i].getNombre())) {
	                encontrado = true;
	                if (listaPersonas[i].isEsProgenitor()) {
	                    return false;
	                } else {
	                    listaPersonas[i].setEsProgenitor(true);
	                    return true;
	                }
	            }
	        }
	        return encontrado;
	    }

	    // ----------------------------------------------------------
	    // 8. Métodos para Empleados, Biblioteca, Mazmorras y más
	    // ----------------------------------------------------------

	    // Métodos para agregar empleados, filtrar por salario y calcular presupuesto.
	    private java.util.List<Empleado> empleados = new java.util.ArrayList<>();

	    /**
	     * Agrega un empleado a la lista.
	     *
	     * @param empleado Objeto Empleado a agregar.
	     */
	    public void agregarEmpleado(Empleado empleado) {
	        empleados.add(empleado);
	    }

	    /**
	     * Devuelve una lista de empleados con salario mayor al valor dado.
	     *
	     * @param salario Valor de referencia.
	     * @return lista filtrada de empleados.
	     */
	    public java.util.List<Empleado> obtenerEmpleadosConSalarioMayor(double salario) {
	        java.util.List<Empleado> empleadosFiltrados = new java.util.ArrayList<>();
	        for (Empleado empleado : empleados) {
	            if (empleado.obtenerSalario() > salario) {
	                empleadosFiltrados.add(empleado);
	            }
	        }
	        return empleadosFiltrados;
	    }

	    /**
	     * Calcula el presupuesto gastado sumando los salarios de todos los empleados.
	     *
	     * @return total gastado.
	     */
	    public double calcularPresupuestoGastado() {
	        double totalGastado = 0.0;
	        for (Empleado empleado : empleados) {
	            totalGastado += empleado.obtenerSalario();
	        }
	        return totalGastado;
	    }

	    // Métodos para la Biblioteca
	    private java.util.List<Libro> libros = new java.util.ArrayList<>();
	    
	    /**
	     * Agrega un libro a la biblioteca.
	     *
	     * @param libro Objeto Libro a agregar.
	     */
	    public void agregarLibro(Libro libro) {
	        libros.add(libro);
	    }
	    
	    /**
	     * Devuelve el número de libros en la biblioteca.
	     *
	     * @return cantidad de libros.
	     */
	    public int numLibros() {
	        return libros.size();
	    }
	    
	    /**
	     * Devuelve el libro más antiguo de la biblioteca.
	     *
	     * @return objeto Libro más antiguo.
	     */
	    public Libro libroMasAntiguo() {
	        Libro libroAntiguo = null;
	        for (Libro libro : libros) {
	            if (libroAntiguo == null || libro.getAnioPublicacion() < libroAntiguo.getAnioPublicacion()) {
	                libroAntiguo = libro;
	            }
	        }
	        return libroAntiguo;
	    }
	    
	    /**
	     * Presta un libro: busca por título y, si se encuentra y no está prestado, lo marca como prestado.
	     *
	     * @param titulo Título del libro a prestar.
	     * @return true si se pudo prestar, false de lo contrario.
	     */
	    public boolean prestarLibro(String titulo) {
	        for (Libro libro : libros) {
	            if (libro.getTitulo().equals(titulo) && !libro.getPrestado()) {
	                libro.setPrestado(true);
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    // Métodos para Mazmorras, Trampas y Monstruos
	    private Trampa2[] listaTra;
	    private Monstruo2[] listaMon;
	    
	    /**
	     * Comprueba que todas las trampas estén activas y que no haya más de 3 trampas en el nivel indicado.
	     * Se utiliza un bucle for-each para recorrer las trampas.
	     *
	     * @param nivel Nivel a comprobar.
	     * @return true si se cumple la condición, false en caso contrario.
	     */
	    public boolean regularTrampas(int nivel) {
	        int numTrampas = 0;
	        for (Trampa2 t : listaTra) {
	            if (!t.activa) // Si alguna trampa no está activa, se devuelve false.
	                return false;
	            if (t.getNivel() == nivel) {
	                numTrampas++;
	                if (numTrampas > 3)
	                    return false;
	            }
	        }
	        return true;
	    }
	    
	    /**
	     * Determina el enemigo final de la mazmorra.
	     * Debe ser un dragón o koala negro con el mayor ataque y que no sea débil a las cosquillas.
	     * Si no se encuentra, se crea un nuevo monstruo que cumpla las condiciones, se asigna al final del array y se retorna.
	     *
	     * @return objeto Monstruo2 que representa el enemigo final.
	     */
	    public Monstruo2 enemigoFinal() {
	        int maxAtaqueMon = Integer.MIN_VALUE;
	        int posMon = -1;
	        // Buscar el monstruo con mayor ataque.
	        for (int i = 0; i < listaMon.length; i++) {
	            if (listaMon[i].getAtaque() > maxAtaqueMon) {
	                maxAtaqueMon = listaMon[i].getAtaque();
	                posMon = i;
	            }
	        }
	        // Verifica que el monstruo cumpla las condiciones.
	        if (listaMon[posMon].getDebilidad() != Monstruo2.COSQUILLAS &&
	           (listaMon[posMon].getTipo() == Monstruo2.DRAGONES || 
	            listaMon[posMon].getTipo() == Monstruo2.DARK_KOALA)) {
	            return listaMon[posMon];
	        }
	        // Si no se encontró ninguno adecuado, se crea un nuevo monstruo que cumpla los requisitos.
	        Monstruo2 terribilisFinale = new Monstruo2("Doymiedo", Monstruo2.DRAGONES, Monstruo2.AGUA, 233, 345, 3, 34);
	        listaMon[listaMon.length - 1] = terribilisFinale;
	        return terribilisFinale;
	    }
	    
	    /**
	     * Comprueba que la mazmorra cumpla las siguientes condiciones:
	     * - Al menos un monstruo de cada tipo.
	     * - Al menos un dragón en el nivel 3.
	     * - Número mínimo de trampas y monstruos por nivel.
	     *
	     * Esta función es compleja y puede aparecer en exámenes para evaluar el manejo de arrays, 
	     * bucles, condiciones y switches.
	     *
	     * @return true si la mazmorra cumple todas las condiciones, false en caso contrario.
	     */
	    public boolean comprobarMazmorra() {
	        boolean dragonNivel3 = false;
	        int numTramN1 = 0, numTramN2 = 0, numTramN3 = 0;
	        int numMonN1 = 0, numMonN2 = 0, numMonN3 = 0;
	        boolean hayMonstruos[] = { false, false, false, false, false }; // Supone 5 tipos de monstruos.
	        
	        // Recorremos los monstruos para comprobar tipos y niveles.
	        for (Monstruo2 mon : this.listaMon) {
	            if (mon.getNivel() == 3 && mon.getTipo() == Monstruo2.DRAGONES)
	                dragonNivel3 = true;
	            switch (mon.getNivel()) {
	                case 1: numMonN1++; break;
	                case 2: numMonN2++; break;
	                case 3: numMonN3++; break;
	                default: return false;
	            }
	            if (mon.getTipo() >= 0 && mon.getTipo() <= 4)
	                hayMonstruos[mon.getTipo()] = true;
	        }
	        
	        // Verifica que exista al menos un monstruo de cada tipo.
	        for (boolean hayTipo : hayMonstruos) {
	            if (!hayTipo)
	                return false;
	        }
	        if (!dragonNivel3)
	            return false;
	        
	        // Recorre las trampas para contarlas por nivel.
	        for (Trampa2 tra : this.listaTra) {
	            if (!tra.activa)
	                return false;
	            switch (tra.getNivel()) {
	                case 1: numTramN1++; break;
	                case 2: numTramN2++; break;
	                case 3: numTramN3++; break;
	                default: return false;
	            }
	        }
	        if (numTramN1 < 2 || numTramN2 < 2 || numTramN3 < 2)
	            return false;
	        if (numMonN1 < 3 || numMonN2 < 3 || numMonN3 < 3)
	            return false;
	        
	        return true;
	    }
	    
	    // Getters y setters para la Mazmorra (atributos básicos).
	    private String nombre;
	    private int tamanio;
	    private String clima;
	    private int niveles;
	    
	    public String getNombre() {
	        return nombre;
	    }
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public int getTamanio() {
	        return tamanio;
	    }
	    public void setTamanio(int tamanio) {
	        this.tamanio = tamanio;
	    }
	    public String getClima() {
	        return clima;
	    }
	    public void setClima(String clima) {
	        this.clima = clima;
	    }
	    public int getNivel() {
	        return niveles;
	    }
	    public void setNivel(int nivel) {
	        this.niveles = nivel;
	    }
	    
	    @Override
	    public String toString() {
	        return "Mazmorra [nombre=" + nombre + ", tamanio=" + tamanio + ", clima=" + clima + ", nivel=" + niveles + "]";
	    }
	    
	    // ----------------------------------------------------------
	    // 9. Métodos para Jugadores y Equipos
	    // ----------------------------------------------------------

	    private Jugador4[] listaJugadores;
	    
	    /**
	     * Agrega un jugador a la lista de jugadores.
	     * Busca el primer espacio vacío en el array y coloca el nuevo jugador allí.
	     *
	     * @param nuevoJugador Objeto Jugador4 a agregar.
	     * @return 0 si se agrega correctamente, -1 si no hay espacio.
	     */
	    public int addJugador(Jugador4 nuevoJugador) {
	        for (int i = 0; i < this.listaJugadores.length; i++) {
	            if (this.listaJugadores[i] == null) {
	                this.listaJugadores[i] = nuevoJugador;
	                return 0;
	            }
	        }
	        return -1;
	    }
	    
	    /**
	     * Busca un jugador en el equipo contrario y devuelve la posición en su lista de jugadores.
	     *
	     * @param idJugador ID del jugador a buscar.
	     * @param equipo    Objeto Equipo4 en el que se busca.
	     * @return posición del jugador o -1 si no se encuentra.
	     */
	    public int buscarJugador(String idJugador, Equipo4 equipo) {
	        Jugador4[] listaJugEquipo = equipo.getListaJugadores();
	        int posJug = -1;
	        boolean jugEncontrado = false;
	        for (int i = 0; i < listaJugEquipo.length && !jugEncontrado; i++) {
	            if (listaJugEquipo[i].getId().equals(idJugador)) {
	                posJug = i;
	                jugEncontrado = true;
	            }
	        }
	        return posJug;
	    }
	    
	    /**
	     * Ficha a un jugador de otro equipo.
	     * Busca el jugador en el equipo indicado, lo añade a la lista de jugadores de este equipo
	     * y lo elimina del equipo original.
	     *
	     * @param idJugador ID del jugador a fichar.
	     * @param equipo    Equipo del que se ficha el jugador.
	     * @return 0 si se ficha correctamente, -1 en caso de fallo.
	     */
	    public int ficharJugador(String idJugador, Equipo4 equipo) {
	        if (equipo == null)
	            return -1;
	        int posJug = buscarJugador(idJugador, equipo);
	        if (posJug == -1)
	            return -1;
	        Jugador4[] listaEquipoF = equipo.getListaJugadores();
	        addJugador(listaEquipoF[posJug]);
	        listaEquipoF[posJug] = null;
	        return 0;
	    }
	}

}
