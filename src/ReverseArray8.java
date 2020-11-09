public class ReverseArray8 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};


        for (int order = numbers.length - 1; order >= 0; order--) {
            System.out.println(numbers[order]);
        }
    }
}
