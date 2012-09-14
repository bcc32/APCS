import java.util.*;
import java.io.*;

public class homework2
{
    private static void printArray( int[] array1 )
    {
        for ( int i = 0; i < array1.length; i++ )
        {
            System.out.printf( "%d ", array1[i] );
            if ( i % 20 == 19 )
                System.out.println();
        }
    }

    public static void main( String[] args )
    {
        int[] array = new int[100];
        for ( int i = 0; i < 100; i++ )
            array[i] = -1;
        array[6] = 7;
        printArray( array );
        char[] charArray = { 'H', 'i', ' ', 't', 'h', 'e', 'r', 'e' };
        for ( char ch : charArray )
            System.out.printf( "%c ", ch );
        System.out.println();
        for ( int i = 0; i < 2; i++ )
            System.out.print( charArray[i] );
        System.out.println();
    }
}
