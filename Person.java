public class Person
{
    protected String firstName, lastName;

    public Person()
    {
        firstName = "John";
        lastName = "Smith";
    }

    public Person( String first, String last )
    {
        firstName = first;
        lastName = last;
    }

    public void print()
    {
        System.out.printf( "%s %s\n", firstName, lastName );
    }
}
