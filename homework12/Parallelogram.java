public class Parallelogram extends Quadrilateral
{
    public Parallelogram()
    {
        super();
    }

    public Parallelogram( Point a, Point b, Point c, Point d )
    {
        super( a, b, c, d );
    }

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
        if ( a.dist( b ) != c.dist( d ) || b.dist( c ) != d.dist( a ) )
            throw( new IllegalArgumentException( "Not a parallelogram." ) );
        else
            return true;
    }

    public double height()
    {
        return Point.lineDist( a, b, c, d );
    }

    public double width()
    {
        return a.dist( b );
    }

    public double area()
    {
        return height() * width();
    }
}
