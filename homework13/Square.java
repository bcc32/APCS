public class Square extends TwoDimensionalShape
{
    public Square()
    {
        super();
        setSide( 1.0 );
    }

    public Square( double x, double y, String name, double side )
    {
        super( x, y, name, side, side );
    }

    public double getSide()
    {
        return getD1();
    }

    public void setSide( double side )
    {
        setDim( side, side );
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

    public double getArea()
    {
        return Math.pow( getSide(), 2.0 );
    }

    public String toString()
    {
        return String.format( "%s radius: %f", super.toString(), getSide() );
    }
}
