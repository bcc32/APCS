import java.util.*;
import java.io.*;

public class ch18ex20
{
    private static boolean mazeTraversal( char[][] maze, int x, int y )
    {
        print( maze );
        maze[x][y] = 'x';
        if ( x > 0 && maze[x - 1][y] == '.' )
        {
            maze[x - 1][y] = 'x';
            if ( mazeTraversal( maze, x - 1, y ) )
                return true;
            else
            {
                maze[x - 1][y] = '.';
                print( maze );
            }
        }
        if ( x < maze.length - 1 && maze[x + 1][y] == '.' )
        {
            maze[x + 1][y] = 'x';
            if ( mazeTraversal( maze, x + 1, y ) )
                return true;
            else
            {
                maze[x + 1][y] = '.';
                print( maze );
            }
        }
        if ( y > 0 && maze[x][y - 1] == '.' )
        {
            maze[x][y - 1] = 'x';
            if ( mazeTraversal( maze, x, y - 1 ) )
                return true;
            else
            {
                maze[x][y - 1] = '.';
                print( maze );
            }
        }
        if ( y < maze.length - 1 && maze[x][y + 1] == '.' )
        {
            maze[x][y + 1] = 'x';
            if ( mazeTraversal( maze, x, y + 1 ) )
                return true;
            else
            {
                print( maze );
                maze[x][y + 1] = '.';
            }
        }
        if ( x == 0 || x == maze.length - 1 || y == 0 || y == maze.length - 1 )
            return true;
        return false;
    }

    private static void print( char[][] maze )
    {
        System.console().readLine();
        for ( char[] sub : maze )
        {
            for ( char ch : sub )
                System.out.print( ch );
            System.out.println();
        }
    }

    public static void main( String[] args ) throws IOException
    {
        Scanner in = new Scanner( new File( "maze.txt" ) );
        char[][] maze = new char[12][12];
        for ( int i = 0; i < 12; i++ )
            maze[i] = in.nextLine().toCharArray();
        mazeTraversal( maze, in.nextInt(), in.nextInt() );
    }
}
