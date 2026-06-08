class Solution {
    
    boolean rev(String s,int i){
        int n=s.length();
        if(i>=n-i-1)return true;
        char t=s.charAt(i);
       if( s.charAt(i)!=s.charAt(n-i-1))return false;;
       return rev(s,i+1);
    }
    boolean isPalindrome(String s) {
        
        return rev(s,0);
    }
}