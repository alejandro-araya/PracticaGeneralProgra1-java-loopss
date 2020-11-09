public class NumberDivisibleByFive5 {

   public static void main(String[] args) {

      int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

      for (int arrayIndex = 0 ; arrayIndex < numbers.length  ; ++arrayIndex) {
         if(numbers[arrayIndex] > 150){
            break;
         } else if(numbers[arrayIndex] % 5 == 0){
            System.out.println(numbers[arrayIndex]);
         }//else ends
      }//for ends
   }//public static
}//public class
