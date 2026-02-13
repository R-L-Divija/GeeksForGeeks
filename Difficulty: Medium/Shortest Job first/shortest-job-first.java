// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        int n=bt.length;
        Arrays.sort(bt);
        int s=0;
        int c=0;
        for(int i=0;i<n;i++){
            s+=c;
            c+=bt[i];
        }
    return (int)s/n;
    }
}
