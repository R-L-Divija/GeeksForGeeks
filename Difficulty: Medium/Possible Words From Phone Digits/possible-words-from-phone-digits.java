class Solution {
    ArrayList<String>ans;
    StringBuilder temp;
    String[] arr1={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void func(int index,int[] arr){
        if(index==arr.length){
            ans.add(temp.toString());
            return;
        }
        //take & backtrack;
        String pc=arr1[arr[index]];
        
        for(int i=0;i<pc.length();i++){
            temp.append(pc.charAt(i));
            func(index+1,arr);
            temp.deleteCharAt(temp.length()-1);
        
        }
        if(pc.length()==0)func(index+1,arr);
    }
    public ArrayList<String> possibleWords(int[] arr) {
       ans=new ArrayList<>();
       temp=new StringBuilder();
       func(0,arr);
return ans;
    }
}