package linkedlists;

class ListNode<T>
{
    T data;
    ListNode<T> next;

    ListNode( T object )
    {
        this( object, null );
    }

    ListNode( T object, ListNode<T> node )
    {
        data = object;
        next = node;
    }

    T getData()
    {
        return data;
    }

    ListNode<T> getNext()
    {
        return next;
    }
}

class List<T>
{
    private ListNode<T> first;
    private ListNode<T> last;
    private String name;

    public List()
    {
        this( "list" );
    }

    public List( String listName )
    {
        name = listName;
        first = last = null;
    }

    public void insertAtFront( T item )
    {
        if ( isEmpty() )
            first = last = new ListNode<T>( item );
        else
            first = new ListNode<T>( item, first );
    }

    public void insertAtBack( T item )
    {
        if ( isEmpty() )
            first = last = new ListNode<T>( item );
        else
            last = last.next = new ListNode<T>( item );
    }

    public T removeFromFront() throws EmptyListException
    {
        if ( isEmpty() )
            throw new EmptyListException( name );

        T item = first.data;

        if ( first == last )
            first = last = null;
        else
            first = first.next;

        return item;
    }

    public T removeFromBack() throws EmptyListException
    {
        if ( isEmpty() )
            throw new EmptyListException( name );

        T item = last.data;

        if ( first == last )
            first = last = null;
        else
        {
            ListNode<T> curr = first;
            while ( curr != last )
                curr = curr.next;
            last = curr;
            curr.next = null;
        }

        return item;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void print()
    {
        if ( isEmpty() )
        {
            System.out.printf( "Empty %s\n", name );
            return;
        }

        System.out.printf( "The %s is:", name );
        ListNode<T> curr = first;

        while ( curr != null )
        {
            System.out.printf( " %s", curr.data );
            curr = curr.next;
        }

        System.out.println( "\n" );
    }
}

class EmptyListException extends RuntimeException
{
    public EmptyListException()
    {
        this( "list" );
    }

    public EmptyListException( String name )
    {
        super( name + " is empty" );
    }
}
