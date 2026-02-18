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
}*/

class Solution {
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
    Queue<Node>q=new LinkedList<>();
    ArrayList<Integer>temp;
    q.offer(root);
    while(!q.isEmpty()){
            Node t=q.poll();
           if(t==null)ans.add(null);
           else{
             ans.add(t.data) ; 
            q.offer(t.left);
            q.offer(t.right);  
           }
        }
        return ans;
    }

    public Node deSerialize(ArrayList<Integer> arr) {
        if(arr==null||arr.get(0)==null||arr.size()==0)return null;
        Queue<Node>q=new LinkedList<>();
        Node root=new Node(arr.get(0));
        q.offer(root);
        int i=1;
        while(!q.isEmpty() &&i<arr.size()){
            Node t=q.poll();
            if(i<arr.size()&&arr.get(i)!=null){
                t.left=new Node(arr.get(i));
                q.offer(t.left);
            }i++;
             if(i<arr.size()&&arr.get(i)!=null){
                t.right=new Node(arr.get(i));
                q.offer(t.right);
            }i++;
        }
        return root;
    }
};