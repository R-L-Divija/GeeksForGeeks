class Solution {
  public:
    int findMax(vector<Height>& arr) {
        int ans = 0;
        for(int i = 0 ;i<arr.size();i++){
            int value = arr[i].feet * 12 + arr[i].inches;
            ans = max(ans , value);
        }
        return ans;
    }
};