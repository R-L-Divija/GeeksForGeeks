class Solution {
    ArrayList<String>ans;
    StringBuilder temp;
    public void func(int r,int c,int[][] maze,boolean[][] v){
        int n=maze.length;
        int m=maze[0].length;
        //check our current cell is valid or not
        if(r<0||r>n-1||c<0||c>m-1||maze[r][c]==0||v[r][c])return;
        if(r==n-1&&c==m-1){
            ans.add(temp.toString());
            return;
        }
        v[r][c]=true;
        
        //Down
        temp.append('D');
        func(r+1,c,maze,v);
        temp.deleteCharAt(temp.length() - 1);
         //left
        temp.append('L');
        func(r,c-1,maze,v);
        temp.deleteCharAt(temp.length() - 1);
         //right
        temp.append('R');
        func(r,c+1,maze,v);
        temp.deleteCharAt(temp.length() - 1);
         //Up
        temp.append('U');
        func(r-1,c,maze,v);
        temp.deleteCharAt(temp.length() - 1);
        
        v[r][c]=false;
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        ans=new ArrayList<>();
        temp=new StringBuilder();
        int r=maze.length;
        int c=maze[0].length;
        boolean[][] v=new boolean[r][c];
     
        if(maze[0][0]==1){
        func(0,0,maze,v);
        }
        return ans;
    }
}