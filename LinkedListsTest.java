import linkedlists.*;
import java.util.Random;

public class LinkedListsTest
{
    public static void main( String[] args )
    {
        System.out.println( "Stack:" );
        Stack<Integer> stack = new Stack<Integer>();
        stack.push( 2 );
        stack.print();
        stack.push( 3 );
        stack.print();
        stack.push( 4 );
        stack.print();
        stack.pop();
        stack.print();

        System.out.println( "Queue: " );
        Queue<Integer> queue = new Queue<Integer>();
        queue.push( 1 );
        queue.print();
        queue.push( 2 );
        queue.print();
        queue.push( 3 );
        queue.print();
        queue.pop();
        queue.print();
        queue.push( 4 );
        queue.print();
        queue.pop();
        queue.print();
        queue.pop();
        queue.print();
        queue.pop();
        queue.print();

        System.out.println( "reverseCopy():" );
        List<Integer> copy = ListMethods.reverseCopy( stack );
        copy.print();

        System.out.println( "insertInOrder():" );
        Random rand = new Random();
        List<Integer> list = new List<Integer>();
        for ( int i = 0; i < 25; i++ )
            list.insertInOrder( rand.nextInt( 100 ) );
        list.print();
    }
}
