class Solution {
    public int maxPathSum(int[] a, int[] b) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                sum1 += a[i++];
            } else if (a[i] > b[j]) {
                sum2 += b[j++];
            } else {
                // common element found
                result += Math.max(sum1, sum2) + a[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // add remaining elements
        while (i < a.length) {
            sum1 += a[i++];
        }

        while (j < b.length) {
            sum2 += b[j++];
        }

        result += Math.max(sum1, sum2);

        return result;
    }
}