class Solution {
    public int findLength(int[] color, int[] radius) {

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for (int i = 0; i < color.length; i++) {

            if (!st1.isEmpty() &&
                st1.peek() == color[i] &&
                st2.peek() == radius[i]) {

                st1.pop();
                st2.pop();
            } 
            else {
                st1.push(color[i]);
                st2.push(radius[i]);
            }
        }

        return st1.size();
    }
}
