class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
       ArrayList<ArrayList<Integer>>p=new ArrayList<>();
       Arrays.sort(arr);
       for(int i=0;i<arr.length-3;i++){
           if(i>0&& arr[i]==arr[i-1])continue;
           for(int j=i+1;j<arr.length-2;j++){
               if(j>i+1 && arr[j]==arr[j-1])continue;
               
               int l=j+1;
               int r=arr.length-1;
               
               while(l<r){
                   long t=(long)arr[i]+arr[j]+arr[l]+arr[r];
                   if(t<target)l++;
                   else if(t>target)r--;
                   else{
                      ArrayList<Integer>q=new ArrayList<>();
                      q.add(arr[i]);
                       q.add(arr[j]);
                        q.add(arr[l]);
                         q.add(arr[r]);
                         p.add(q);
                         l++;
                         r--;
                         while(l<r && arr[l]==arr[l-1])l++;
                         while(l<r && arr[r]==arr[r+1])r--;
                   }
               }
           }
       }
       return p;
        
    }
}