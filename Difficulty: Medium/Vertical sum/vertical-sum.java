/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}
*/
class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)return ans;
        Map<Integer,ArrayList<Integer>>map=new TreeMap<>();
        Queue<Object[]>q=new LinkedList<>();
        q.offer(new Object[]{root,0});
        while(!q.isEmpty()){
            Object[]arr= q.poll();
            Node node=(Node)arr[0];
            int col=(int)arr[1];
            map.putIfAbsent(col,new ArrayList<>());
            map.get(col).add(node.data);
            if(node.left!=null)q.offer(new Object[]{node.left,col-1});
            if(node.right!=null)q.offer(new Object[]{node.right,col+1});
        }
       
        
        for(ArrayList<Integer>list:map.values()){
             int sum=0;
            for(int x:list){
                sum+=x;
            }
            ans.add(sum);
        }
        return ans;
    }
}