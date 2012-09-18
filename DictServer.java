import java.util.*;
import java.io.*;
import java.net.*;

class DictServer implements Runnable
{
    Socket s;
    int id;
    String filename;

    public static void main( String[] args )
    {
        int port = 9999, foo = 0;
        try
        {
            ServerSocket ss = new ServerSocket( port );
            while ( true )
            {
                Socket s = ss.accept();
                System.out.println( "Client connected." );
                DictServer server;
                if ( args.length > 0 )
                    server = new DictServer( s, foo++, args[0] );
                else
                    server = new DictServer( s, foo++, "dict.txt" );
                Thread t = new Thread( server );
                t.start();
            }
        }
        catch ( Exception e )
        {
            System.err.println( e ); e.printStackTrace();
        }
    }

    DictServer( Socket s, int id, String filename )
    {
        this.s = s;
        this.id = id;
        this.filename = filename;
    }

    public void run()
    {
        try
        {
            BufferedReader dict = new BufferedReader( new FileReader(
                filename ) );
            BufferedReader in = new BufferedReader( new InputStreamReader(
                s.getInputStream() ) );
            PrintWriter out = new PrintWriter( new OutputStreamWriter(
                s.getOutputStream() ) );
            String word = in.readLine();
            System.out.printf( "Client requested word \"%s\".\n", word );
            boolean found = false;
            while ( dict.ready() )
            {
                String line = dict.readLine();
                if ( !line.matches( "[^a-z]+" ) )
                    continue;
                String[] tokens = line.split( "; " );
                for ( String token : tokens )
                    if ( token.equals( word.toUpperCase() ) )
                    {
                        found = true;
                        line = dict.readLine();
                        while ( !line.matches( "[^a-z]+" ) )
                        {
                            out.println( line );
                            line = dict.readLine();
                        }
                    }
            }
            if ( !found )
                out.printf( "NOT FOUND\n\n" );
            out.flush();
        }
        catch ( Exception e )
        {
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
    }
}
