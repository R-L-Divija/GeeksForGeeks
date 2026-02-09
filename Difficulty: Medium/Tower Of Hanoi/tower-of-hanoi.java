class Solution {
    public int towerOfHanoi(int n, int src, int dest, int aux) {
    
      if(n==0){
          return 0;
      }
    int m1=towerOfHanoi(n-1,src,aux,dest);
    int m2=1;
    int m3= towerOfHanoi(n-1,dest,src,aux);
   
    return m1+m2+m3;
     
    }
}
