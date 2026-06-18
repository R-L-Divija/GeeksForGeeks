
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>>p=new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int t=arr[i]+arr[j]+arr[k];
                if(t<0)j++;
                else if(t>0)k--;
                else{
                    ArrayList<Integer>temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    
                    p.add(temp);
                    j++;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    
                }
            }
        }
        return p;
    }
}
