public class Personaje {
    private String nombre;
    private int posx;
    private int posy;

    /*CONSTRUCTOR*/
    public Personaje(){
        /*Inicializacion por defecto de el personaje*/
        System.out.println("Creacion de un personaje");
        this.nombre = "Personaje sin nombre";
        this.posx = 0;
        this.posy = 0;
    }

    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
}
