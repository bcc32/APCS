import java.util.*;
import java.io.*;

public class BubbleSort
{
    private static void bsort( ArrayList<Integer> list )
    {
        for ( int i = 1; i < list.size(); i++ )
            for ( int j = 1; j < list.size(); j++ )
                if ( list.get( j - 1 ) > list.get( j ) )
                {
                    int foo = list.get( j - 1 );
                    list.set( j - 1, list.get( j ) );
                    list.set( j, foo );
                }
    }

    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        System.out.print( "Enter number of integers: " );
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>( size );
        for ( int i = 0; i < size; i++ )
            list.add( i, in.nextInt() );
        bsort( list );
        Iterator<Integer> iter = list.iterator();
        while ( iter.hasNext() )
            System.out.printf( "%d ", iter.next() );
        System.out.println();
    }
}
