class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int c) {
        int n=val.length;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=val[i];
            a[i][1]=wt[i];
        }
    double sum=0.0;
    Arrays.sort(a,(a1,b1)->
    Double.compare(
        (double)b1[0]/b1[1],
         (double)a1[0]/a1[1]
        )
    );
    for(int i=0;i<n;i++){
        if(c>=a[i][1]){
          sum+=a[i][0];
          c-=a[i][1];
        }else{
            sum+=((double)c/a[i][1])*a[i][0];
            break;
        }
    }return sum;
    } 
}