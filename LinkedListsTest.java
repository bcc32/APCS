import linkedlists.*;

public class LinkedListsTest
{
    public static void main( String[] args )
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push( 2 );
        stack.print();
        stack.push( 3 );
        stack.print();
        stack.push( 4 );
        stack.print();
        stack.pop();
        stack.print();

        List<Integer> copy = ListMethods.reverseCopy( stack );
        copy.print();
    }
}
