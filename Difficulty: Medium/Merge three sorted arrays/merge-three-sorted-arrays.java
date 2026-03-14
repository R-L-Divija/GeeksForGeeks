class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {

        int i = 0, j = 0, k = 0;
        int n1 = a.length, n2 = b.length, n3 = c.length;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i < n1 && j < n2 && k < n3) {

            if(a[i] <= b[j] && a[i] <= c[k]) {
                ans.add(a[i++]);
            }
            else if(b[j] <= a[i] && b[j] <= c[k]) {
                ans.add(b[j++]);
            }
            else {
                ans.add(c[k++]);
            }
        }

        while(i < n1 && j < n2) {
            if(a[i] <= b[j]) ans.add(a[i++]);
            else ans.add(b[j++]);
        }

        while(j < n2 && k < n3) {
            if(b[j] <= c[k]) ans.add(b[j++]);
            else ans.add(c[k++]);
        }

        while(i < n1 && k < n3) {
            if(a[i] <= c[k]) ans.add(a[i++]);
            else ans.add(c[k++]);
        }

        while(i < n1) ans.add(a[i++]);
        while(j < n2) ans.add(b[j++]);
        while(k < n3) ans.add(c[k++]);

        return ans;
    }
}