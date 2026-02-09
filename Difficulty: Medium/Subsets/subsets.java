class Solution {
    ArrayList<ArrayList<Integer>>ans;
    ArrayList<Integer>temp;
    public void func(int index,int[] arr){
        if(index==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //take
        temp.add(arr[index]);
        func(index+1,arr);
        //backtrack
        temp.remove(temp.size()-1);
        //not take
        func(index+1,arr);
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
     ans=new ArrayList<>();
     temp=new ArrayList<>();
     func(0,arr);
     return ans;
        
    }
}