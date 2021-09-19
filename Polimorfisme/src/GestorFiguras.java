import java.util.Arrays;

public class GestorFiguras {

    public static double suma (Figura[] listaFiguras){
        double resultado = 0;
        int i = 0;
        while (i < 4)
        {
            resultado = resultado + listaFiguras[i].area();
            i++;
        }
        return resultado;
    }

    public static void Sort (Figura[] listaFiguras){
        double [] listaAreaFiguras =  new double [4];
        int contador1 = 0;
        while (contador1<listaAreaFiguras.length)
        {
            listaAreaFiguras[contador1] = listaFiguras[contador1].area();
            contador1++;
        }
        Arrays.sort(listaAreaFiguras);

        double valorArea;
        int contador2 = 0;
        Figura [] listaFigurasOrdenadas = new Figura[4];
        while (contador2 < listaAreaFiguras.length)
        {
            valorArea = listaAreaFiguras[contador2];
            int contador3 = 0;
            while (contador3 < listaFiguras.length)
            {
                if (listaFiguras[contador3].area() == valorArea)
                {
                    listaFigurasOrdenadas[contador2] = listaFiguras[contador3];
                }
                contador3++;
            }
            contador2++;
        }

        //Y finalmente sustituimos la vieja lista de Figuras por la copia con las Figuras ordenadas.
        int contador4 = 0;
        while (contador4 < listaFigurasOrdenadas.length)
        {
            listaFiguras[contador4] = listaFigurasOrdenadas[contador4];
            contador4++;
        }
    }

    public static void main(String[] args) {
        TriangleEQ t = new TriangleEQ(5, 7);
        Cercle c = new Cercle(5);
        Rectangle r = new Rectangle(6 , 5);
        Quadrat q = new Quadrat(6);
        Figura [] listaFiguras = new Figura[4];
        listaFiguras[0] = t;
        listaFiguras[1] = c;
        listaFiguras[2] = r;
        listaFiguras[3] = q;

        System.out.println("La suma de áreas es: " + GestorFiguras.suma(listaFiguras));
        GestorFiguras.Sort(listaFiguras);
        System.out.println("Lista de Figuras ordenadas de menor a mayor área. Cabe destacar que lo que se muestra es el área, pero realmente tenemos ordenada la lista de Figuras:");
        System.out.println(listaFiguras[0].area());
        System.out.println(listaFiguras[1].area());
        System.out.println(listaFiguras[2].area());
        System.out.println(listaFiguras[3].area());
    }
}
