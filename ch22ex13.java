import java.util.*;
import java.io.*;

public class ch22ex13
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        String line = in.nextLine();
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int x, y;
        for ( char ch : line.toCharArray() )
            switch ( ch )
            {
            case '+':
                x = stack.pop();
                y = stack.pop();
                stack.push( y + x );
                break;
            case '-':
                x = stack.pop();
                y = stack.pop();
                stack.push( y - x );
                break;
            case '*':
                x = stack.pop();
                y = stack.pop();
                stack.push( y * x );
                break;
            case '/':
                x = stack.pop();
                y = stack.pop();
                stack.push( y / x );
                break;
            case ' ':
                break;
            default:
                stack.push( ch - '0' );
                break;
            }
        if ( stack.size() != 1 )
            System.err.println( "Invalid input." );
        else
            System.out.println( stack.pop() );
    }
}
