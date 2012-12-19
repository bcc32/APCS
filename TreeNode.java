public class TreeNode<T extends Comparable<? super T>>
{
    public T data;
    public TreeNode<T> left, right, up;

    public TreeNode( T data )
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.up = null;
    }

    public TreeNode( T data, TreeNode<T> left, TreeNode<T> right,
            TreeNode<T> up )
    {
        this.data = data;
        this.left = left;
        this.right = right;
        this.up = up;
    }
}
