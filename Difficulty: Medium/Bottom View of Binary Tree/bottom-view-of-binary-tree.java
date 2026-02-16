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
    public ArrayList<Integer> bottomView(Node root) {
       ArrayList<Integer>ans=new ArrayList<>();
       Queue<Object[]>q=new LinkedList<>();
       Map<Integer,Integer>map=new TreeMap<>();
       q.offer(new Object[]{root,0});
       while(!q.isEmpty()){
           Object arr[]=q.poll();
           Node node=(Node)arr[0];
           int col=(int)arr[1];
           map.put(col,node.data);
           if(node.left!=null) q.offer(new Object[]{node.left,col-1});
           if(node.right!=null) q.offer(new Object[]{node.right,col+1});
       }
       for(int x:map.values()){
           ans.add(x);
       }
       return ans; 
    }
}