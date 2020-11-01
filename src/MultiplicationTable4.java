import java.util.Scanner;
import java.lang.Math;

public class MultiplicationTable4 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number ");

        int number = scanner.nextInt();

        for(int x = 1; x <= 10; x++){
            System.out.println(number + " * " + x + " = " + number * x);

        }
    }
}
