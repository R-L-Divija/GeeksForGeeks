// User function Template for Java

class Solution {
    // Function to find the difference between the maximum and minimum frequency of
    // elements.
    public int findDiff(int[] arr) {
        // code here
        int max = Arrays.stream(arr).max().getAsInt();
        int fre[]=new int[max+1];
        
        for(int x:arr){
            fre[x]++;
        }
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int i=0;i<fre.length;i++){
            if(fre[i]>0){
                m1=Math.max(m1,fre[i]);
                m2=Math.min(m2,fre[i]);
            }
        }
        
        return m1-m2;
    }
}