import java.util.*;
import java.io.*;

public class Algorithms
{
    public static <T extends Comparable<? super T>> int binarySearch(
        List<T> sortedList, T elem )
    {
        return binarySearch( sortedList, elem, 0, sortedList.size() );
    }

    public static <T extends Comparable<? super T>> int binarySearch(
        List<T> sortedList, T elem, Comparator<T> comp )
    {
        return binarySearch( sortedList, elem, 0, sortedList.size(), comp );
    }

    public static <T extends Comparable<? super T>> int binarySearch(
        List<T> sortedList, T elem, int foo, int bar )
    {
        return binarySearch( sortedList, elem, 0, sortedList.size(),
            new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> int binarySearch(
        List<T> sortedList, T elem, int foo, int bar, Comparator<T> comp )
    {
        if ( bar - foo < 1 )
            return -1;
        int mid = ( foo + bar ) / 2;
        if ( comp.compare( sortedList.get( foo ), elem ) == 0 )
            return foo;
        else if ( comp.compare( sortedList.get( bar - 1 ), elem ) == 0 )
            return bar - 1;
        else if ( comp.compare( sortedList.get( mid ), elem ) == 0 )
            return mid;
        else if ( comp.compare( sortedList.get( mid ), elem ) < 0 )
            return binarySearch( sortedList, elem, foo + 1, mid );
        else
            return binarySearch( sortedList, elem, mid + 1, bar - 1 );
    }

    public static <T extends Comparable<? super T>> void bubbleSort(
        List<T> list )
    {
        bubbleSort( list, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void bubbleSort(
        List<T> list, Comparator<T> comp )
    {
        for ( int i = 1; i < list.size(); i++ )
            for ( int j = 1; j <= list.size() - i; j++ )
                if ( list.get( j - 1 ).compareTo( list.get( j ) ) > 0 )
                    swap( list, j - 1, j );
    }

    public static <T extends Comparable<? super T>> boolean contains(
        List<T> list, T elem )
    {
        return contains( list, elem, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> boolean contains(
        List<T> list, T elem, Comparator<T> comp )
    {
        for ( int i = 0; i < list.size(); i++ )
            if ( comp.compare( list.get( i ), elem ) == 0 )
                return true;
        return false;
    }

    public static <T extends Comparable<? super T>> boolean contains(
        List<T> list, T elem, boolean sorted )
    {
        if ( sorted )
            return binarySearch( list, elem ) >= 0;
        else
            return contains( list, elem );
    }

    public static <T extends Comparable<? super T>> boolean contains(
        List<T> list, T elem, Comparator<T> comp, boolean sorted )
    {
        if ( sorted )
            return binarySearch( list, elem, comp ) >= 0;
        else
            return contains( list, elem, comp );
    }

    public static <T extends Comparable<? super T>> int findMinLoc(
        List<T> list )
    {
        return findMinLoc( list, 0 );
    }

    public static <T extends Comparable<? super T>> int findMinLoc(
        List<T> list, Comparator<T> comp )
    {
        return findMinLoc( list, comp, 0 );
    }

    public static <T extends Comparable<? super T>> int findMinLoc(
        List<T> list, int foo )
    {
        return findMinLoc( list, new DefaultComparator<T>(), foo );
    }

    public static <T extends Comparable<? super T>> int findMinLoc(
        List<T> list, Comparator<T> comp, int foo )
    {
        int min = foo;
        for ( int i = foo + 1; i < list.size(); i++ )
            if ( comp.compare( list.get( i ), list.get( min ) ) < 0 )
                min = i;
        return min;
    }

    public static <T extends Comparable<? super T>> void insert(
        List<T> list, T elem )
    {
        insert( list, elem, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void insert(
        List<T> list, T elem, Comparator<T> comp )
    {
        for ( int i = 0; i < list.size(); i++ )
            if ( comp.compare( list.get( i ), elem ) >= 0 )
            {
                list.add( i, elem );
                return;
            }
        list.add( elem );
    }

    public static <T extends Comparable<? super T>> void insertionSort(
        List<T> list )
    {
        insertionSort( list, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void insertionSort(
        List<T> list, Comparator<T> comp )
    {
        for ( int i = 1; i < list.size(); i++ )
        {
            T x = list.get( i );
            int j = i + 1;
            while ( --j > 0 && comp.compare( list.get( j - 1 ), x ) > 0 )
                list.set( j, list.get( j - 1 ) );
            list.set( j, x );
        }
    }

    public static <T extends Comparable<? super T>> void merge(
        List<T> list, int foo, int bar, int qux )
    {
        merge( list, foo, bar, qux, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void merge(
        List<T> list, int foo, int bar, int qux, Comparator<T> comp )
    {
        List<T> quux = new ArrayList<T>();
        int foobar = bar;
        while ( foo < foobar && bar < qux )
            if ( comp.compare( list.get( foo ), list.get( bar ) ) <= 0 )
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
        mergeSort( list, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void mergeSort(
        List<T> list, Comparator<T> comp )
    {
        if ( list.size() <= 1 )
            return;
        mergeSort( list.subList( 0, list.size() / 2 ), comp );
        mergeSort( list.subList( list.size() / 2, list.size() ), comp );
        merge( list, 0, list.size() / 2, list.size(), comp );
    }

    public static <T extends Comparable<? super T>> void quickSort(
        List<T> list )
    {
        quickSort( list, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void quickSort(
        List<T> list, Comparator<T> comp )
    {
        quickSort( list, 0, list.size() - 1, comp );
    }

    public static <T extends Comparable<? super T>> void quickSort(
    List<T> list, int foo, int bar )
    {
        quickSort( list, foo, bar, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void quickSort(
        List<T> list, int foo, int bar, Comparator<T> comp )
    {
        if ( bar - foo < 1 )
            return;
        int i = foo, k = bar + 1;
        T pivot = list.get( foo );
        while ( k > i )
        {
            while ( ++i < k && comp.compare( list.get( i ), pivot ) <= 0 );
            while ( --k >= i && comp.compare( list.get( k ), pivot ) > 0 );
            if ( k > i )
                swap( list, i, k );
        }
        swap( list, foo, k );
        quickSort( list, foo, k - 1, comp );
        quickSort( list, k + 1, bar, comp );
    }

    public static <T extends Comparable<? super T>> void reverse(
        List<T> list )
    {
        for ( int i = 0; i < list.size() / 2; i++ )
            swap( list, i, list.size() - i - 1 );
    }

    public static <T extends Comparable<? super T>> void reverseSort(
        List<T> list )
    {
        sort( list, new ReverseComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void selectionSort(
        List<T> list )
    {
        selectionSort( list, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void selectionSort(
        List<T> list, Comparator<T> comp )
    {
        for ( int i = 0; i < list.size(); i++ )
        {
            int min = i;
            for ( int j = i + 1; j < list.size(); j++ )
                if ( comp.compare( list.get( j ), list.get( min ) ) < 0 )
                    min = j;
            swap( list, i, min );
        }
    }

    public static <T extends Comparable<? super T>> void sort(
        List<T> list )
    {
        sort( list, new DefaultComparator<T>() );
    }

    public static <T extends Comparable<? super T>> void sort(
        List<T> list, Comparator<T> comp )
    {
        quickSort( list, comp );
    }

    public static <T extends Comparable<? super T>> void swap(
        List<T> list,
        int i1, int i2 )
    {
        T foo = list.get( i1 );
        list.set( i1, list.get( i2 ) );
        list.set( i2, foo );
    }

    public static void xorSwap( List<Integer> list, int a, int b )
    {
        if ( a == b )
            return;
        list.set( a, list.get( a ) ^ list.get( b ) );
        list.set( b, list.get( a ) ^ list.get( b ) );
        list.set( a, list.get( a ) ^ list.get( b ) );
    }

    public static class DefaultComparator<T extends Comparable<? super T>>
        implements Comparator<T>
    {
        public int compare( T foo, T bar )
        {
            return foo.compareTo( bar );
        }
    }

    public static class ReverseComparator<T extends Comparable<? super T>>
        implements Comparator<T>
    {
        public int compare( T foo, T bar )
        {
            return bar.compareTo( foo );
        }
    }
}
