public class Test
{
    public static void main( String[] args )
    {
        Quadrilateral q = new Quadrilateral(
            new Point( 1.1, 1.2 ), new Point( 6.6, 2.8 ),
            new Point( 6.2, 9.9 ), new Point( 2.2, 7.4 ) );
        System.out.println( "Coordinates of Quadrilateral are:" );
        System.out.println( q );
        System.out.println();

        Trapezoid t = new Trapezoid(
            new Point( 0.0, 0.0 ), new Point( 10.0, 0.0 ),
            new Point( 8.0, 5.0 ), new Point( 3.3, 5.0 ) );
        System.out.println( "Coordinates of Trapezoid are:" );
        System.out.println( t );
        System.out.printf( "Height is: %s\n", t.height() );
    }
}
