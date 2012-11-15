public class Rectangle extends Parallelogram
{
    public Rectangle()
    {
        super();
    }

    public Rectangle( Point a, Point b, Point c, Point d )
    {
        super( a, b, c, d );
    }

    @Override
    public void setPoints( Point a, Point b, Point c, Point d )
    {
        try
        {
            verifyRectangle( a, b, c, d );
            super.setPoints( a, b, c, d );
        }
        catch ( IllegalArgumentException e )
        {
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
    }

    protected boolean verifyRectangle( Point a, Point b, Point c, Point d )
    {
        double x;
        if ( a.getX() == b.getX() )
            x = b.getY() == c.getY() ? -1.0 : 0.0;
        else if ( b.getX() == c.getX() )
            x = c.getY() == d.getY() ? -1.0 : 0.0;
        else
            x = a.slope( b ) * b.slope( c );

        if ( !verifyParallelogram( a, b, c, d ) ||
            Math.abs( x + 1.0 ) >= EPSILON )
            throw( new IllegalArgumentException( "Not a rectangle." ) );
        else
            return true;
    }
}
