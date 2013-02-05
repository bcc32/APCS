public class Heap<T extends Comparable<? super T>> extends Tree<T>
{
    @Override
    public void insertNode( TreeNode<T> insert, TreeNode<T> node )
    {
        if ( isEmpty() )
            root = insert;
        else if ( node == null )
            throw new NullPointerException( "null node" );
        else if ( node.right != null )
            insertNode( insert, node.right );
        else if ( node.left == null )
        {
            insert.up = node;
            node.left = insert;
            upHeapify( node.left );
        }
        else
        {
            insert.up = node;
            node.right = insert;
            upHeapify( node.right );
        }
    }

    @Override
    public TreeNode<T> findMin()
    {
        return root;
    }

    @Override
    public TreeNode<T> findMin( TreeNode<T> node )
    {
        return node;
    }

    public TreeNode<T> removeMin()
    {
        if ( isEmpty() )
            throw new NullPointerException( "null node" );
        TreeNode<T> min = root;
        TreeNode<T> last = root;
        while ( last.right != null )
            last = last.right;
        if ( last.left != null )
            last = last.left;
        if ( last.up != null )
            if ( last == last.up.left )
                last.up.left = null;
            else
                last.up.right = null;
        root.data = last.data;
        downHeapify( root );
        return min;
    }

    private void downHeapify()
    {
        downHeapify( root );
    }

    private void downHeapify( TreeNode<T> node )
    {
        if ( node.left == null )
            return;
        else if ( node.right == null )
            if ( node.left.data.compareTo( node.data ) < 0 )
            {
                swap( node.left, node );
                downHeapify( node.left );
            }
            else
                return;
        else if ( node.left.data.compareTo( node.right.data ) <= 0 )
        {
            swap( node, node.left );
            downHeapify( node.left );
        }
        else
        {
            swap( node, node.right );
            downHeapify( node.right );
        }
    }

    private void swap( TreeNode<T> a, TreeNode<T> b )
    {
        T temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    private void upHeapify( TreeNode<T> node )
    {
        if ( node.up == null )
            return;
        else if ( node.data.compareTo( node.up.data ) < 0 )
        {
            swap( node, node.up );
            upHeapify( node.up );
        }
        else
            return;
    }
}
