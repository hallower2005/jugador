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
    public JugadorDeFutbol(String nombreJugador, int edadJugador, boolean esCampeon) {
        nombre = nombreJugador;
        edad = edadJugador;
        esCampeonDeLiga = esCampeon;
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
    public boolean getEsCampeonDeLiga() {
        return esCampeonDeLiga;
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
}

    