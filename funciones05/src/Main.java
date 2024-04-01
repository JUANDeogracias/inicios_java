public class Main {
    public static void precioTotal(float precioUd, int ud) {
        float precioTotal = precioUd * ud;
        System.out.println("El precio total es de " + precioTotal);
    }

    public static void main(String[] args) {
        float precioUd = 3.0f;
        int ud =3;
        precioTotal(precioUd, ud);
    }
}
