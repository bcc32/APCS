public abstract class ThreeDimensionalShape extends Shape
{
    private double d1, d2, d3;

    public ThreeDimensionalShape( int x, int y, double a, double b, double c )
    {
        super( x, y );
        setDim( a, b, c );
    }

    protected double getD1()
    {
        return d1;
    }

    protected double getD2()
    {
        return d2;
    }

    protected double getD3()
    {
        return d3;
    }

    protected void setDim( double d1, double d2, double d3 )
    {
        setD1( d1 );
        setD2( d2 );
        setD3( d3 );
    }

    protected void setD1( double d1 )
    {
        this.d1 = d1;
    }

    protected void setD2( double d2 )
    {
        this.d2 = d2;
    }

    protected void setD3( double d3 )
    {
        this.d3 = d3;
    }

    public abstract double surfaceArea();
    public abstract double volume();
}
