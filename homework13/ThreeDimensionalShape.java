public abstract class ThreeDimensionalShape extends Shape
{
    protected double d1, d2, d3;

    public ThreeDimensionalShape()
    {
        super();
        d1 = 0.0;
        d2 = 0.0;
        d3 = 0.0;
    }

    public ThreeDimensionalShape( double x, double y, String name,
        double d1, double d2, double d3 )
    {
        super( x, y, name );
        setDim( d1, d2, d3 );
    }

    public double getD1()
    {
        return d1;
    }

    public double getD2()
    {
        return d2;
    }

    public double getD3()
    {
        return d3;
    }

    public void setD1( double d1 )
    {
        this.d1 = d1;
    }

    public void setD2( double d2 )
    {
        this.d2 = d2;
    }

    public void setD3( double d3 )
    {
        this.d3 = d3;
    }

    public void setDim( double d1, double d2, double d3 )
    {
        setD1( d1 );
        setD2( d2 );
        setD3( d3 );
    }

    public abstract double getArea();

    public abstract double getVolume();
}
