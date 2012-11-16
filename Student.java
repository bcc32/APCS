public class Student extends Person
{
    protected int gradYear;
    protected double GPA;

    public Student()
    {
        gradYear = 2000;
        GPA = 4.0;
    }

    public Student( String first, String last, int grad, double gpa )
    {
        super( first, last );
        gradYear = grad;
        GPA = gpa;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.printf( "Graduation year: %d\n", gradYear );
        System.out.printf( "GPA: %s\n", GPA );
    }
}
