import java.util.*;
import java.io.*;

public class ch22ex12
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        String line = in.nextLine();
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for ( char ch : line.toCharArray() )
            switch ( ch )
            {
            case '(':
            case '+':
            case '-':
            case '*':
            case '/':
                stack.push( ch );
                break;
            case ' ':
                break;
            case ')':
                while ( !stack.empty() && stack.peek() != '(' )
                    sb.append( stack.pop() );
                if ( stack.empty() )
                {
                    System.err.println( "Parentheses not balanced" );
                    System.exit( 1 );
                }
                stack.pop();
                break;
            default:
                sb.append( ch );
                break;
            }
        while ( !stack.empty() )
        {
            if ( stack.peek() == '(')
            {
                System.err.println( "Parentheses not balanced" );
                System.exit( 1 );
            }
            sb.append( stack.pop() );
        }
        System.out.println( sb.toString() );
    }
}
