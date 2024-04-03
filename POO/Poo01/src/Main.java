//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int edad = 20;
        /*IMPORTANTE las clases empiezan por mayuscula*/

        Robot paquito = new Robot("robot");

        paquito.setPeso(-120.67f);
        System.out.println("El peso de Paquito es de " + paquito.getPeso() + " Kg");
    }
}