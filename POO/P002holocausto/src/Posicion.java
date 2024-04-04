public class Posicion {
    private int posX;
    private int posY;

    /*Creacion de el constructor*/
    /*Vamos ha hacer tambien uso de la sobrecarga de constructores*/
    public Posicion(){
        System.out.println("Creacion de una posicion");
        this.posX = 0;
        this.posY = 0;
    }

    /*La diferencia de el siguiente constructor con el anterior es que
     * este va a permitir el paso de dos parametros y su inicializacion instantanea
     * en los atributos de la clase*/
    public Posicion(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getPuertaEntradaX() {
        return posX;
    }

    public void setPuertaEntradaX(int puertaEntradaX) {
        this.posX = puertaEntradaX;
    }

    public int getPuertaEntradaY() {
        return posY;
    }

    public void setPuertaEntradaY(int puertaEntradaY) {
        this.posY = puertaEntradaY;
    }

    /*toString permite que la salida por pantalla sea la correcta es MUY RECOMENDABLE*/
    public String toString() {
        return "(" + posX + ", " + posY + ")";
    }

    public boolean esIgual(Posicion p) {
        if(p.posX == this.posX && p.posY == this.posY) return true;
        else return false;
    }
}

