import java.util.Scanner;

public class CountTotalNumberOfDigits6 {

    public static long requestNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in );
        System.out.println(message);
        return scanner.nextLong();

    }

    public static void main (String[] args){

        long numberFromUser = requestNumberFromUser("Type a number");

        long counter = 0, number = numberFromUser;

        while (number != 0) {
            number /= 10;
            ++counter;
        }
        System.out.println("Number of digits: " + counter);
    }

}


