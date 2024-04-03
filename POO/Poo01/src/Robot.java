public class Robot {

    /*PROPIEDADES*/
    private float peso;

    /*Tenemos que definir el constructor de la clase que permite inicializar la misma*/
    public Robot(String name) {
        // Constructor
    }

    /*GETTERS Y SETTERS (vamos a utilizarlos)*/

    //
    public void setPeso(float p) {
        if (p < 0) this.peso = 0;
        else this.peso = p;
    }

    public float getPeso(){
        return this.peso;
    }

}

