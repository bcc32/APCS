import java.util.*;
import java.io.*;

public class Weekday
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        System.out.print( "Enter month: " );
        int mon = sc.nextInt();
        System.out.print( "Enter day: " );
        int day = sc.nextInt();
        int[] len = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday" };
        int w = day - 1;
        for ( int i = 1; i < mon; i++ )
            w += len[i];
        System.out.printf( "%02d/%02d is a %s.\n", mon, day, days[w % 7] );
    }
}
