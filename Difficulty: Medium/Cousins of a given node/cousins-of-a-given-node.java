// User function Template for Java

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
} */

class Solution {
    public static ArrayList<Integer> printCousins(Node root, Node tar) {
    ArrayList<Integer>ans=new ArrayList<>();
    Queue<Node>q=new LinkedList<>();
    q.offer(root);
    if(tar.data==root.data ||root==null){
        ans.add(-1);
        return ans;
    }
    boolean f=false;
    while(!q.isEmpty()){
        int s=q.size();
      
        while(s-->0){
        Node t=q.poll();
        if(t.left==tar||t.right==tar){
            f=true;
        }else{
        if(t.left!=null)q.offer(t.left);
        if(t.right!=null)q.offer(t.right);
        }
        }
        if(f){
         break;
        }
    }
    if(q.isEmpty()){
        ans.add(-1);
        return ans;
    }
    while(!q.isEmpty()){
        Node t=q.poll();
        ans.add(t.data);
    }
     return ans;   
    }
}