class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num < target){
                list.add(num);
            }
        }
        return list;
    }
}