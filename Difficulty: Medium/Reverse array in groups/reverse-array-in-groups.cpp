class Solution {
  public:
    void reverseInGroups(vector<int> &arr, int k) {
        // code here
          // code here
        int n = arr.size();
        for(int i=0;i<n;i=i+k)
        {
            int s = i;
            int e = min(k+i-1,n-1);
            while(s<e)
            {
                swap(arr[s++],arr[e--]);
            }
        }
    }
};
