import java.util.*;
import java.io.*;

public class Fibonacci
{
    private static int fibrec( int n )
    {
        return n < 3 ? n : fibrec( n - 1 ) + fibrec( n - 2 );
    }

    private static int fibiter( int n )
    {
        int x = 1, y = 1;
        for ( int i = 1; i < n; i++ )
        {
            int t = y;
            y += x;
            x = t;
        }
        return y;
    }

    public static void main( String[] args )
    {
        if ( args.length > 0 )
            System.out.println( fibiter( Integer.parseInt( args[0] ) ) );
        else
            System.out.println( "needs arguments" );
    }
}
