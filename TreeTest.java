public class TreeTest
{
    public static void main( String[] args )
    {
        Tree<Integer> tree = new Tree<Integer>();
        tree.insert( 10 );
        tree.insert( 5 );
        tree.insert( 3 );
        tree.insert( 2 );
        tree.insert( 6 );
        tree.insert( 12 );
        tree.insert( 11 );
        tree.insert( 13 );
        tree.print();

        System.out.printf( "tree.contains( 5 ): %b\n", tree.contains( 5 ) );
        System.out.printf( "tree.contains( 7 ): %b\n", tree.contains( 7 ) );
    }
}
