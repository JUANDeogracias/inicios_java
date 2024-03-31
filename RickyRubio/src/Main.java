//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //DATOS PERSONALES
        String name = "Ricky";
        String surname = "Rubio";
        int height = 188;
        int age = 31;

        //DATOS EQUIPO
        short dorsal = 13;
        String equipo = "Cavaliers";

        //Temporada 21-22
        float puntosPartido = 13.1f;
        float rebPartido = 4.1f;
        float asistPartido = 6.6f;
        boolean lesionado = true;

        //Calculo para que quede mas bonito el inicio
        int longitudName = name.length();
        int longitudSurname = name.length();
        int total = longitudName + longitudSurname;

        //Impresion de datos
        System.out.println("---DATOS PERSONALES---\n");
        System.out.println("nombre: " + name);
        System.out.println("apellido: " + surname);
        System.out.println("edad " + age);
        System.out.println("altura[cm] " + height + "\n");

        System.out.println("---DATOS EQUIPO---\n");
        System.out.println("dorsal: " + dorsal);
        System.out.println("equipo: " + equipo + "\n");

        System.out.println("---ESTADISTICAS---\n");
        System.out.println("PP: " + puntosPartido);
        System.out.println("RP: " + rebPartido);
        System.out.println("AP: " + asistPartido);
        System.out.println("¿lesionado?: " + lesionado);
    }
}