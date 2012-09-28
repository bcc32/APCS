// Homework 8: Time3.java
// Time3 class definition with methods tick,
// incrementMinute and incrementHour.

public class Time3
{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time3 no-argument constructor: initializes each instance variable
    // to zero; ensures that Time3 objects start in a consistent state
    public Time3()
    {
        this( 0, 0, 0 ); // invoke Time3 constructor with three arguments
    } // end Time3 no-argument constructor

    // Time3 constructor: hour supplied, minute and second defaulted to 0
    public Time3( int h )
    {
        this( h, 0, 0 ); // invoke Time3 constructor with three arguments
    } // end Time3 one-argument constructor

    // Time3 constructor: hour and minute supplied, second defaulted to 0
    public Time3( int h, int m )
    {
        this( h, m, 0 ); // invoke Time3 constructor with three arguments
    } // end Time3 two-argument constructor

    // Time3 constructor: hour, minute and second supplied
    public Time3( int h, int m, int s )
    {
        setTime( h, m, s ); // invoke setTime to validate time
    } // end Time3 three-argument constructor

    // Time3 constructor: another Time3 object supplied
    public Time3( Time3 time )
    {
        // invoke Time3 constructor with three arguments
        this( time.getHour(), time.getMinute(), time.getSecond() );
    } // end Time3 constructor with Time3 argument

    // Set Methods
    // set a new time value using universal time; perform
    // validity checks on data; set invalid values to zero
    public void setTime( int h, int m, int s )
    {
        setHour( h ); // set the hour
        setMinute( m ); // set the minute
        setSecond( s ); // set the second
    } // end method setTime

    // validate and set hour
    public void setHour( int h )
    {
        hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
    } // end method setHour

    // validate and set minute
    public void setMinute( int m )
    {
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
    } // end method setMinute

    // validate and set second
    public void setSecond( int s )
    {
        second = ( ( s >= 0 && s < 60 ) ? s : 0 );
    } // end method setSecond

    // Get Methods
    // get hour value
    public int getHour()
    {
        return hour;
    } // end method getHour

    // get minute value
    public int getMinute()
    {
        return minute;
    } // end method getMinute

    // get second value
    public int getSecond()
    {
        return second;
    } // end method getSecond

    // Tick the time by one second
    public void tick()
    {
        if ( second < 59 )
            second++;
        else
        {
            second = 0;
            incrementMinute();
        }
    }

    // Increment the minute
    public void incrementMinute()
    {
        if ( minute < 59 )
            minute++;
        else
        {
            minute = 0;
            incrementHour();
        }
    }

    // Increment the hour
    public void incrementHour()
    {
        if ( hour < 23 )
            hour++;
        else
            hour = 0;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
    } // end method toUniversalString

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString()
    {
        return String.format( "%d:%02d:%02d %s",
                ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
                getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
    } // end method toStandardString
} // end class Time3
