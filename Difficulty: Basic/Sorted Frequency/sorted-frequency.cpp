// User function Template for C++

class Solution {
  public:
    // Complete this function
    void freqSorted(vector<int>& arr) {
        // Your code here
           map<int,int> freq;
        
        for(int i=0;i<arr.size();i++){
            freq[arr[i]]++;
        }
        
        for(auto x : freq){
            cout<<x.first<<" "<<x.second<<endl;
        }
    }
};