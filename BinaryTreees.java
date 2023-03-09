import java.util.Stack;
public class BinaryTreees {
     private TreeesNode root;
    private class TreeesNode{
        private TreeesNode left;
        private TreeesNode right;
        private int data;

        public TreeesNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTreee() {
        TreeesNode first = new TreeesNode(10);
        TreeesNode second = new  TreeesNode(9);
        TreeesNode third = new TreeesNode(11);
        TreeesNode fourth = new TreeesNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        
    }

    public void preOrder(){
        if (root == null){
            return;
        }
        java.util.Stack<TreeesNode>Stack = new Stack<>();
        Stack.push(root);
        while (!Stack.isEmpty()){
            TreeesNode temp = Stack.pop();
            System.out.println(temp.data + " ");
            if (temp.right != null){
                Stack.push(temp.right);
            }
            if (temp.left != null){
                Stack.push(temp.left);
            }
            }
        }
        public void inOrder(TreeesNode root){
            if (root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    
    
    public static void main(String[] args) {
        BinaryTreees bt = new BinaryTreees();
        bt.createBinaryTreee();
        bt.inOrder(bt.root);
    }
        
}

// Above is an example of a binary tree (recursive inorder).

    

