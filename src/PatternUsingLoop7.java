public class PatternUsingLoop7 {

    public static void main(String args[])
    {
        int rows;
        int columns;
        int number;
        int n=5;

        for(rows=0; rows<n; rows++)
        {
            number=1;
            for(columns=0; columns<=rows; columns++)
            {
                System.out.print(number+ " ");
                number++;
            }

            System.out.println();
        }
    }
}
