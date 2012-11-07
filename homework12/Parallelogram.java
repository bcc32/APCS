public class Parallelogram extends Quadrilateral
{
    @Override
    public void setPoints( Point a, Point b, Point c, Point d )
    {
        try
        {
            verifyParallelogram( a, b, c, d );
            super.setPoints( a, b, c, d );
        }
        catch ( IllegalArgumentException e )
        {
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
    }

    protected boolean verifyParallelogram( Point a, Point b, Point c, Point d )
    {
        if ( a.slope( b ) != c.slope( d ) || b.slope( c ) != d.slope( a ) )
            throw( new IllegalArgumentException( "Not a parallelogram." ) );
        else
            return true;
    }
}
