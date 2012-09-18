import java.util.*;
import java.net.*;
import java.io.*;

public class DictClient
{
    public static void main( String[] args ) throws Exception
    {
        int port = 9999;
        try
        {
            Scanner sc = new Scanner( System.in );
            InetAddress addr;
            if ( args.length > 0 )
                addr = InetAddress.getByName( args[0] );
            else
                addr = InetAddress.getByName( null );
            Socket s = new Socket( addr, port );
            BufferedReader in = new BufferedReader( new InputStreamReader(
                s.getInputStream() ) );
            PrintWriter out = new PrintWriter( new OutputStreamWriter(
                s.getOutputStream() ) );

            System.out.printf( "Enter a word: " );
            String word = sc.nextLine();
            out.println( word );
            out.flush();
            boolean rec = false;
            while ( !rec )
                while ( in.ready() )
                {
                    System.out.println( in.readLine() );
                    rec = true;
                }
            s.close();
        }
        catch ( Exception e )
        {
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
    }
}
