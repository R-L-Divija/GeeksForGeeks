class Solution {
    public void arrange(long[] arr) {
          int n = arr.length;

        // Encode both old and new values into arr[i]
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[(int)arr[i]] % n) * n;
        }

        // Extract only the new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}