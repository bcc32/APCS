public class Rectangle extends Parallelogram
{
    @Override
    public void setPoints( Point a, Point b, Point c, Point d )
    {
        try
        {
            verifyRect( a, b, c, d );
            super.setPoints( a, b, c, d );
        }
        catch ( IllegalArgumentException e )
        {
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
    }

    protected boolean verifyRect( Point a, Point b, Point c, Point d )
    {
        if ( !verifyParallelogram( a, b, c, d ) ||
            a.slope( b ) * b.slope( c ) != -1.0 )
            throw( new IllegalArgumentException( "Not a rectangle." ) );
        else
            return true;
    }
}
