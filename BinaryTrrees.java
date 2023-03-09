import java.util.Stack;

import javax.swing.tree.TreeNode;
public class BinaryTrrees {
    private TrreesNode root;
    private class TrreesNode{
        private TrreesNode left;
        private TrreesNode right;
        private int data;

        public TrreesNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTrree() {
        TrreesNode first = new TrreesNode(9);
        TrreesNode second = new  TrreesNode(2);
        TrreesNode third = new TrreesNode(4);
        TrreesNode fourth = new TrreesNode(3);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        
    }

    public void preOrder(){
        if (root == null){
            return;
        }
        java.util.Stack<TrreesNode>Stack = new Stack<>();
        Stack.push(root);
        while (!Stack.isEmpty()){
            TrreesNode temp = Stack.pop();
            System.out.println(temp.data + " ");
            if (temp.right != null){
                Stack.push(temp.right);
            }
            if (temp.left != null){
                Stack.push(temp.left);
            }
            }
        }
        public void inOrder(TrreesNode root){
            if (root == null){
                return;
            }
            Stack<TrreesNode>stack = new Stack<>();
            TrreesNode temp = root;
            while(!stack.isEmpty()|| temp != null){
                if (temp != null){
                    stack.push(temp);
                    temp = temp.left;
                }else{
                    temp = stack.pop();
                    System.out.println(temp.data + " ");
                    temp = temp.right;
                }
            }

        }

        public void postOrder(TrreesNode root){
            if (root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    
    public static void main(String[] args) {
        BinaryTrrees bt = new BinaryTrrees();
        bt.createBinaryTrree();
        bt.postOrder(bt.root);
    }
}

// Above is an example of a binary tree (iterative inorder).

    


    

