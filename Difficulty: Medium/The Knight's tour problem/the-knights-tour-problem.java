class Solution {
    ArrayList<ArrayList<Integer>> ans;
    ArrayList<Integer> temp;
    boolean v[][];
    
    int dir[][] = {
        {-1,-2},{1,-2},{-1,2},{1,2},
        {2,1},{2,-1},{-2,1},{-2,-1}
    };
    
    public boolean func(int r, int c, int index, int n) {
        
        if(r < 0 || r >= n || c < 0 || c >= n || v[r][c])
            return false;
        
        v[r][c] = true;
        temp.add(r * n + c);   // store cell number
        
        if(index == n*n - 1) {
            ans.add(new ArrayList<>(temp));
            return true;
        }
        
        for(int i = 0; i < 8; i++) {
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];
            
            if(func(nr, nc, index + 1, n))
                return true;
        }
        
        v[r][c] = false;
        temp.remove(temp.size() - 1);
        
        return false;
    }
    
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        v = new boolean[n][n];
        
        func(0, 0, 0, n);
        return ans;
    }
}
