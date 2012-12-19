public class Tree<T extends Comparable<? super T>>
{
    public TreeNode<T> root;

    public Tree()
    {
        root = null;
    }

    public Tree( TreeNode<T> root )
    {
        this.root = root;
    }

    public boolean contains( T item )
    {
        return contains( item, root );
    }

    public boolean contains( T item, TreeNode<T> node )
    {
        if ( node == null )
            return false;
        else if ( node.data.equals( item ) )
            return true;
        else if ( item.compareTo( node.data ) < 0 )
            return contains( item, node.left );
        else // item.compareTo( node.data ) > 0
            return contains( item, node.right );
    }

    public void insert( T item )
    {
        insert( item, root );
    }

    public void insert( T item, TreeNode<T> node )
    {
        if ( isEmpty() )
            root = new TreeNode<T>( item, null, null, null );
        else if ( node == null )
            throw new NullPointerException( "null node" );
        else if ( item.equals( node.data ) )
            return;
        else if ( item.compareTo( node.data ) < 0 )
            if ( node.left == null )
            {
                TreeNode<T> insert = new TreeNode<T>( item, null, null, node );
                node.left = insert;
            }
            else
                insert( item, node.left );
        else // item.compareTo( node.data ) > 0
            if ( node.right == null )
            {
                TreeNode<T> insert = new TreeNode<T>( item, null, null, node );
                node.right = insert;
            }
            else
                insert( item, node.right );
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void print()
    {
        print( root );
    }

    public void print( TreeNode<T> node )
    {
        if ( node == null )
            return;
        System.out.println( node.data );
        print( node.left );
        print( node.right );
    }
}
