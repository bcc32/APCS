package linkedlists;

public class Stack<T extends Comparable<? super T>> extends List<T>
{
    public void push( T item )
    {
        insertAtBack( item );
    }

    public T pop()
    {
        return removeFromBack();
    }

    public T top()
    {
        return back();
    }
}
