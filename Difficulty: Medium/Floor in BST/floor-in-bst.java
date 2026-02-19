class Solution {

    public static int floor(Node root, int x) {
        if(root == null) return -1;

        if(root.data == x)
            return root.data;

        if(root.data > x)
            return floor(root.left, x);

        int val = floor(root.right, x);

        if(val <= x && val != -1)
            return val;

        return root.data;
    }
}
