public class Robot
{
    public String name;
    public int id;
    public int x, y;
    public int kills;
    public boolean alive;

    public Robot()
    {
        name = "GunPro-1";
        id = 007;
        x = 0;
        y = 0;
        kills = 0;
        alive = true;
    }

    public Robot( String name, int id, int x, int y, boolean alive )
    {
        this.name = name;
        this.id = id;
        this.x = x;
        this.y = y;
        kills = 0;
        this.alive = alive;
    }

    public void move( int x, int y )
    {
        this.x = x;
        this.y = y;
    }

    public void fight( Robot r )
    {
        if ( this.x == r.x && this.y == r.y )
        {
            r.alive = false;
            kills++;
            System.out.printf( "Robot %s has been killed by robot %s\n\n",
                r.name, this.name );
        }
        else
            throw new IllegalArgumentException( String.format(
                "Can't kill robot %s: different location", r.name ) );
    }

    public void print()
    {
        System.out.printf( "Robot name: %s\n", name );
        System.out.printf( "ID: %d\n", id );
        System.out.printf( "Location: (%d, %d)\n", x, y );
        System.out.printf( "Kills: %d\n", kills );
        System.out.printf( "Alive: %b\n", alive );
        System.out.println();
    }
}
