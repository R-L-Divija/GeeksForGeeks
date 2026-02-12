import java.util.*;

class Solution {
    public ArrayList<Integer> jobSequencing(int[] d, int[] p) {

        ArrayList<Integer> ans = new ArrayList<>();
        int n = d.length;

        int[][] a = new int[n][2];
        int max = 0;

        for(int i = 0; i < n; i++){
            a[i][0] = d[i];
            a[i][1] = p[i];
            max = Math.max(max, d[i]);
        }

        Arrays.sort(a, (a1, b1) -> b1[1] - a1[1]);

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1; i <= max; i++){
            set.add(i);
        }

        int c = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){

            Integer slot = set.floor(a[i][0]);

            if(slot != null){
                set.remove(slot);
                c++;
                sum += a[i][1];
            }
        }

        ans.add(c);
        ans.add(sum);
        return ans;
    }
}
