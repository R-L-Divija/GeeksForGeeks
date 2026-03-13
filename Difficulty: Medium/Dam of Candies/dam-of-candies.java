// User function Template for Java

class Solution {
    static int maxCandy(int height[], int n) 
    { 
        int start=0;
        int end=n-1;
        int ans=0;
        while(start<end){
            ans =Math.max(ans,((end-start)-1)*Math.min(height[start],height[end]));
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}