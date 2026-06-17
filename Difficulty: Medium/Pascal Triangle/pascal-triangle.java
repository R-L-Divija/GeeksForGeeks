class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
       ArrayList<Integer>p=new ArrayList<>();
       ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       for(int i=0;i<n;i++){
           p=new ArrayList<>();
           for(int j=0;j<=i;j++){
               if(j==0 || i==j)p.add(1);
               else{
                   int v=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                   p.add(v);
               }
           }
           ans.add(p);
       }
       return p;
        
    }
}