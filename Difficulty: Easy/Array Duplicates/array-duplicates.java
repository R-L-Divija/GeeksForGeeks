class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        ArrayList<Integer>res=new ArrayList<>();
        int freq[]=new int[arr.length+1];
        for(int x:arr){
            freq[x]++;
        }
        for(int x:arr){
            if(freq[x]>1)set.add(x);
        }
     for(int x : set){
            res.add(x);
        }
       return res;
    }
}