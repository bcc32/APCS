public class Sphere extends ThreeDimensionalShape
{
    public Sphere()
    {
        super();
    }

    public Sphere( double x, double y, String name, double r )
    {
        super( x, y, name, r, r, r );
    }

    public double getR()
    {
        return getD1();
    }

    public void setR( double r )
    {
        super.setD1( r );
        super.setD2( r );
        super.setD3( r );
    }

    @Override
    public void setD1( double d1 )
    {
        setR( d1 );
    }

    @Override
    public void setD2( double d2 )
    {
        setR( d2 );
    }

    @Override
    public void setD3( double d3 )
    {
        setR( d3 );
    }

    public double getArea()
    {
        return 4.0 * Math.pow( getR(), 2.0 );
    }

    public double getVolume()
    {
        return 4.0 / 3.0 * Math.pow( getR(), 3.0 );
    }

    public String toString()
    {
        return String.format( "%s radius: %f", super.toString(), getR() );
    }
}
