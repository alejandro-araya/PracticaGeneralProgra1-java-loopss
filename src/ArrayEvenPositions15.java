public class ArrayEvenPositions15 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int pos = 1 ; pos <= numbers.length  ; pos=pos+2){
                System.out.println(numbers[pos]);
            }
        }
    }

