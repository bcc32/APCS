import java.util.*;
import java.io.*;

public class homework3
{
    public static void main( String[] args )
    {
        int[] freq = new int[13];
        Random rand = new Random();
        for ( int i = 0; i < 36000; i++ )
        {
            int roll1 = 1 + rand.nextInt( 6 );
            int roll2 = 1 + rand.nextInt( 6 );
            freq[roll1 + roll2]++;
        }
        System.out.printf( "%8s%16s%16s\n",
            "Sum", "Frequency", "Percentage");
        for ( int i = 2; i <= 12; i++ )
            System.out.printf( "%8d%16d%16.2f\n",
                i, freq[i], freq[i] / 360.0 );
    }
}
