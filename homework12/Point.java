public class Point
{
    private double x, y;

    public Point()
    {
        setCoord( 0.0, 0.0 );
    }

    public Point( double x, double y )
    {
        setCoord( x, y );
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setCoord( double x, double y )
    {
        setX( x );
        setY( y );
    }

    public void setX( double x )
    {
        this.x = x;
    }

    public void setY( double y )
    {
        this.y = y;
    }

    public double dist( Point p )
    {
        return Math.sqrt( sqr( p.getX() - getX() ) + sqr( p.getY() - getY() ) );
    }

    public double slope( Point p )
    {
        return ( p.getY() - getY() ) / ( p.getX() - getX() );
    }

    public String toString()
    {
        return String.format( "(%s, %s)", getX(), getY() );
    }

    private double sqr( double x )
    {
        return x * x;
    }
}
