class Solution {
    public ArrayList<Integer> diffArray(int[] arr, int[][] opr) {
        int n=arr.length;
        int dif[]=new int[n];
     for(int x[]:opr){
         int l=x[0];
         int r=x[1];
         int v=x[2];
         dif[l]+=v;
         if(r+1<n){
             dif[r+1]-=v;
         }
     }
     int s=0;
     for(int i=0;i<n;i++){
         s+=dif[i];
         arr[i]+=s;
     }
        ArrayList<Integer>p=new ArrayList<>();
        for(int x:arr){
            p.add(x);
        }
        return p;
    }
}
