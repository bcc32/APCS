package linkedlists;

public class ListMethods
{
    public static <T> List<T> copy( List<T> list )
    {
        List<T> foo = new List<T>();
        ListNode<T> node = list.first;
        while ( node != null )
        {
            node = node.next;
            foo.insertAtBack( node.data );
        }
        return foo;
    }

    public static <T> List<T> reverseCopy( List<T> list )
    {
        List<T> foo = new List<T>();
        ListNode<T> node = list.first;
        while ( node != null )
        {
            node = node.next;
            foo.insertAtFront( node.data );
        }
        return foo;
    }
}
