import java.util.Stack;
public class BinaryTreee {
    private TreeeNode root;
    private class TreeeNode{
        private TreeeNode left;
        private TreeeNode right;
        private int data;

        public TreeeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTreee() {
        TreeeNode first = new TreeeNode(10);
        TreeeNode second = new  TreeeNode(9);
        TreeeNode third = new TreeeNode(11);
        TreeeNode fourth = new TreeeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        
    }

    public void preOrder(){
        if (root == null){
            return;
        }
        java.util.Stack<TreeeNode>Stack = new Stack<>();
        Stack.push(root);
        while (!Stack.isEmpty()){
            TreeeNode temp = Stack.pop();
            System.out.println(temp.data + " ");
            if (temp.right != null){
                Stack.push(temp.right);
            }
            if (temp.left != null){
                Stack.push(temp.left);
            }
            }
        }

    
    
    public static void main(String[] args) {
        BinaryTreee bt = new BinaryTreee();
        bt.createBinaryTreee();
        bt.preOrder();
    }
        
}

// Above is an example of a binart tree preorder
