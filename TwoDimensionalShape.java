public abstract class TwoDimensionalShape extends Shape
{
    private double d1, d2;

    public TwoDimensionalShape( int x, int y, double a, double b )
    {
        super( x, y );
        setDim( d1, d2 );
    }

    protected double getD1()
    {
        return d1;
    }

    protected double getD2()
    {
        return d2;
    }

    protected void setDim( double d1, double d2 )
    {
        setD1( d1 );
        setD2( d2 );
    }

    protected void setD1( double d1 )
    {
        this.d1 = d1;
    }

    protected void setD2( double d2 )
    {
        this.d2 = d2;
    }

    public abstract double area();
}
