import java.util.*;
import java.io.*;

public class Complex
{
    private double real, imag;

    public Complex()
    {
        real = 0.0;
        imag = 0.0;
    }

    public Complex( double r, double i )
    {
        setReal( r );
        setImag( i );
    }

    public void setReal( double r )
    {
        real = r;
    }

    public void setImag( double i )
    {
        imag = i;
    }

    public double getReal()
    {
        return real;
    }

    public double getImag()
    {
        return imag;
    }

    public Complex add( Complex cmplx )
    {
        return new Complex( real + cmplx.getReal(),
            imag + cmplx.getImag() );
    }

    public Complex subtract( Complex cmplx )
    {
        return new Complex( real - cmplx.getReal(),
            imag - cmplx.getImag() );
    }

    public String toString()
    {
        return String.format( "(%f, %f)", real, imag );
    }
}
