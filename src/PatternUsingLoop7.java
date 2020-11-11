public class PatternUsingLoop7 {

    public static void main(String args[])
    {
        int rows;
        int columns;

        for ( rows = 5;  rows >= 1; rows--)
        {
            for (columns = rows; columns >= 1; columns--)
            {
                System.out.print(columns+" ");
            }
            System.out.println();
        }
        }
    }

