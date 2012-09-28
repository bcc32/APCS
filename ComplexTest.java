import java.util.*;
import java.io.*;

public class ComplexTest
{
    public static void main( String[] args )
    {
        Complex a = new Complex( 1, 7 );
        Complex b = new Complex( 5, 4 );
        System.out.println( a.add( b ) );
        System.out.println( a.subtract( b ) );
    }
}
