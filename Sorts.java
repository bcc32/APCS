import java.util.*;
import java.io.*;

public class Sorts
{
    private static int binarySearch(
        ArrayList<Integer> arr, int elem )
    {
        return binarySearch( arr, elem, 0, arr.size() );
    }

    private static int binarySearch(
        ArrayList<Integer> arr, int elem, int foo, int bar )
    {
        int mid = ( foo + bar ) / 2;
        if ( arr.get( foo ) == elem )
            return foo;
        else if ( arr.get( bar - 1 ) == elem )
            return bar - 1;
        else if ( arr.get( mid ) == elem )
            return mid;
        else if ( arr.get( mid ) < elem )
            return binarySearch( arr, elem, foo + 1, mid );
        else
            return binarySearch( arr, elem, mid + 1, bar - 1 );
    }

    private static void bubbleSort(
        ArrayList<Integer> arr )
    {
        for ( int i = 1; i < arr.size(); i++ )
            for ( int j = 1; i + j <= arr.size(); j++ )
                if ( arr.get( j ) < arr.get( j - 1 ) )
                    swap( arr, j - 1, j );
    }

    private static void bubbleSort(
        ArrayList<Integer> arr, Comparator<Object> comp )
    {
        for ( int i = 1; i < arr.size(); i++ )
            for ( int j = 1; i + j <= arr.size(); j++ )
                if ( comp.compare( arr.get( j ), arr.get( j - 1 ) ) < 0 )
                    swap( arr, j - 1, j );
    }

    private static void insertionSort(
        ArrayList<Integer> arr )
    {
        for ( int i = 1; i < arr.size(); i++ )
            for ( int j = 0; j <= i; j++ )
                if ( arr.get( j ) >= arr.get( i ) )
                    arr.add( j, arr.remove( i ) );
    }

    private static void insertionSort(
        ArrayList<Integer> arr, Comparator<Object> comp )
    {
        for ( int i = 1; i < arr.size(); i++ )
            for ( int j = 0; j <= i; j++ )
                if ( comp.compare( arr.get( j ), arr.get( i ) ) >= 0 )
                    arr.add( j, arr.remove( i ) );
    }

    private static void selectionSort(
        ArrayList<Integer> arr )
    {
        for ( int i = 1; i < arr.size(); i++ )
        {
            int min = i - 1;
            for ( int j = i; j < arr.size(); j++ )
                if ( arr.get( j ) < arr.get( min ) )
                    min = j;
            swap( arr, i - 1, min );
        }
    }

    private static void selectionSort(
        ArrayList<Integer> arr, Comparator<Object> comp )
    {
        for ( int i = 1; i < arr.size(); i++ )
        {
            int min = i - 1;
            for ( int j = i; j < arr.size(); j++ )
                if ( comp.compare( arr.get( j ), arr.get( min ) ) < 0 )
                    min = j;
            swap( arr, i - 1, min );
        }
    }

    private static void swap(
        ArrayList<Integer> arr, int i, int j )
    {
        int t = arr.get( i );
        arr.set( i, arr.get( j ) );
        arr.set( j, t );
    }

    private static void printChoices()
    {
        System.out.println( "Choose one of the following: " );
        System.out.println( "(1) Bubble sort" );
        System.out.println( "(2) Reverse bubble sort" );
        System.out.println( "(3) Insertion sort" );
        System.out.println( "(4) Reverse insertion sort" );
        System.out.println( "(5) Selection sort" );
        System.out.println( "(6) Reverse insertion sort" );
        System.out.println( "(-1) Quit" );
    }

    private static void printArray( ArrayList<Integer> arr )
    {
        for ( int i = 0; i < arr.size(); i++ )
        {
            System.out.printf( "%d ", arr.get( i ) );
            if ( i % 10 == 9 )
                System.out.println();
        }
    }

    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.print( "Enter 10 numbers: " );
            for ( int i = 0; i < 10; i++ )
                arr.add( in.nextInt() );
        int choice;
        printArray( arr );
        printChoices();
        choice = in.nextInt();
        while ( choice >= 0 )
        {
            long start = 0;
            long time = 0;
            switch ( choice )
            {
                case 1:
                    start = System.nanoTime();
                    bubbleSort( arr );
                    time = System.nanoTime() - start;
                    break;
                case 2:
                    start = System.nanoTime();
                    bubbleSort( arr, Collections.reverseOrder() );
                    time = System.nanoTime() - start;
                    break;
                case 3:
                    start = System.nanoTime();
                    insertionSort( arr );
                    time = System.nanoTime() - start;
                    break;
                case 4:
                    start = System.nanoTime();
                    insertionSort( arr, Collections.reverseOrder() );
                    time = System.nanoTime() - start;
                    break;
                case 5:
                    start = System.nanoTime();
                    selectionSort( arr );
                    time = System.nanoTime() - start;
                    break;
                case 6:
                    start = System.nanoTime();
                    selectionSort( arr, Collections.reverseOrder() );
                    time = System.nanoTime() - start;
                    break;
                default:
                    System.err.println( "Invalid Choice." );
                    break;
            }
            printArray( arr );
            System.out.println( time );
            System.out.print( "Search for element: " );
            int elem = in.nextInt();
            System.out.printf( "Index: %d\n", binarySearch( arr, elem ) );
            Collections.shuffle( arr );
            printArray( arr );
            printChoices();
            choice = in.nextInt();
        }
    }
}
