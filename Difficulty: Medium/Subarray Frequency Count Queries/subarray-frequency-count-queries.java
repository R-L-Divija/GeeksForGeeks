class Solution {
    public int up(ArrayList<Integer>map,int t){
        int l1=0;
        int r1=map.size();
       // Arrays.sort(arr,l,r); -->Instead of sort use Map
        while(l1<r1){
            int mid=l1+(r1-l1)/2;
            if(map.get(mid)<=t){
                l1=mid+1;
            }else{
                r1=mid;
            }
        }
        return l1;
    }
    public int low(ArrayList<Integer>map,int t){
        int l1=0;
        int r1=map.size();
       // Arrays.sort(arr,l,r); -->Instead of sort use Map
        while(l1<r1){
            int mid=l1+(r1-l1)/2;
            if(map.get(mid)<t){
                l1=mid+1;
            }else{
                r1=mid;
            }
        }
        return l1;
    }
    public ArrayList<Integer> freqInRange(int[] arr, int[][] q) {

    ArrayList<Integer> p = new ArrayList<>();
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    // Build map: value -> list of indices
    for(int i = 0; i < arr.length; i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i], new ArrayList<>());
        }
        map.get(arr[i]).add(i);
    }

    for(int[] x : q){

        int l = x[0];
        int r = x[1];
        int tar = x[2];

        if(!map.containsKey(tar)){
            p.add(0);
            continue;
        }

        ArrayList<Integer> pos = map.get(tar);

        int left = low(pos, l);
        int right = up(pos, r);

        p.add(right - left);
    }

    return p;
}
}