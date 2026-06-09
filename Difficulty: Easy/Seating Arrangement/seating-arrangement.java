class Solution {
    public boolean canSeatAllPeople(int k, int[] s) {
        int p=0;
        int c=0;
        int n=s.length;
        
        for(int i=0;i<n;i++){
            if(s[i]==0){
                int l= (i==0)?0:s[i-1];
                int r=(i==n-1)?0:s[i+1];
                if(l==0 && r==0){
                    s[i]=1;
                    c++;}
            }
           
        }
        
        return c>=k;
        
    }
}