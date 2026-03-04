/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int l = q.size();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<l;i++){
                Node x = q.poll();
                a.add(x.data);
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            }
            ans.add(a);
        }
        return ans;
        
    }
}