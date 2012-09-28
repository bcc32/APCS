import java.util.Scanner;

public class RectangleTest
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in );
        Rectangle rect = new Rectangle();
        int choice = getMenuChoice();
        while ( choice != 3 )
        {
            switch ( choice )
            {
                case 1: // set hour
                    System.out.print( "Enter length: " );
                    double length = input.nextDouble();
                    rect.setLength( length );
                    break;
                case 2: // set minute
                    System.out.print( "Enter width: " );
                    double width = input.nextDouble();
                    rect.setWidth( width );
                    break;
                }
                System.out.printf( "Length: %.2f\n", rect.getLength() );
                System.out.printf( "Width: %.2f\n", rect.getWidth() );
                System.out.printf( "Perimeter: %.2f\n", rect.perimeter() );
                System.out.printf( "Area: %.2f\n", rect.area() );
            choice = getMenuChoice();
        }
    }

    private static int getMenuChoice()
    {
        Scanner input = new Scanner( System.in );
        System.out.println( "1. Set Length" );
        System.out.println( "2. Set Width" );
        System.out.println( "3. Exit" );
        System.out.print( "Choice: " );
        return input.nextInt();
    }
}
