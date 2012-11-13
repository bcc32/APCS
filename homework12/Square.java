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
        if ( !verifyParallelogram( a, b, c, d ) ||
            a.dist( b ) * b.dist( c ) != -1.0 )
            throw( new IllegalArgumentException( "Not a square." ) );
        else
            return true;
    }
}
