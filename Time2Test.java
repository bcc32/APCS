// Time2Test.java
// Program adds validation to Fig. 8.7 example
import java.util.Scanner;

public class Time2Test
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in );
        Time2 time = new Time2(); // the Time2 object
        int choice = getMenuChoice();
        while ( choice != 5 )
        {
            switch ( choice )
            {
                case 1: // set hour
                    System.out.print( "Enter Hours: " );
                    int hours = input.nextInt();
                    if ( !time.setHour( hours ) )
                        System.err.println( "Invalid.  Hours set to 0." );
                    break;
                case 2: // set minute
                    System.out.print( "Enter Minutes: " );
                    int minutes = input.nextInt();
                    if ( !time.setMinute( minutes ) )
                        System.err.println( "Invalid.  Minutes set to 0." );
                    break;
                case 3: // set seconds
                    System.out.print( "Enter Seconds: " );
                    int seconds = input.nextInt();
                    if ( !time.setSecond( seconds ) )
                        System.err.println( "Invalid.  Seconds set to 0." );
                    break;
                case 4: // add 1 second
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
        System.out.println( "1. Set Hour" );
        System.out.println( "2. Set Minute" );
        System.out.println( "3. Set Second" );
        System.out.println( "4. Add 1 second" );
        System.out.println( "5. Exit" );
        System.out.print( "Choice: " );
        return input.nextInt();
    } // end method getMenuChoice
} // end class Time2Test
