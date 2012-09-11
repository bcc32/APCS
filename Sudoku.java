import java.util.*;
import java.io.*;

public class Sudoku
{
    private static int[][] grid;

    private static boolean rowq()
    {
        for ( int i = 0; i < 9; i++ )
            for ( int j = 1; j < 9; j++ )
            {
                if ( grid[i][j] < 1 || grid[i][j] > 9 )
                    return false;
                for ( int k = 0; k < j; k++ )
                    if ( grid[i][j] == grid[i][k] )
                        return false;
            }
        return true;
    }

    private static boolean colq()
    {
        for ( int i = 0; i < 9; i++ )
            for ( int j = 1; j < 9; j++ )
                for ( int k = 0; k < j; k++ )
                    if ( grid[j][i] == grid[k][i] )
                        return false;
        return true;
    }

    private static boolean boxq()
    {
        int[][][] foo = {
            { {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2},
                {2, 0}, {2, 1}, {2, 2} },
            { {0, 3}, {0, 4}, {0, 5}, {1, 3}, {1, 4}, {1, 5},
                {2, 3}, {2, 4}, {2, 5} },
            { {0, 6}, {0, 7}, {0, 8}, {1, 6}, {1, 7}, {1, 8},
                {2, 6}, {2, 7}, {2, 8} },
            { {3, 0}, {3, 1}, {3, 2}, {4, 0}, {4, 1}, {4, 2},
                {5, 0}, {5, 1}, {5, 2} },
            { {3, 3}, {3, 4}, {3, 5}, {4, 3}, {4, 4}, {4, 5},
                {5, 3}, {5, 4}, {5, 5} },
            { {3, 6}, {3, 7}, {3, 8}, {4, 6}, {4, 7}, {4, 8},
                {5, 6}, {5, 7}, {5, 8} },
            { {6, 0}, {6, 1}, {6, 2}, {7, 0}, {7, 1}, {7, 2},
                {8, 0}, {8, 1}, {8, 2} },
            { {6, 3}, {6, 4}, {6, 5}, {7, 3}, {7, 4}, {7, 5},
                {8, 3}, {8, 4}, {8, 5} },
            { {6, 6}, {6, 7}, {6, 8}, {7, 6}, {7, 7}, {7, 8},
                {8, 6}, {8, 7}, {8, 8} }
        };
        for ( int i = 0; i < 9; i++ )
            for ( int j = 1; j < 9; j++ )
                for ( int k = 0; k < j; k++ )
                    if ( grid[foo[i][j][0]][foo[i][j][1]] ==
                        grid[foo[i][k][0]][foo[i][k][1]] )
                        return false;
        return true;
    }

    public static void main( String[] args ) throws IOException
    {
        BufferedReader in = new BufferedReader(
            new FileReader( "sudoku.txt" ) );
        grid = new int[9][9];
        for ( int i = 0; i < 9; i++ )
        {
            for ( int j = 0; j < 9; j++ )
                grid[i][j] = (int)in.read() - (int)'0';
            in.read();
        }
        if ( rowq() && colq() && boxq() )
            System.out.println( "Complete and Valid" );
        else
            System.out.println( "Invalid or Incomplete" );
    }
}
