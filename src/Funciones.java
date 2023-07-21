public class Funciones {


    static double iva(double num) {
        return num * 1.19;
    }

    public static void main(String[] arg) {
     double resultado = iva(10000);
     System.out.println(resultado);
    }
}

