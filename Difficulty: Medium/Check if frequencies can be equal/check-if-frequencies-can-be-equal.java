class Solution {
    boolean sameFreq(String s) {
        int freq[]=new int[26];
        for(char x:s.toCharArray()){
            freq[x-'a']++;
        }
       Arrays.sort(freq);
       int i=0;
       while(i<26&&freq[i]==0){
           i++;
       }
       if(i==25)return true;
       
       int f=freq[i];
       int l=freq[25];
       
       if(f==l)return true;
       if(f==1 && freq[i+1]==l)return true;
        if (l - f == 1 && freq[24] == f) return true;
        return false;
    }
}