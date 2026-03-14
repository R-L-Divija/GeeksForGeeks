// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for (int i = arr.length - 1; i >= 2; i--) {
            int start = 0, end = i - 1;
            while (start < end) {
                if (arr[start] + arr[end] > arr[i]) {
                    count += (end - start);
                    end--;
                } else {
                    start++;
                }
            }
        }
        return count;
    }
}