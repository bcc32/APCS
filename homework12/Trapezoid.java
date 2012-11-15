public class Trapezoid extends Quadrilateral
{
    public Trapezoid()
    {
        super();
    }

    public Trapezoid( Point a, Point b, Point c, Point d )
    {
        super( a, b, c, d );
    }

    @Override
    public void setPoints( Point a, Point b, Point c, Point d )
    {
        try
        {
            verifyTrap( a, b, c, d );
            super.setPoints( a, b, c, d );
        }
        catch ( IllegalArgumentException e )
        {
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
    }

    protected boolean verifyTrap( Point a, Point b, Point c, Point d )
    {
        if ( !( Math.abs( a.slope( b ) - c.slope( d ) ) < EPSILON
            ^ Math.abs( b.slope( c ) - d.slope( a ) ) < EPSILON ) )
        {
            throw( new IllegalArgumentException( "Not a trapezoid." ) );
        }
        else
            return true;
    }

    public double height()
    {
        if ( Math.abs( a.slope( b ) - c.slope( d ) ) < EPSILON )
        {
            return Math.sqrt( Math.pow( a.getY() - a.getX() * a.slope( b )
                - c.getY() - c.getX() * c.slope( d ), 2.0 )
                / ( 1 + a.slope( b ) ) );
        }
        else
        {
            return Math.sqrt( Math.pow( b.getY() - b.getX() * b.slope( c )
                - d.getY() - d.getX() * d.slope( a ), 2.0 )
                / ( 1 + b.slope( c ) ) );
        }
    }
}
