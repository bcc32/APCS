import java.util.*;
import java.io.*;

public class Rational
{
    private int numerator, denominator;

    public Rational()
    {
        numerator = 0;
        denominator = 1;
    }

    public Rational( int n, int d )
    {
        int g = gcd( n, d );
        numerator = n / g;
        denominator = d / g;
        negs();
    }

    public void setNumerator( int n )
    {
        int g = gcd( n, denominator );
        numerator = n / g;
        denominator /= g;
        negs();
    }

    public void setDemoninator( int d )
    {
        int g = gcd( numerator, d );
        numerator /= g;
        denominator = d / g;
        negs();
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public Rational add( Rational r )
    {
        return new Rational( numerator * r.getDenominator() +
            denominator * r.getNumerator(), denominator * r.getDenominator() );
    }

    public Rational subtract( Rational r )
    {
        return new Rational( numerator * r.getDenominator() -
            denominator * r.getNumerator(), denominator * r.getDenominator() );
    }

    public Rational multiply( Rational r )
    {
        return new Rational( numerator * r.getNumerator(),
            denominator * r.getDenominator() );
    }

    public Rational divide( Rational r )
    {
        return new Rational( numerator * r.getDenominator(),
            denominator * r.getNumerator() );
    }

    public String toString()
    {
        return String.format( "%d/%d", numerator, denominator );
    }

    public String toFloat()
    {
        return String.format( "%.2f", (double)numerator / denominator );
    }

    public String toFloat( int precision )
    {
        String format = String.format( "%%.%df", precision );
        return String.format( format, (double)numerator / denominator );
    }

    private int gcd( int a, int b )
    {
        if ( b == 0 )
            return a;
        else
            return gcd( b, a % b );
    }

    private void negs()
    {
        if ( denominator < 0 && numerator >= 0 )
        {
            numerator *= -1;
            denominator *= -1;
        }
    }
}
