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
        return find( item, root ) != null;
    }

    public boolean contains( T item, TreeNode<T> node )
    {
        return find( item, node ) != null;
    }

    public void delete( T item )
    {
        remove( find( item, root ) );
    }

    public void delete( T item, TreeNode<T> node )
    {
        remove( find( item, node ) );
    }

    public TreeNode<T> find( T item )
    {
        return find( item, root );
    }

    public TreeNode<T> find( T item, TreeNode<T> node )
    {
        if ( node == null )
            return null;
        else if ( node.data.equals( item ) )
            return node;
        else if ( item.compareTo( node.data ) < 0 )
            return find( item, node.left );
        else // item.compareTo( node.data ) > 0
            return find( item, node.right );
    }

    public TreeNode<T> findMax()
    {
        return findMax( root );
    }

    public TreeNode<T> findMax( TreeNode<T> node )
    {
        if ( node == null )
            return null;
        while ( node.right != null )
            node = node.right;
        return node;
    }

    public TreeNode<T> findMin()
    {
        return findMin( root );
    }

    public TreeNode<T> findMin( TreeNode<T> node )
    {
        if ( node == null )
            return null;
        while ( node.left != null )
            node = node.left;
        return node;
    }

    public void insert( T item )
    {
        insertNode( new TreeNode<T>( item, null, null, null ), root );
    }

    public void insert( T item, TreeNode<T> node )
    {
        insertNode( new TreeNode<T>( item, null, null, null ), node );
    }

    public void insertNode( TreeNode<T> insert )
    {
        insertNode( insert, root );
    }

    public void insertNode( TreeNode<T> insert, TreeNode<T> node )
    {
        if ( isEmpty() )
            root = insert;
        else if ( node == null )
            return;
        else if ( insert.data.equals( node.data ) )
            return;
        else if ( insert.data.compareTo( node.data ) < 0 )
            if ( node.left == null )
            {
                insert.up = node;
                node.left = insert;
            }
            else
                insertNode( insert, node.left );
        else // insert.data.compareTo( node.data ) > 0
            if ( node.right == null )
            {
                insert.up = node;
                node.right = insert;
            }
            else
                insertNode( insert, node.right );
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public T max()
    {
        return findMin().data;
    }

    public T min()
    {
        return findMax().data;
    }

    public void print()
    {
        traversePreOrder( root );
    }

    public void print( TreeNode<T> node )
    {
        traversePreOrder( node );
    }

    public void remove( TreeNode<T> node )
    {
        if ( node == null )
            return;
        else if ( node == node.up.left )
            // TODO re-insert child nodes
            node.up.left = null;
        else
            node.up.right = null;
    }

    public void traverseInOrder()
    {
        traverseInOrder( root );
    }

    public void traverseInOrder( TreeNode<T> node )
    {
        if ( node == null )
            return;
        traverseInOrder( node.left );
        visit( node );
        traverseInOrder( node.right );
    }

    public void traversePreOrder()
    {
        traversePreOrder( root );
    }

    public void traversePreOrder( TreeNode<T> node )
    {
        if ( node == null )
            return;
        visit( node );
        traversePreOrder( node.left );
        traversePreOrder( node.right );
    }

    public void traversePostOrder()
    {
        traversePostOrder( root );
    }

    public void traversePostOrder( TreeNode<T> node )
    {
        if ( node == null )
            return;
        traversePostOrder( node.left );
        traversePostOrder( node.right );
        visit( node );
    }

    public void visit( TreeNode<T> node )
    {
        System.out.println( node.data );
    }
}
