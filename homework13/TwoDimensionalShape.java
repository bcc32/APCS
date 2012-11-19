public abstract class TwoDimensionalShape extends Shape
{
    protected double d1, d2;

    public TwoDimensionalShape()
    {
        super();
        d1 = 0.0;
        d2 = 0.0;
    }

    public TwoDimensionalShape( double x, double y, String name,
        double d1, double d2 )
    {
        super( x, y, name );
        setDim( d1, d2 );
    }

    public double getD1()
    {
        return d1;
    }

    public double getD2()
    {
        return d2;
    }

    public void setD1( double d1 )
    {
        this.d1 = d1;
    }

    public void setD2( double d2 )
    {
        this.d2 = d2;
    }

    public void setDim( double d1, double d2 )
    {
        setD1( d1 );
        setD2( d2 );
    }

    public abstract double getArea();
}
