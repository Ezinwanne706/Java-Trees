import java.util.Stack;

import javax.swing.tree.TreeNode;
public class BinaryTrree {
    private TrreeNode root;
    private class TrreeNode{
        private TrreeNode left;
        private TrreeNode right;
        private int data;

        public TrreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTrree() {
        TrreeNode first = new TrreeNode(10);
        TrreeNode second = new  TrreeNode(9);
        TrreeNode third = new TrreeNode(11);
        TrreeNode fourth = new TrreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        
    }

    public void preOrder(){
        if (root == null){
            return;
        }
        java.util.Stack<TrreeNode>Stack = new Stack<>();
        Stack.push(root);
        while (!Stack.isEmpty()){
            TrreeNode temp = Stack.pop();
            System.out.println(temp.data + " ");
            if (temp.right != null){
                Stack.push(temp.right);
            }
            if (temp.left != null){
                Stack.push(temp.left);
            }
            }
        }
        public void inOrder(TrreeNode root){
            if (root == null){
                return;
            }
            Stack<TrreeNode>stack = new Stack<>();
            TrreeNode temp = root;
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
    
    public static void main(String[] args) {
        BinaryTrree bt = new BinaryTrree();
        bt.createBinaryTrree();
        bt.inOrder(bt.root);
    }
        
}

// Above is an example of a binary tree (recursive inorder).

    


    

