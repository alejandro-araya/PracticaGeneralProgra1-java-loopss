import java.util.Scanner;

public class CountTotalNumberOfDigits6 {

    public static int requestNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in );
        System.out.println(message);
        return scanner.nextInt();

    }

    public static void main (String[] args){

        int numberFromUser = requestNumberFromUser("Type a number");

        int counter = 0, number = numberFromUser;

        while (number != 0) {
            number /= 10;
            ++counter;
        }
        System.out.println("Number of digits: " + counter);
    }

}


