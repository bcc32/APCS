public class Professor extends Person
{
    protected String department;

    public Professor()
    {
        department = "Computer Science";
    }

    public Professor( String first, String last, String dept )
    {
        super( first, last );
        department = dept;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.printf( "Department: %s\n", department );
    }
}
