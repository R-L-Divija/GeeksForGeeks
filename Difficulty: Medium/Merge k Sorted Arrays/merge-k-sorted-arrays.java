class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer>ans=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
            pq.offer(mat[i][j]);
           
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
    }
}