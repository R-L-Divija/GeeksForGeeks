
class Solution {
    public static int overlapInt(int[][] arr) {
        int n=-1;
        for(int x[]:arr){
            n=Math.max(n,x[1]);
        }
        int diff[]=new int[n];
        for(int x[]:arr){
            int l=x[0];
            int r=x[1];
            diff[l]+=1;
            if(r+1<n){
                diff[r+1]-=1;
            }
        }
        int s=0;
        int c=-1;
        for(int x:diff){
           s+=x; 
           c=Math.max(c,s);
        }
        return c;
    }
}
