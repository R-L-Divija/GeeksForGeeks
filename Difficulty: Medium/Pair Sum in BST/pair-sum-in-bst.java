/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    
    boolean func(Node root, int target){
        if(root == null) return false;
        
        if(set.contains(target - root.data))
            return true;
        
        set.add(root.data);
        
        return func(root.left, target) || func(root.right, target);
    }
    
    boolean findTarget(Node root, int target) {
        return func(root, target);
    }
}
