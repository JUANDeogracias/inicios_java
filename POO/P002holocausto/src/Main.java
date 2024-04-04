import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Posicion personaje1 = new Posicion();
        /*Generamos los dos primeros objetos*/

        //Posicion posInicial = new Posicion(1, 2);
        Posicion puertaIn = new Posicion(0, 3);
        Habitacion habInicial = new Habitacion();
        habInicial.setPuertaEntrada(puertaIn);
        Posicion puertaOut = new Posicion(5, Habitacion.ALTURA - 1);
        habInicial.setPuertaSalida(puertaOut);

        //Creamos a el personaje y lo almacenamos en la habitacion
        Personaje jugador = new Personaje();
        habInicial.setJugador(jugador);

        //jugador.setPos(posInicial);
        //personaje1.setPuertaEntradaX(1);
        //personaje1.setPuertaEntradaY(2);
        //System.out.println("\n" + jugador.getPos() + ", " + posInicial.getPuertaEntradaX() + ", " + posInicial.getPuertaEntradaY());

        /*Juego no es ningun objeto pero permite ser utilizado como variable auxiliar al
        * haber utilizado la palabra static en el metodo pintar habitacion de la clase
        * Juego*/
        Juego.pintarHabitacion(habInicial);
    }
}