class Solution {
    ArrayList<ArrayList<Integer>>ans;
    ArrayList<Integer>temp;
    public void func(int index,int arr[]){
        if(index==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //logic 
        
        //take
        temp.add(arr[index]);
        func(index+1,arr);
        //backtrack
        temp.remove(temp.size()-1);
        int i=index;
        while(i+1<arr.length &&arr[i]==arr[i+1]){
            i++;
        }
        //mot take
        func(i+1,arr);
        
    }
    
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        Arrays.sort(arr);
      ans=new ArrayList<>();
      temp=new ArrayList<>();
      func(0,arr);
      return ans;
        
    }
}
