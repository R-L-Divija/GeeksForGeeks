class Solution {
    public ArrayList<Integer> constructList(int[][] q) {
        ArrayList<Integer>p=new ArrayList<>();
        int xor=0;
        for(int i=q.length-1;i>=0;i--){
            int l=q[i][0];
            int r=q[i][1];
            if(l==0){
               p.add(xor^r);
            }else if(l==1){
               xor^=r;
            }
        }
        p.add(xor);
        Collections.sort(p);
        return p;
    }
}