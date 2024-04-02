import java.util.Scanner;

public class Main {
    public static String pregunta(String p){
        Scanner sc = new Scanner(System.in);

        System.out.println(p);

        //Recibimos la respuesta de el usuario en la variable respuesta
        String respuesta = sc.nextLine();

        return respuesta;
    }
    public static void triaje(String nombre){
        String respuesta = "";

        System.out.println("Hola " + nombre);

        respuesta = pregunta("Ha tenido alguna caida");

        while(!respuesta.equals("S") && !respuesta.equals("N")){
            respuesta = pregunta("Vuelva a intentarlo [S/N] (unicas respuestas validas)");
            System.out.println(respuesta);
        }

        respuesta = pregunta("Tiene usted fiebre?");
        while(!respuesta.equals("S") && !respuesta.equals("N")){
            respuesta = pregunta("Vuelva a intentarlo [S/N] (unicas respuestas validas)");
            System.out.println(respuesta);
        }
    }

    public static void main(String[] args) {

        triaje("Juan");
    }
}