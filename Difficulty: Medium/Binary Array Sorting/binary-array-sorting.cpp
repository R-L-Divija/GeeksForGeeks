class Solution {
  public:
    void binSort(vector<int> &arr) {
        // code here
        int n=arr.size();
int count_zero=0;
for(int i=0;i<n;i++)
{
    if(arr[i]==0)
    count_zero++;
}
int count_one=0;
for(int i=0;i<n;i++)
{
    if(arr[i]==1)
    count_one++;
}
int index=0;
while(index<count_zero)
{
    arr[index]=0;
    index++;
    
}
while(index<n)
{
    arr[index]=1;
    index++;
}
    }
};
