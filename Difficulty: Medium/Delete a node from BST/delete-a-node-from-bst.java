/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {

    public Node findMin(Node root){
        while(root.left != null)
            root = root.left;
        return root;
    }

    public Node delNode(Node root, int key) {
        if(root == null) return null;

        if(key < root.data){
            root.left = delNode(root.left, key);
        }
        else if(key > root.data){
            root.right = delNode(root.right, key);
        }
        else{

            // case 1: no child
            if(root.left == null && root.right == null)
                return null;

            // case 2: one child
            else if(root.left == null)
                return root.right;

            else if(root.right == null)
                return root.left;

            // case 3: two children
            Node succ = findMin(root.right);
            root.data = succ.data;
            root.right = delNode(root.right, succ.data);
        }

        return root;
    }
}
