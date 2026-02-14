class Solution {
    public String reverseWords(String s) {
      String arr[]=s.split("\\s+");
      
      StringBuilder temp=new StringBuilder();
     
      for(int i=0;i<arr.length;i++){
          String rev1=new StringBuilder(arr[i]).reverse().toString();
          temp.append(rev1);
          if(i!=arr.length-1){
          temp.append(" ");
          }
      }
     
       return temp.toString().trim();
    }
}
