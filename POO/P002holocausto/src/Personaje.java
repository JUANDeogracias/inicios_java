public class Personaje {
    private String nombre;
    private Posicion pos; // Este es el atributo que vas a modificar con setPos y acceder con getPos.

    /* CONSTRUCTOR */
    public Personaje(){
        /* Inicialización por defecto del personaje */
        System.out.println("Creación de un personaje");
        this.nombre = "Personaje sin nombre";
    }

    /* GETTERS Y SETTERS */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPos(Posicion pos) {
        this.pos = pos; // Establece la posición del personaje
    }

    public Posicion getPos() {
        return this.pos; // Obtiene la posición actual del personaje
    }
}
