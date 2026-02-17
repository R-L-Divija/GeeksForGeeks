/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/
class Solution {
    public int verticalWidth(Node root) {
        if(root==null)return 0;
       Queue<Object[]>q=new LinkedList<>();
       Map<Integer,Integer>map=new TreeMap<>();
       q.offer(new Object[]{root,0});
       while(!q.isEmpty()){
           Object[] arr=q.poll();
           Node t=(Node)arr[0];
           int col=(int)arr[1];
           
           map.put(col,t.data);
           if(t.left!=null)q.offer(new Object[]{t.left,col-1});
            if(t.right!=null)q.offer(new Object[]{t.right,col+1});
       }
       int c=0;
       for(int x:map.values()){
          c++; 
       }
       return c;
    }
}