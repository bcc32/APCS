public class RobotTest
{
    public static void main( String[] args )
    {
        Robot a = new Robot( "GunPro-1", 1, 0, 0, true );
        Robot b = new Robot( "GunPro-2", 2, 5, 4, true );

        a.move( 5, 4 );
        a.fight( b );
        a.print();
        b.print();
    }
}
