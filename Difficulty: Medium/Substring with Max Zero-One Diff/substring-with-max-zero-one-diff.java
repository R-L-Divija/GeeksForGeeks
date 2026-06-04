class Solution {
    int maxSubstring(String s) {
        int sum=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')sum++;
            else sum--;
            max=Math.max(max,sum);
            if(sum<0)sum=0;
        }
        
        if(max==0)return -1;
        return max;
    }
}