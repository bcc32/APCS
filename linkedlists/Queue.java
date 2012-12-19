package linkedlists;

public class Queue<T extends Comparable<? super T>> extends List<T>
{
    public void push( T item )
    {
        insertAtBack( item );
    }

    public T pop()
    {
        return removeFromFront();
    }
}
