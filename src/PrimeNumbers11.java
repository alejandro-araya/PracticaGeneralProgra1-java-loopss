public class PrimeNumbers11 {

    public static void main(String[] args) {
        int start = 25;
        int end = 50;
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        /**
         * Here I call the function isPrime
         */

        for(int var = start; var <= end; ++var){
            if (isPrime(var) == true){
                System.out.println(var);
            }
        }
    }

    /**
     * This function validate if the number is prime or not
     * @param start
     * @return
     */
    public static boolean isPrime(int start){
        int divisor = 2;
        int squareRootOfNumber = (int)Math.sqrt(start);
        boolean isPrime = true;
        while (divisor <= squareRootOfNumber && isPrime){
            if(start % divisor == 0) {
                isPrime = false;
            }
            divisor++;
        }
        return isPrime;
    }
}