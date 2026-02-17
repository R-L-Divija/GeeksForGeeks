/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    int maxWidth(Node root) {
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        int max=-1;
        while(!q.isEmpty()){
            int s=q.size();
            max=Math.max(max,s);
            while(s-->0){
                Node t=q.poll();
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
            }
        }
        return max;
    }
}