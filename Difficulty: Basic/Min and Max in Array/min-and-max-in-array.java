class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer>ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
