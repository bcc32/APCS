public abstract class Shape
{
    protected double x, y;
    protected String name;

    public Shape()
    {
        x = 0.0;
        y = 0.0;
        name = "";
    }

    public Shape( double x, double y, String name )
    {
        setX( x );
        setY( y );
        setName( name );
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public String getName()
    {
        return name;
    }

    public void setX( double x )
    {
        this.x = x;
    }

    public void setY( double y )
    {
        this.y = y;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String toString()
    {
        return String.format( "%s: [%f, %f]", name, x, y );
    }
}
