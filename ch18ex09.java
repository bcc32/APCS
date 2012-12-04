import java.util.*;
import java.io.*;

public class ch18ex09
{
    private static int pow( int x, int y )
    {
        if ( y == 0 )
            return 1;
        else
            return x * pow( x, y - 1 );
    }

    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        System.out.print( "Enter x: " );
        int x = in.nextInt();
        System.out.print( "Enter y: " );
        int y = in.nextInt();
        System.out.printf( "x ^ y = %d\n", pow( x, y ) );
    }
}
