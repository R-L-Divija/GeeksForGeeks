class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
         int i = 0, j = 0;
        HashSet<Integer> set = new LinkedHashSet<>();
        // ArrayList<Integer> list = new ArrayList<>();
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                set.add(a[i]);
                i++;
            }
            else{
                set.add(b[j]);
                j++;
            }
        }
        if(i < a.length){
            while(i < a.length){
                set.add(a[i]);
                i++;
            }
        }
        else{
            while(j < b.length){
                set.add(b[j]);
                j++;
            }
        }
        return new ArrayList<Integer>(set);
        
    }
}
