class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int max=arr[arr.length-1];
        ArrayList<Integer>p=new ArrayList<>();
        p.add(max);
        for(int i=arr.length-2;i>=0;i-- ){
            if(max<=arr[i]){
                p.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(p);
        return p;
    }
}
