class  Node
{
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
public class searchbinary {
    public static Node insert(Node root,Node newnode)
    {
        if(root==null)
        {
            root=newnode;
        }
        if(root.data>newnode.data)
        {
            if(root.left==null)
                root.left=newnode;
            else
                insert(root.left,newnode);
        }
        else if(root.data<newnode.data)
        {
            if(root.right==null)
                root.right=newnode;
            else
                insert(root.right,newnode);
        }
        return root;
    }

    public static void inOrderDisplay(Node root)
    {
        if(root==null)
            return;
        inOrderDisplay(root.left);
        System.out.print(root.data+" ");
        inOrderDisplay(root.right);
    }
    public static boolean search(Node root,int data) {
        if (root == null)
            return false;
        else if(root.data==data)
            return true;
        if (root.data > data)
            return search(root.left, data);
        return search(root.right, data);
    }
    public static void main(String[] args) {

        Node Root=insert(null,new Node(17));
        insert(Root,new Node(8));
        insert(Root,new Node(56));
        insert(Root,new Node(38));
        insert(Root,new Node(45));
        insert(Root,new Node(3));
        insert(Root,new Node(18));
        insert(Root,new Node(90));
        inOrderDisplay(Root);
        System.out.println(search(Root,12));

    }
}
