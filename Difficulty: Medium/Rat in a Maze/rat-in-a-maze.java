class Solution {
    ArrayList<String>p;
    boolean v[][];
    public void func(int r,int c,int maze[][] ,String s,boolean v[][]){
        int n=maze.length;
        int m=maze[0].length;
        if(r==n-1 &&c==m-1){
            p.add(s);
            return;
        }
        v[r][c]=true;
        if(r+1<n&&maze[r+1][c]==1 && !v[r+1][c])func(r+1,c,maze,s+'D',v);
        if(c-1>=0&&maze[r][c-1]==1 && !v[r][c-1])func(r,c-1,maze,s+'L',v);
        if(c+1<m&&maze[r][c+1]==1 && !v[r][c+1])func(r,c+1,maze,s+'R',v);
        if(r-1>=0&&maze[r-1][c]==1 && !v[r-1][c])func(r-1,c,maze,s+'U',v);
        
        v[r][c]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n=maze.length;
        int m=maze[0].length;
        v=new boolean[n][m];
        p=new ArrayList<>();
        if(maze[0][0] == 0 || maze[n-1][m-1] == 0)
        return p;
        func(0,0,maze,"",v);
        return p;
         
    }
}