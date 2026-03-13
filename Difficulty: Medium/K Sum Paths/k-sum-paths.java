/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    HashMap<Integer,Integer>map;
    public int func(Node root,int k,int sum){
        if(root==null)return 0;
        sum+=root.data;
        int count=map.getOrDefault(sum-k,0);
        
        map.put(sum,map.getOrDefault(sum,0)+1);
        count+=func(root.left,k,sum);
        count+=func(root.right,k,sum);
        
        map.put(sum,map.get(sum)-1);
        return count;
    }
    public int countAllPaths(Node root, int k) {
      map=new HashMap<>();
      map.put(0,1);
      return func(root,k,0);
        
    }
}