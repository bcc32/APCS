import java.util.*;
import java.io.*;

public class Weekday
{
    private static boolean leapq( int year )
    {
        if ( year % 400 == 0 )
            return true;
        else if ( year % 100 == 0 )
            return false;
        else if ( year % 4 == 0 )
            return true;
        else
            return false;
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        System.out.print( "Enter year: " );
        int year = sc.nextInt();
        System.out.print( "Enter month: " );
        int mon = sc.nextInt();
        System.out.print( "Enter day: " );
        int day = sc.nextInt();
        int[] len = { 31, leapq( year ) ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31 };
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday" };
        int w = day - 1;
        for ( int i = 1; i < mon; i++ )
            w += len[i];
        if ( year <= 2012 )
            for ( int i = year; i < 2012; i++ )
                w += leapq( i ) ? 5 : 6;
        else
            for ( int i = 2012; i < year; i++ )
                w += leapq( i ) ? 2 : 1;
        System.out.printf( "%02d/%02d is a %s.\n", mon, day, days[w % 7] );
    }
}
