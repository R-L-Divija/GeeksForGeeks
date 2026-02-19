class Solution {
    // Function to find the nodes that are common in both BST.
 static  ArrayList<Integer>ans1;
   //ArrayList<Integer>ans2;
 static   Map<Integer,Integer>map;
    public static void func1(Node root){
        if(root==null)return;
        func1(root.left);
       map.put(root.data,map.getOrDefault(root.data,0)+1);
       ans1.add(root.data);
        func1(root.right);
    }  
    public static  void func2(Node root){
        if(root==null)return;
        func2(root.left);
        map.put(root.data,map.getOrDefault(root.data,0)+1);
        func2(root.right);
    }
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        ans1=new ArrayList<>();
      //  ans2=new ArrayList<>();
      map=new HashMap<>();
       ArrayList<Integer> ans=new ArrayList<>();
        func1(r1);
        func2(r2);
        for(int x:ans1){
           if(map.get(x)>1)ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
}