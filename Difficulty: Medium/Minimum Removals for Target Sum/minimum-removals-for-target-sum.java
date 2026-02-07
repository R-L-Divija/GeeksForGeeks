class Solution {
    public int minRemovals(int[] arr, int k) {
        int t = 0;
        for (int x : arr) t+= x;

        int tar = t - k;

        if (tar < 0) return -1;
        if (tar == 0) return arr.length;

        int l = 0;
        int s = 0;
        int max = -1;

        for (int r = 0; r < arr.length; r++) {
            s += arr[r];
            while (s > tar) {
                s -= arr[l];
                l++;
            }
            if (s == tar) {
                max = Math.max(max, r - l + 1);
            }
        }
        if (max== -1) return -1;
        return arr.length - max;
    }
}
