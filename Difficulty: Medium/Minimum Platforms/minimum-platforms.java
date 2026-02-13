class Solution {
    public int minPlatform(int arr[], int dep[]) {
        int n=arr.length;
    //  int a[][]=new int[n][2];
    //  for(int i=0;i<n;i++){
    //     a[i][0]=arr[i];
    //     a[i][1]=dep[i];
    // }
    // Arrays.sort(a,(a1,b1)->a1[1]-b1[1]);
    // Deque<Integer>dq=new Deque<>();
    // for(int i=0;i<n;i++){
    //     if(dq.isEmpty())
    // }
    int a[]=new int[2401];
    
    Arrays.fill(a,0);
for(int i=0;i<n;i++){
    a[arr[i]]+=1;
    a[dep[i]+1]-=1;
}
    int s=0;
    int max=0;
    for(int i=0;i<a.length;i++){
       s+=a[i];
      max=Math.max(max,s); 
    }
    return max;
}
}
