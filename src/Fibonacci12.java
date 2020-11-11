public class Fibonacci12 {
//Fibonacci sequence:
    public static void  main(String[]  args){

     int term = 10;
     int x1 = 0;
     int x2 = 1;
     int number = 0;

     System.out.println("Fibonacci sequence");

     while (number < term){
         System.out.print(x1 + " ");
         int result = x1 + x2;
         x1 = x2;
         x2 = result;
         number += 1;
     }
    }
}
