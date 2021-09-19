public class Cercle extends Figura {
    private double r;

    //Constructor
    public Cercle (double r){
        this.r = r;
    }

    //Método heredado
    public double area() {
        double resultado = Math.PI * r * r;
        return resultado;
    }
}
