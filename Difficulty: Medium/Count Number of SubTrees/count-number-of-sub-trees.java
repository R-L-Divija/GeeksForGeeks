/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class Solution {
    int c;
    public int func(Node root,int x){
       if(root==null)return 0;
     int left=func(root.left,x);
     int right=func(root.right,x);
     
     int sum=root.data+left+right;
     
     if(sum==x)c++;
     return sum;
    }
    int countSubtrees(Node root, int x) {
        c=0;
      func(root,x);
      return c;
    }
}