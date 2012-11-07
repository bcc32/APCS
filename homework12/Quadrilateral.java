public class Quadrilateral
{
    protected Point a, b, c, d;

    public Quadrilateral()
    {
        setPointA( new Point() );
        setPointB( new Point() );
        setPointC( new Point() );
        setPointD( new Point() );
    }

    public Quadrilateral( Point a, Point b, Point c, Point d )
    {
        setPointA( a );
        setPointB( b );
        setPointC( c );
        setPointD( d );
    }

    public Point getPointA()
    {
        return a;
    }

    public Point getPointB()
    {
        return b;
    }

    public Point getPointC()
    {
        return c;
    }

    public Point getPointD()
    {
        return d;
    }

    public void setPoints( Point a, Point b, Point c, Point d )
    {
        setPointA( a );
        setPointB( b );
        setPointC( c );
        setPointD( d );
    }

    public void setPointA( Point p )
    {
        a = p;
    }

    public void setPointA( double x, double y )
    {
        a = new Point( x, y );
    }

    public void setPointB( Point p )
    {
        b = p;
    }

    public void setPointB( double x, double y )
    {
        b = new Point( x, y );
    }

    public void setPointC( Point p )
    {
        c = p;
    }

    public void setPointC( double x, double y )
    {
        c = new Point( x, y );
    }

    public void setPointD( Point p )
    {
        d = p;
    }

    public void setPointD( double x, double y )
    {
        d = new Point( x, y );
    }

    public String toString()
    {
        return String.format( "%s, %s, %s, %s", a, b, c, d );
    }
}
