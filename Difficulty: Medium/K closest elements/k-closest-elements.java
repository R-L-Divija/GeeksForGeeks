class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        int n=arr.length;
    int a[][]=new int[n][2];
    for(int i=0;i<n;i++){
        a[i][0]=arr[i];
        a[i][1]=Math.abs(x-arr[i]);
    }
   Arrays.sort(a,(p,q)->{
    if(p[1]==q[1])
        return q[0]-p[0]; 
    return p[1]-q[1];
});
    ArrayList<Integer>ans=new ArrayList<>();

    for(int i=0;i<n&& ans.size()<k;i++){
        if(a[i][1]!=0){
        ans.add(a[i][0]);
        }
    }
    int b[]=new int[k];
    
    for(int i=0;i<k;i++){
        b[i]=ans.get(i);    
        
    }
        return b;
    }
}
