import java.util.*;
import java.io.*;

public class homework4
{
    static boolean[] seats;
    static int foo, bar;

    private static void assignF()
    {
        seats[foo++] = true;
        System.out.printf( "First Class.  Seat #%d.\n", foo );
    }

    private static void assignE()
    {
        seats[bar++] = true;
        System.out.printf( "Economy Class.  Seat #%d.\n", bar );
    }

    private static void nextFlight()
    {
        System.out.println( "Next flight leaves in 3 hours." );
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        seats = new boolean[10];
        foo = 0;
        bar = 5;
        while ( foo < 5 || bar < 10 )
        {
            System.out.println( "Please type 1 for First Class" );
            System.out.println( "Please type 2 for Economy" );
            System.out.print( "Choice: " );
            int choice = sc.nextInt();
            if ( choice == 1 )
            {
                if ( foo < 5 )
                    assignF();
                else if ( bar < 10 )
                {
                    System.out.println( "First Class is full; Economy class?" );
                    System.out.print( "1. Yes, 2. No.  Your choice: " );
                    int ok = sc.nextInt();
                    if ( ok == 1 )
                        assignE();
                    else
                        nextFlight();
                }
            }
            else
            {
                if ( bar < 10 )
                    assignE();
                else if ( foo < 5 )
                {
                    System.out.println( "Economy Class is full; First class?" );
                    System.out.print( "1. Yes, 2. No.  Your choice: " );
                    int ok = sc.nextInt();
                    if ( ok == 1 )
                        assignF();
                    else
                        nextFlight();
                }
            }
            System.out.println();
        }
    }
}
