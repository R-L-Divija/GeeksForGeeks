class Solution {
    public int minJumps(int[] arr) {
        int i = 0;
        int c = 0;
        int n = arr.length;
        if(n <= 1) return 0;
        if(arr[0] == 0) return -1;
        while(i < n - 1) {
            if(arr[i] == 0) return -1;
            if(i + arr[i] >= n - 1) {
                c++;
                break;
            }
            int max = 0;
            int next = i;
            for(int j = i + 1; j <= i + arr[i] && j < n; j++) {
                if(j + arr[j] > max) {
                    max = j + arr[j];
                    next = j;
                }
            }
            i = next;  
            c++;
        }

        return c;
    }
}
