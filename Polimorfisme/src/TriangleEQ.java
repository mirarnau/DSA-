public class TriangleEQ extends Figura {
    private double b;
    private double h;

    //Constructor
    public TriangleEQ (double b, double h){
        this.b = b;
        this.h = h;
    }

    //Método heredado
    public double area (){
        double resultado = (b * h)/2;
        return resultado;
    }
}
