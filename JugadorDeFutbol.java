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
    public String esCampeonDeLigaEnEspanol() {
        String esCampeonDeLigaEnEspanol;
        if(esCampeonDeLiga == true) {
            esCampeonDeLigaEnEspanol = "Si";
        }
        else {
            esCampeonDeLigaEnEspanol = "No";
        }
        return esCampeonDeLigaEnEspanol;
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
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | ¿Ha sido campeon? " + esCampeonDeLigaEnEspanol());
    }
    
    public String getDetalles() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | ¿Ha sido campeon? " + esCampeonDeLigaEnEspanol();
    }
}

    