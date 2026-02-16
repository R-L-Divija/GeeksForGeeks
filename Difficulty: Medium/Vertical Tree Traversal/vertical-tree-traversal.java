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
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
    Map<Integer,ArrayList<Integer>>map=new TreeMap<>();
    Queue<Object[]>q=new LinkedList<>();
    q.offer(new Object[]{root,0});
    while(!q.isEmpty()){
        Object[] arr=q.poll();
        
        Node node=(Node)arr[0];
        int col=(int)arr[1];
        
        map.putIfAbsent(col,new ArrayList<>());
        map.get(col).add(node.data);
        if(node.left!=null)q.offer(new Object[]{node.left,col-1});
        if(node.right!=null)q.offer(new Object[]{node.right,col+1});
        
    }
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
      for(ArrayList<Integer>x:map.values()){
          ans.add(x);
      }  
      return ans;
    }
}