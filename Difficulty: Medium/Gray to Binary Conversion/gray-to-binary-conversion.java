class Solution {
    public static int grayToBinary(int n) {
   int binary=n;
        while((n >>=1)!=0){
        
            binary^=n;
        }
        return binary;
    }
}
