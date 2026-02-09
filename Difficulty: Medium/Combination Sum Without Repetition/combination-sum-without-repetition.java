class Solution {
    ArrayList<ArrayList<Integer>> ans;
    ArrayList<Integer> temp;

    public void func(int index, int s, int t, int[] arr) {

        if (s == t) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (index == arr.length || s > t) {
            return;
        }

        // Take
        temp.add(arr[index]);
        func(index + 1, s + arr[index], t, arr);
        temp.remove(temp.size() - 1);

        // Skip duplicates
        int nextIndex = index + 1;
        while (nextIndex < arr.length && arr[nextIndex] == arr[index]) {
            nextIndex++;
        }

        // Not take
        func(nextIndex, s, t, arr);
    }

    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        Arrays.sort(arr);
        func(0, 0, target, arr);
        return ans;
    }
}
