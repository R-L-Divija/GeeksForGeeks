/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree {
  
    public static ArrayList<Integer> diagonalSum(Node root) {
       
          ArrayList<Integer>ans=new ArrayList<>();
          TreeMap<Integer,ArrayList<Integer>>map=new TreeMap<>();
          Queue<Object[]>q=new LinkedList<>();
          q.offer(new Object[]{root,0});
          while(!q.isEmpty()){
              Object[] t=q.poll();
              Node node=(Node)t[0];
              int col=(int)t[1];
              map.putIfAbsent(col,new ArrayList<>());
              map.get(col).add(node.data);
              if(node.left!=null)q.offer(new Object[]{node.left,col+1});
              if(node.right!=null)q.offer(new Object[]{node.right,col});
          }
        
        for(ArrayList<Integer> list:map.values()){
            int sum=0;
            for(int x:list){
              sum+=x;  
            }
            ans.add(sum);
        }
        return ans;
    }
}