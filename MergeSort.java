import java.util.*;
import java.io.*;

public class MergeSort
{
    public static <T extends Comparable<? super T>> void
            sort( List<T> list )
    {
        sort( list, 0, list.size() );
    }

    public static <T extends Comparable<? super T>> void
            sort( List<T> list, int i, int j )
    {
        if ( j - i <= 1 )
            return;
        sort( list, i, ( i + j ) / 2 );
        sort( list, ( i + j ) / 2, j );
        merge( list, i, ( i + j ) / 2, j );
    }

    private static <T extends Comparable<? super T>> void
            merge( List<T> list, int i, int j, int k )
    {
        int a = i, b = j, c = j, d = k;
        List<T> foo = new ArrayList<T>();
        while ( a < b && c < d )
            if ( list.get( a ).compareTo( list.get( c ) ) <= 0 )
                foo.add( list.get( a++ ) );
            else
                foo.add( list.get( c++ ) );
        while ( a < b )
            foo.add( list.get( a++ ) );
        while ( c < d )
            foo.add( list.get( c++ ) );
        for ( int m = i; m < k; m++ )
            list.set( m, foo.get( m - i ) );
    }

    public static void main( String[] args )
    {
        /*
        Scanner in = new Scanner( System.in );
        List<Integer> list = new ArrayList<Integer>();
        while ( in.hasNextInt() )
            list.add( in.nextInt() );
        sort( list );
        Iterator it = list.iterator();
        while ( it.hasNext() )
            System.out.println( it.next() );
        */

        List<Integer> list = new ArrayList<Integer>();
        for ( int i = 0; i < 20; i++ )
            list.add( (int)( 20 * Math.random() ) );
        for ( int i = 0; i < 20; i++ )
            System.out.printf( "%4d", list.get( i ) );
        System.out.println();
        sort( list );
        for ( int i = 0; i < 20; i++ )
            System.out.printf( "%4d", list.get( i ) );
        System.out.println();
    }
}
