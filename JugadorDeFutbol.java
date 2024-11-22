public class JugadorDeFutbol {
    
    //nombre del futbolista
    private String nombre;
    //edad del futbolista
    private int edad;
    //decide si es futolista es campeon de liga o no
    private boolean esCampeonDeLiga;
    
    /*
     * constructor de la clase
     */
    public JugadorDeFutbol(String nombreJugador, int edadJugador) {
        nombre = nombreJugador;
        edad = edadJugador;
        esCampeonDeLiga = true;
    }
    
    /*
     * devuelve el nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }
    
    /*
     * devuelve la edad del jugador
     */
    public int getEdad() {
        return edad;
    }
    
    /*
     * informa si el jugdor es campeón o no
     */
    public void esCampeonDeLigaEnEspanol() {
        if(esCampeonDeLiga == true) {
            System.out.println("Si");
        }
        else {
            System.out.println("No");
        }
    }
    
    /*
     * cambia el nombre del jugador
     */
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /*
     * cambia la edad del jugador
     */
    public void setEdad(int añosCumplidos) {
        edad = edad + añosCumplidos;
    }
    
    /*
     * determina si es campeon de liga
     */
    public void invertirValor() {
        esCampeonDeLiga =! esCampeonDeLiga;
    }
    
    public void imprimirDetalles() {
        if(esCampeonDeLiga == true) {
            System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | ¿Ha sido campeon? Si");
        }
        else {
            System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | ¿Ha sido campeon? No");
        }
    }
    
    public String getDetalles() {
        String valor;
        if(esCampeonDeLiga == true) {
            valor = "Si";
        }
        else {
            valor = "No";
        }
        return "Nombre: " + nombre + " | Edad: " + edad + " | ¿Ha sido campeon? " + valor;
    }
}

    