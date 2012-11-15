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
        System.out.printf( "Area is: %s\n", t.area() );
        System.out.println();

        Parallelogram p = new Parallelogram(
            new Point( 5.0, 5.0 ), new Point( 11.0, 5.0 ),
            new Point( 12.0, 20.0 ), new Point( 6.0, 20.0 ) );
        System.out.println( "Coordinates of Parallelogram are:" );
        System.out.println( p );
        System.out.printf( "Width is: %s\n", p.width() );
        System.out.printf( "Height is: %s\n", p.height() );
        System.out.printf( "Area is: %s\n", p.area() );
        System.out.println();

        Rectangle r = new Rectangle(
            new Point( 17.0, 14.0 ), new Point( 30.0, 14.0 ),
            new Point( 30.0, 28.0 ), new Point( 17.0, 28.0 ) );
        System.out.println( "Coordinates of Rectangle are:" );
        System.out.println( r );
        System.out.printf( "Width is: %s\n", r.width() );
        System.out.printf( "Height is: %s\n", r.height() );
        System.out.printf( "Area is: %s\n", r.area() );
        System.out.println();

        Square s = new Square(
            new Point( 4.0, 0.0 ), new Point( 8.0, 0.0 ),
            new Point( 8.0, 4.0 ), new Point( 4.0, 4.0 ) );
        System.out.println( "Coordinates of Square are:" );
        System.out.println( s );
        System.out.printf( "Side is: %s\n", s.side() );
        System.out.printf( "Area is: %s\n", s.area() );
        System.out.println();
    }
}
