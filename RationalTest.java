import java.util.*;
import java.io.*;

public class RationalTest
{
    public static void main( String[] args )
    {
        Rational a = new Rational( 2, 5 ), b = new Rational( 10, 17 );
        System.out.println( a );
        System.out.println( b );
        System.out.println( a.add( b ) );
        System.out.println( a.subtract( b ) );
        System.out.println( a.multiply( b ) );
        System.out.println( a.divide( b ) );
        System.out.println( b.toFloat( 5 ) );
    }
}
