public class Circle extends TwoDimensionalShape
{
    public Circle()
    {
        super();
        setR( 1.0 );
    }

    public Circle( double x, double y, String name, double r )
    {
        super( x, y, name, r, r );
    }

    public double getR()
    {
        return getD1();
    }

    public void setR( double r )
    {
        super.setD1( r );
        super.setD2( r );
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

    public void setDim( double d1, double d2 )
    {
    }

    public double getArea()
    {
        return Math.PI * Math.pow( getR(), 2.0 );
    }

    public String toString()
    {
        return String.format( "%s radius: %f", super.toString(), getR() );
    }
}
