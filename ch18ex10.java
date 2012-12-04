import java.util.*;
import java.io.*;

public class ch18ex10
{
    private static int fact( int n, int level )
    {
        for ( int i = 0; i < level; i++ )
            System.out.print( "    " );
        if ( n == 0 )
        {
            System.out.printf( "fact( %d )\n", n );
            return 1;
        }
        else
        {
            System.out.printf( "%d * fact( %d )\n", n, n - 1 );
            return n * fact( n - 1, level + 1 );
        }
    }

    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        System.out.println( fact( in.nextInt(), 0 ) );
    }
}
