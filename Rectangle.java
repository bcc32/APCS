public class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {
        this( 1.0, 1.0 );
    }

    public Rectangle( double l, double w )
    {
        setLength( l );
        setWidth( w );
    }

    public Rectangle( Rectangle rect )
    {
        this( rect.getLength(), rect.getWidth() );
    }

    public void setLength( double l )
    {
        if ( l >= 0.0 && l < 20.0 )
            length = l;
        else
            length = 1.0;
    }

    public void setWidth( double w )
    {
        if ( w >= 0.0 && w < 20.0 )
            width = w;
        else
            width = 1.0;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double perimeter()
    {
        return 2 * ( length + width );
    }

    public double area()
    {
        return length * width;
    }
}
