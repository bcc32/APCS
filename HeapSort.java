import java.util.*;
import java.io.*;

public class HeapSort
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        Heap<Integer> heap = new Heap<Integer>();
        while ( in.hasNextInt() )
            heap.insert( in.nextInt() );
        while ( !heap.isEmpty() )
            System.out.println( heap.removeMin() );
    }
}
