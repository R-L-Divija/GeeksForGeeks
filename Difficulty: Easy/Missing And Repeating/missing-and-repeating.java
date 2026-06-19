class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
    ArrayList<Integer>p=new ArrayList<>();
    int n=arr.length;
    long t=(long)n*(n+1)/2;
    long tsq=(long)n*(n+1)*(2L*n+1)/6;
    
    long s=0;
    long sq=0;
    for(int i=0;i<arr.length;i++){
        s+=(long)arr[i];
        sq+=1L*arr[i]*arr[i];
    }
    
    long x=s-t;
    long y=(sq-tsq)/x;
    
    int rep=(int)(x+y)/2;
    int mis=(int)(y-x)/2;
    
    p.add(rep);
    p.add(mis);
    return p;
    
    }
}
