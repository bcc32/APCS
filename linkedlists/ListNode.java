package linkedlists;

public class ListNode<T>
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
