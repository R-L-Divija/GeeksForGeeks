class Solution {
    public static String countSort(String s) {
        // code here
                int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count[ch-'a']+=1;
        }
        for(int i=1;i<26;i++){
            count[i]+=count[i-1];
        }
        char str[]=new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            str[--count[ch-'a']]=ch;
        }
        return new String(str);
    }
}