class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> mat) {
        // Code here
        ArrayList<ArrayList<Integer>>dp=new ArrayList<>();
       for(int i=0;i<mat.size();i++){
           dp.add(new ArrayList<>());
       }
        dp.get(0).add(mat.get(0).get(0));
        
        for(int i=1;i<mat.size();i++){
            for(int j=0;j<mat.get(i).size();j++){
                int m1=Integer.MAX_VALUE;
                 int m2=Integer.MAX_VALUE;
                 if(j-1>=0){
                 m1=mat.get(i).get(j)+dp.get(i-1).get(j-1);
                 }
                 if(j<dp.get(i-1).size()){
                m2=mat.get(i).get(j)+dp.get(i-1).get(j);
                 }
                dp.get(i).add(Math.min(m1,m2));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int x:dp.get(mat.size()-1)){
            ans=Math.min(ans,x);
        }
        return ans;
    }
}