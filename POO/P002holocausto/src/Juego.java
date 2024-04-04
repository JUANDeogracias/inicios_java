public class Juego {
    /*IMPORTANTE Habitacion.ALTURA = 6 Y Habitacion.ANCHURA = 6*/
    public Juego() {
        System.out.println("Creacion de un juego");
    }

    /*Creamos un nuevo metodo (Funcion) este metodo es peculiar porque tiene el apellido static
     * y permite que se utilice comodamente en el main como indicaré*/
    public static void pintarHabitacion(Habitacion h) {
        System.out.println("Pintando habitacion");
        for (int filas = 0; filas < Habitacion.ALTURA; filas++) {
            for (int columnas = 0; columnas < Habitacion.ANCHO; columnas++) {
                Posicion posicionActual = new Posicion(columnas, filas);

                if (h.esunapuerta(posicionActual)) System.out.print(" ");
                else if (columnas == 0 || columnas == Habitacion.ANCHO - 1) {
                    System.out.print("|");
                } else if (filas == 0 || filas == Habitacion.ALTURA - 1) {
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            }
            // Añadir un salto de línea después de imprimir cada fila
            System.out.println();
        }
    }
}