import java.util.*;
import java.io.*;

class Customer
{
    public static int num = 0;
    public int id;
    public int time;
    public int start;

    public Customer( int time, int start )
    {
        this.id = num++;
        this.time = time;
        this.start = start;
    }
}

public class ch22ex15
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        int nextArrive, nextDone, servStart = 0;
        int maxLen = 0, maxWait = 0;
        nextArrive = 1 + rand.nextInt( 4 );
        ArrayDeque<Customer> line = new ArrayDeque<Customer>();
        for ( int currTime = 0; currTime < 720; currTime++ )
        {
            if ( line.size() > maxLen )
                maxLen = line.size();
            if ( currTime == nextArrive )
            {
                System.out.printf( "New Customer: id %d\n", Customer.num );
                Customer c = new Customer( 1 + rand.nextInt( 4 ), currTime );
                line.addLast( c );
                nextArrive += rand.nextInt( 4 );
            }
            if ( line.isEmpty() )
                continue;
            else if ( line.size() == 1 )
            {
                servStart = currTime;
                nextArrive = currTime + 1 + rand.nextInt( 4 );
            }
            else if ( currTime == servStart + line.peekFirst().time )
            {
                System.out.printf( "Done with Customer: id %d\n",
                    line.peekFirst().id );
                if ( servStart - line.peekFirst().start > maxWait )
                    maxWait = servStart - line.peekFirst().start;
                System.out.printf( "Time waited: %d\n",
                    servStart - line.peekFirst().start );
                line.removeFirst();
                servStart = currTime;
            }
        }
        System.out.printf( "Max queue length: %d\n", maxLen );
        System.out.printf( "Max wait time: %d\n", maxWait );
    }
}
