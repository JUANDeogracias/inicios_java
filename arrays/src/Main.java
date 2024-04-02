import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Arrays*/
        String nombres[]= {"Juan","Fran", ""};

        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }

        /*Otra manera de crear un array es como lo hace a continuacion*/
        float calificaciones[] = new float[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Quieres añadir un nuevo nombre?");

        String r = sc.nextLine();

        /*Explicacion de porque el -1:
        * Puesto que .length es un metodo que permite saber la longitud de el array,
        * por tanto, te va a dar un numero sin tener en cuenta el primer cero de un vector.
        * Es decir que si un vector tiene 3 nomnbres realmente para llamarlo tendriamos
        * a el 1 en la posicion 0 a el 2 en la posicion 1 y a el tres en la 2 y si ponemos
        * .length nos devolverá 3 pero para acceder a el ultimo tendriamos que restarle 1
        * */
        nombres[nombres.length - 1] = r;
        System.out.println(nombres[nombres.length - 1]);
    }
}