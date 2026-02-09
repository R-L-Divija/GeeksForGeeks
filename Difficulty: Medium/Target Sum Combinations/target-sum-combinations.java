class Solution {
    ArrayList<ArrayList<Integer>>ans;
    ArrayList<Integer>temp;
    public void backtrack(int index, int sum,int target,int[] a){
        if(index==a.length){
            if(sum==target){
            ans.add(new ArrayList<>(temp));}
            return;
        }if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target)return;
        
        //take 
        temp.add(a[index]);
        sum+=a[index];
        backtrack(index,sum,target,a);
        //backtrack
        sum-=a[index];
        temp.remove(temp.size()-1);
        //not take
        backtrack(index+1,sum,target,a);
    }
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        backtrack(0,0,target,arr);
        return ans;
        
    }
}