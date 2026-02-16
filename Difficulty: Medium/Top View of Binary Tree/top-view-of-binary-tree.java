/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> topView(Node root) {
         ArrayList<Integer>ans=new ArrayList<>();
       if(root==null)return ans;
       Map<Integer,Integer>map=new TreeMap<>();
       Queue<Object[]>q=new LinkedList<>();
       q.offer(new Object[]{root,0});
       while(!q.isEmpty()){
        int s=q.size();
       
        while(s-->0){
            Object[] arr=q.poll();
            Node node=(Node)arr[0];
            int col=(int)arr[1];
                map.putIfAbsent(col,node.data);
            if(node.left!=null)q.offer(new Object[]{node.left,col-1});
            if(node.right!=null)q.offer(new Object[]{node.right,col+1});
           
        }
        
       }
      
       for(int x:map.values()){
           ans.add(x);
           
       }
      return ans;  
    }
}