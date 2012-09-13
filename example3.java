import java.util.*;
import java.io.*;

public class example3
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        int[] arr = new int[5];
        int index = 0;
        for ( int i = 0; i < 5; i++ )
        {
            System.out.print( "Enter a number: " );
            int x = input.nextInt();
            boolean good = true;
            if ( x < 10 || x > 100 )
                good = false;
            else
                for ( int n : arr )
                    if ( n == x )
                    {
                        good = false;
                        break;
                    }
            if ( good )
            {
                arr[index++] = x;
                Arrays.sort( arr, 0, index );
            }
            else
                System.out.println( "Invalid entry." );
            for ( int j = 0; j < index; j++ )
                System.out.print( arr[j] + " " );
            System.out.println();
        }
    }
}
