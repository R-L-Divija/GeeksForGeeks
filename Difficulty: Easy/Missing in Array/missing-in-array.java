class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        
        long s1=(long)n*(n+1)/2;
        long s2=0;
        for(int x:arr){
            s2+=x;
        }
        return (int)(s1-s2);
    }
}