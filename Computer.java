public enum Computer
{
    mac( "cool", "i7" ),
    lenovo( "good", "i3" ),
    dell( "very good", "i5" );

    final String desc;
    final String pro;

    Computer( String description, String processor )
    {
        desc = description;
        pro = processor;
    }

    public String getDescription()
    {
        return desc;
    }

    public String getProcessor()
    {
        return pro;
    }

    public static void main( String[] args )
    {
        for ( Computer comp : Computer.values() )
        {
            System.out.printf( "%-16s%s\n", comp.getDescription(),
                comp.getProcessor() );
        }
    }
}
