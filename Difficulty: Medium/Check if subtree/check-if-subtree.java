/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    
    public static boolean check(Node a,Node b){
        if(a==null&&b==null)return true;
        if(a==null||b==null)return false;
        
        if(a.data!=b.data)return false;
        return check(a.left,b.left)&&check(a.right,b.right);
    }
    public static boolean isSubtree(Node T, Node S) {
        if(S==null)return true;
        if(T==null)return false;
      Queue<Node>q=new LinkedList<>();
      q.offer(T);
    
      while(!q.isEmpty() ){
          Node t=q.poll();
       
          if(t.data==S.data){
              if(check(t,S))return true;
          }
           if(t.left!=null)q.offer(t.left);
              if(t.right!=null)q.offer(t.right);
      }
    return false;
    }
}