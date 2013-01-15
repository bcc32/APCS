import java.util.*;
import java.io.*;

public class PirateParrot extends Parrot
{
    public PirateParrot( String name )
    {
        super( name );
        train( "Polly want a cracker" );
    }

    public void stealSoul( int age )
    {
        setAge( getAge() + age );
    }
}
