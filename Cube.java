public class Cube extends ThreeDimensionalShape
{
    public Cube( int x, int y, double side )
    {
        super( x, y, side, side, side );
    }

    public double getSide()
    {
        return getD1();
    }

    public void setSide( double side )
    {
        setDim( side, side, side );
    }

    public double surfaceArea()
    {
        double side = getSide();
        return 6.0 * side * side;
    }

    public double volume()
    {
        double side = getSide();
        return side * side * side;
    }
}
