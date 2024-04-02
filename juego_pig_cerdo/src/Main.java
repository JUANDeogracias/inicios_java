import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            // Juego entre los sdos jugadores
            jugarPartida();

            // Menú después de la partida
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    salir = true;
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (!salir);
    }

    public static void jugarPartida() {
        int[] jugador1Tiradas = {};
        int[] jugador2Tiradas = {};

        // Jugador 1
        System.out.println("Jugador 1:");
        jugador1Tiradas = jugar(jugador1Tiradas);
        int ultimoJugador1 = jugador1Tiradas[jugador1Tiradas.length - 1];

        // Jugador 2
        System.out.println("\nJugador 2:");
        jugador2Tiradas = jugar(jugador2Tiradas);
        int ultimoJugador2 = jugador2Tiradas[jugador2Tiradas.length - 1];

        // Determinar ganador
        System.out.println("\nResultado:");
        if (ultimoJugador1 > ultimoJugador2) {
            System.out.println("¡El jugador 1 ha ganado con un " + ultimoJugador1 + "!");
        } else if (ultimoJugador2 > ultimoJugador1) {
            System.out.println("¡El jugador 2 ha ganado con un " + ultimoJugador2 + "!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }

    public static int[] jugar(int[] tiradas) {
        Scanner sc = new Scanner(System.in);
        int dado = rollDie();
        System.out.println("Ha salido el número " + dado);

        // Redimensionar el array para almacenar la nueva tirada
        int[] nuevasTiradas = new int[tiradas.length + 1];
        for (int i = 0; i < tiradas.length; i++) {
            nuevasTiradas[i] = tiradas[i];
        }
        nuevasTiradas[nuevasTiradas.length - 1] = dado;

        System.out.println("¿Quieres añadir otra tirada? (s/n)");
        String respuesta = sc.next();
        if (respuesta.equalsIgnoreCase("s")) {
            return jugar(nuevasTiradas);
        } else {
            System.out.println("Adios");
            return nuevasTiradas;
        }
    }

    // Método para crear y devolver un número aleatorio entre 1 y 6
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*** MENÚ ***");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Salir");
        System.out.println("Selecciona una opción:");
        int opcion = sc.nextInt();
        return opcion;
    }
}