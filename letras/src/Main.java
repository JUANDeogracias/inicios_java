//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int anchura = 5;
        int altura = 7;

        //Letra L
        for(int filas = 1; filas<=altura;filas++){
            if(filas != 7) {
                System.out.println("*");
            } else if (filas == 7) {
                System.out.println("* * * * * * *");
            }
        }

        //Letra E
        System.out.println(" ");

        for(int filas = 1; filas <= altura; filas++){
            for(int columna = 1; columna <= anchura; columna++) {
                if (filas == 1 || filas == altura || filas == (altura / 2) + 1) {
                    System.out.print("* ");
                } else if (columna == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  "); // Añade espacios para alinear correctamente
                }
            }
            System.out.println();
        }

    }
}