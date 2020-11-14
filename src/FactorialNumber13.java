public class FactorialNumber13 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int number) {
        int resultado = 1;
        for (int n = 1; n <= number; n++) {
            resultado *= n;
        }
        return resultado;
    }

}

