import java.util.Scanner;

public class ReverseNumber14 {
    public static int requestNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        int numberFromUser = requestNumberFromUser("Type a number");
        int number = numberFromUser;

        int reverse = reverse(numberFromUser);
        System.out.println("Reverse of number: " + number + " is " + reverse(numberFromUser));
    }

    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        }while(number > 0);

        return reverse;
    }
}
