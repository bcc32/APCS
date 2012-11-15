public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square( Point a, Point b, Point c, Point d)
    {
        super( a, b, c, d );
    }

    @Override
    public void setPoints( Point a, Point b, Point c, Point d )
    {
        try
        {
            verifySquare( a, b, c, d );
            super.setPoints( a, b, c, d );
        }
        catch ( IllegalArgumentException e )
        {
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
    }

    protected boolean verifySquare( Point a, Point b, Point c, Point d )
    {
        if ( !verifyRectangle( a, b, c, d ) ||
            a.dist( b ) != b.dist( c ) )
            throw( new IllegalArgumentException( "Not a square." ) );
        else
            return true;
    }

    public double side()
    {
        return a.dist( b );
    }

    @Override
    public double area()
    {
        return Math.pow( side(), 2.0 );
    }
}
