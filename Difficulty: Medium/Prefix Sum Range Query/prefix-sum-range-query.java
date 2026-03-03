class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        
ArrayList<Integer> res = new ArrayList<>();
        
        int prefSum[] = new int[arr.length];
        prefSum[0] = arr[0];
        
        for(int i = 1; i < arr.length; i++) 
            prefSum[i] = arr[i] + prefSum[i-1];
        
        for(int i = 0; i < queries.length; i++) {
            
            int l = queries[i][0];
            int r = queries[i][1];
            
            int sum = 0;
            
            if(l == 0)
                sum = prefSum[r];
            else
                sum = prefSum[r] - prefSum[l-1];
                
            res.add(sum);
        }
        
        return res;
        
    }
}