public class Habitacion {

    /*Vamos a crear dos variables constantes*/
    public static final int ANCHO=10;
    public static final int ALTURA=10;

    /*El constructor habitacion no es mas que un metodo que permite inicializar
    * la clase habitacion que no es más una plantilla la cual más tarde tendrá objetos
    * los cuales son creados en la clase main*/

    /*Vamos a crear una nueva clase que se llame posicion para modularizar el codigo*/
    /*Creacion de el constructor*/
    private Posicion puertaEntrada;
    private Posicion puertaSalida;

    //Generamos una copia de el jugador con personaje j
    private Personaje j;

    public Posicion getPuertaSalida() {return puertaSalida;}

    public void setPuertaSalida(Posicion puertaSalida) {this.puertaSalida = puertaSalida;}

    public Posicion getPuertaEntrada() {
        return puertaEntrada;
    }

    public void setPuertaEntrada(Posicion puertaEntrada) {
        this.puertaEntrada = puertaEntrada;
    }

    public Habitacion(){
        System.out.println("Creacion de una habitacion");
    }
    public void setJugador(Personaje j) {
        /*Mediante este metodo se le asigna a la variable j el valor de el jugador es
        decir j es una copia de el valor real de el jugador*/
        this.j = j;
    }

    public boolean esunapuerta(Posicion puerta){
        /*El metodo esunapuerta se encarga de comprobar si la posicion de la puerta
        es igual a la posicion del jugador*/
        if(puerta.esIgual(puertaEntrada) || puerta.esIgual(puertaSalida)) return true;
        else return false;
    }
}
