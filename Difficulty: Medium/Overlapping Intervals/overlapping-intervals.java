class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]>res=new ArrayList<>();
        res.add(new int[]{arr[0][0],arr[0][1]});
        for(int i=1;i<arr.length;i++){
            int last[]=res.get(res.size()-1);
          
            if(arr[i][0]<=last[1]){
                last[1]=Math.max(last[1],arr[i][1]);
            }
          else{
                    res.add(new int[]{arr[i][0],arr[i][1]});
                }
            }
        
        return res;
    }
}