// Homework 8: Time3Test.java
// Demonstrating the Time3 class set and get methods
import java.util.Scanner;

public class Time3Test
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in );

        Time3 time = new Time3();

        System.out.println( "Enter the time" );
        System.out.print( "Hours: " );
        time.setHour( input.nextInt() );
        System.out.print( "Minutes: " );
        time.setMinute( input.nextInt() );
        System.out.print( "Seconds: " );
        time.setSecond( input.nextInt() );

        int choice = getMenuChoice();

        while ( choice != 5 )
        {
            switch ( choice )
            {
                case 1: // add 1 second
                    time.tick();
                    break;
                case 2: // add 1 minute
                    time.incrementMinute();
                    break;
                case 3: // and 1 hour
                    time.incrementHour();
                    break;
                case 4: // add arbitrary seconds
                    System.out.print( "Enter seconds to tick: " );
                    int ticks = input.nextInt();

                    for ( int i = 0; i < ticks; i++ )
                        time.tick();

                    break;
            } // end switch

            System.out.printf( "Hour: %d Minute: %d  Second: %d\n",
                    time.getHour(), time.getMinute(), time.getSecond() );
            System.out.printf( "Universal time: %s  Standard time: %s\n",
                    time.toUniversalString(), time.toString() );

            choice = getMenuChoice();
        } // end while
    } // end main

    // prints a menu and returns a value corresponding to the menu choice
    private static int getMenuChoice()
    {
        Scanner input = new Scanner( System.in );

        System.out.println( "1. Add 1 second" );
        System.out.println( "2. Add 1 Minute" );
        System.out.println( "3. Add 1 Hour" );
        System.out.println( "4. Add seconds" );
        System.out.println( "5. Exit" );
        System.out.print( "Choice: " );

        return input.nextInt();
    } // end method getMenuChoice
} // end class Time3Test
