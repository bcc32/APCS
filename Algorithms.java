import java.util.*;
import java.io.*;

public class Algorithms
{
    public static <T extends Comparable<? super T>> void bubbleSort(
        ArrayList<T> list )
    {
        for ( int i = 1; i < list.size(); i++ )
            for ( int j = 1; j <= list.size() - i; j++ )
                if ( list.get( j - 1 ).compareTo( list.get( j ) ) > 0 )
                    swap( list, j - 1, j );
    }

    public static <T extends Comparable<? super T>> int findMinLoc(
        ArrayList<T> list )
    {
        int min = 0;
        for ( int i = 1; i < list.size(); i++ )
            if ( list.get( i ).compareTo( list.get( min ) ) < 0 )
                min = i;
        return min;
    }

    public static <T extends Comparable<? super T>> int findMinLoc(
        ArrayList<T> list, int foo )
    {
        int min = foo;
        for ( int i = foo + 1; i < list.size(); i++ )
            if ( list.get( i ).compareTo( list.get( min ) ) < 0 )
                min = i;
        return min;
    }

    public static <T extends Comparable<? super T>> void insert(
        ArrayList<T> list, T elem )
    {
        for ( int i = 0; i < list.size(); i++ )
            if ( list.get( i ).compareTo( elem ) >= 0 )
            {
                list.add( i, elem );
                return;
            }
        list.add( elem );
    }

    public static <T extends Comparable<? super T>> void insertionSort(
        ArrayList<T> list )
    {
        for ( int i = 1; i < list.size(); i++ )
            for ( int j = 0; j <= i; j++ )
                if ( list.get( j ).compareTo( list.get( i ) ) >= 0 )
                    list.add( j, list.remove( i ) );
    }

    public static <T extends Comparable<? super T>> void merge( List<T> list,
        int foo, int bar, int qux )
    {
        List<T> quux = new ArrayList<T>();
        int foobar = bar;
        while ( foo < foobar && bar < qux )
            if ( list.get( foo ).compareTo( list.get( bar ) ) <= 0 )
                quux.add( list.get( foo++ ) );
            else
                quux.add( list.get( bar++ ) );
        while ( foo < foobar )
            quux.add( list.get( foo++ ) );
        while ( bar < qux )
            quux.add( list.get( bar++ ) );
        list.clear();
        list.addAll( quux );
    }

    public static <T extends Comparable<? super T>> void mergeSort(
        List<T> list )
    {
        if ( list.size() <= 1 )
            return;
        mergeSort( list.subList( 0, list.size() / 2 ) );
        mergeSort( list.subList( list.size() / 2, list.size() ) );
        merge( list, 0, list.size() / 2, list.size() );
    }

    public static <T extends Comparable<? super T>> void selectionSort(
        ArrayList<T> list )
    {
        for ( int i = 0; i < list.size(); i++ )
        {
            int min = i;
            for ( int j = i + 1; j < list.size(); j++ )
                if ( list.get( j ).compareTo( list.get( min ) ) < 0 )
                    min = j;
            swap( list, i, min );
        }
    }

    public static <T extends Comparable<? super T>> void sort(
        ArrayList<T> list )
    {
        mergeSort( list );
    }

    public static <T extends Comparable<? super T>> void swap(
        ArrayList<T> list,
        int i1, int i2 )
    {
        T foo = list.get( i1 );
        list.set( i1, list.get( i2 ) );
        list.set( i2, foo );
    }
}
