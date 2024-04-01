//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean respuesta = true;
        /*for (int i=0;i<=30;i+=2){
            System.out.print(i + ",");
        }*/
        for(int edad=10;edad<=20;edad+=2){
            if (edad >= 18) {
                System.out.println("La persona es mayor de edad");
            } else if(edad == 16){
                System.out.println("La persona tiene 16 años");
            } else {
                System.out.println("La persona es menor de edad");
            }
        }
    }
}