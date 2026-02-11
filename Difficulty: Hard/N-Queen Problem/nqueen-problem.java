class Solution {
    ArrayList<ArrayList<Integer>>ans;
    ArrayList<Integer>temp;
    boolean v[][];
    //check row
    public boolean check1(int r,int c,int n){
        for(int i=0;i<r;i++){
           if(v[i][c])return false;
        }
        return true;
    }
    //checking left diagonal
    public boolean check2(int r,int c,int n){
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
                if(v[i][j])return false;
        }
        return true;
    }
      //checking right diagonal
    public boolean check3(int r,int c,int n){
        for(int i=r-1,j=c+1;i>=0&&j<n;i--,j++){
                if(v[i][j])return false;
        }
        return true;
    }
    public void func(int r,int n){
        if(r==n){
            ans.add(new ArrayList<>(temp));
            return ;
        }
      for(int c=0;c<n;c++){
          if(check1(r,c,n) && check2(r,c,n) &&check3(r,c,n)){
        v[r][c]=true;
        temp.add(c+1);
      func(r+1,n);
        v[r][c]=false;
        temp.remove(temp.size()-1);
          }
      } 
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ans=new ArrayList<>();
        temp=new ArrayList<>();
        v=new boolean[n][n];
       // if(n=1)return ans.add(1);
        func(0,n);
        return ans;
    }
}