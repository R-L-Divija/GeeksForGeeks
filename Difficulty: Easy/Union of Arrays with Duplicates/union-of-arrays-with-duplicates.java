class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        for(int x:a)set.add(x);
        for(int x:b)set.add(x);
        ArrayList<Integer>p=new ArrayList<>();
        for(int x:set){
            p.add(x);
        }
        return p;
    }
}