// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    HashMap<Node,Node>map;
    void func(Node root,Node p){
        if(root==null)return;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        map.put(root,p);
        while(!q.isEmpty()){
            Node t=q.poll();
            if(t.left!=null){
                map.put(t.left,t);
                q.offer(t.left);
            }
             if(t.right!=null){
                map.put(t.right,t);
                q.offer(t.right);
            }
        }
    }
    Node func2(Node root,int n){
        if(root==null)return null;
        if(root.data==n)return root;
        Node l= func2(root.left,n);
        if(l!=null)return l;
        return func2(root.right,n);
         
    }
    int findDist(Node root, int a, int b) {
        // Your code here
       HashSet<Node>set=new HashSet<>();
       map=new HashMap<>();
       func(root,null);
       
       Queue<Node>q=new LinkedList<>();
       
       Node s=func2(root,a);
       Node e=func2(root,b);
       q.offer(s);
       set.add(s);
       int c=-1;
       while(!q.isEmpty()){
          int sise=q.size();
          c++;
          while(sise-->0){
              Node t=q.poll();
              if(t==e)return c;
              if(t.left!=null && !set.contains(t.left)){
                  set.add(t.left);
                  q.add(t.left);
              } if(t.left!=null && !set.contains(t.left)){
                  set.add(t.left);
                  q.add(t.left);
              }
              
              
               if(t.right!=null && !set.contains(t.right)){
                  set.add(t.right);
                  q.add(t.right);
              }
              if(map.get(t)!=null&&!set.contains(map.get(t))){
                  set.add(map.get(t));
                  q.add(map.get(t));
              }
          }
        
       }
       return c;
    }
}