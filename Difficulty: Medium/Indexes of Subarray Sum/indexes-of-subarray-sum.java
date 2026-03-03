
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
         int n = arr.length;
        int j=0;
        int sum =0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            sum += arr[i];
            
            while(sum > target && j < i){
                sum -= arr[j];
                j++;
            }
            
            if(sum == target){
                ans.add(j+1);
                ans.add(i+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
