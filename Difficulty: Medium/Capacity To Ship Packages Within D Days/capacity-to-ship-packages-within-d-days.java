// User function Template for Java

class Solution {
    static boolean ship(int arr[],int D,int capacity){
        int load=0;
        int days=1;
        for(int x:arr){
            if(load+x>capacity){
                days++;
                load=x;
            }else{
                load+=x;
            }
        }
        return days<=D;
    }
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int l=0;
        int h=0;
        for(int x:arr){
            l=Math.max(l,x);
            h+=x;
        }
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(ship(arr,d,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
};