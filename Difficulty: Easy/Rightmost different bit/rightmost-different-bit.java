class Solution {
    public static int posOfRightMostDiffBit(int m, int n) {
        int xor = m ^ n;

        if (xor == 0) return -1;

        int position = 1;

        while ((xor & 1) == 0) {
            xor = xor >> 1;
            position++;
        }

        return position;
    }
}