// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        int i=s1.length()-1;
        int j=s2.length()-1;
        int c=0;
        StringBuilder r=new StringBuilder();
        while(i >=0 ||j>=0||c!=0){
            int s=c;
            if(i>=0){
                s+=s1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                s+=s2.charAt(j)-'0';
                j--;
            }
            r.append(s%2);
            c=s/2;
        }
        String ans=r.reverse().toString();
    int k=0;
    while(k<ans.length()-1 &&ans.charAt(k)=='0'){
        
        k++;
    }
      return ans.substring(k); 
    }
}