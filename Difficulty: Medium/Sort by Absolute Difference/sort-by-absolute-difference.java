class Solution {
    class Node implements Comparable<Node>{
        int diff; int idx; int val;
        
        Node(int diff, int idx, int val){
            this.diff = diff;
            this.idx = idx;
            this.val = val;
        }
        
        @Override
        public int compareTo(Node n2){
            if(n2.diff == this.diff) return this.idx - n2.idx;
            else return this.diff - n2.diff;
        }
    }
    public void rearrange(int[] arr2, int x) {
        // code here
        int n = arr2.length;
        Node[] arr = new Node[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = new Node(Math.abs(arr2[i]-x),i,arr2[i]);
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++){
            arr2[i] = arr[i].val;
        }
    }
};
