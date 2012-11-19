public class Cube extends ThreeDimensionalShape
{
    public Cube()
    {
        super();
    }

    public Cube( double x, double y, String name, double side )
    {
        super( x, y, name, side, side, side );
    }

    public double getSide()
    {
        return getD1();
    }

    public void setSide( double side )
    {
        super.setD1( side );
        super.setD2( side );
        super.setD3( side );
    }

    @Override
    public void setD1( double d1 )
    {
        setSide( d1 );
    }

    @Override
    public void setD2( double d2 )
    {
        setSide( d2 );
    }

    @Override
    public void setD3( double d3 )
    {
        setSide( d3 );
    }

    public double getArea()
    {
        return 6.0 * Math.pow( getSide(), 2.0 );
    }

    public double getVolume()
    {
        return Math.pow( getSide(), 3.0 );
    }

    public String toString()
    {
        return String.format( "%s side: %f", super.toString(), getSide() );
    }
}
