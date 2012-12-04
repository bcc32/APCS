import java.util.*;
import java.io.*;

public class ch18ex11
{
    private static int gcd( int x, int y )
    {
        if ( y == 0 )
            return x;
        else
            return gcd( y, x % y );
    }

    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        System.out.println( gcd( in.nextInt(), in.nextInt() ) );
    }
}
