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
        System.out.println();

        System.out.printf( "tree.contains( 5 ): %b\n", tree.contains( 5 ) );
        System.out.printf( "tree.contains( 7 ): %b\n", tree.contains( 7 ) );
        System.out.println();

        System.out.println( "After deleting 11: " );
        tree.delete( 11 );
        tree.print();
        System.out.println();

        System.out.println( "Traversals: " );
        System.out.println( "Pre-order: " );
        tree.traversePreOrder();
        System.out.println( "In-order: " );
        tree.traverseInOrder();
        System.out.println( "Post-order: " );
        tree.traversePostOrder();
    }
}
