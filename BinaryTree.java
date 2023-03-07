public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTree() {
        TreeNode first = new TreeNode(10);
        TreeNode second = new  TreeNode(9);
        TreeNode third = new TreeNode(11);
        TreeNode fourth = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        
    }

    public void  preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(bt.root);
    }
        
    }
    

