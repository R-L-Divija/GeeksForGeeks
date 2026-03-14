class Solution {
  public:
    vector<int> intersection(vector<int> &arr1, vector<int> &arr2) {
        // code here
        vector<int>ans;
        set<int>st;
        
        int i=0;
        int j=0;
        
        while(i<arr1.size() && j<arr2.size()) {
            
            if(arr1[i] == arr2[j]) {
                st.insert(arr1[i]);
                i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
         
      for(auto i : st) {
          ans.push_back(i);
      }
      
      return ans;
    }
};