public class HeapTest
{
    public static void main( String[] args )
    {
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert( 10 );
        heap.insert( 5 );
        heap.insert( 3 );
        heap.insert( 2 );
        heap.insert( 6 );
        heap.insert( 12 );
        heap.insert( 11 );
        heap.insert( 13 );
        while ( !heap.isEmpty() )
            System.out.println( heap.removeMin().data );
    }
}
