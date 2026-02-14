class Solution {
    public String findLargest(int[] arr) {
     
     String[] a=new String[arr.length];
     for(int i=0;i<arr.length;i++){
         a[i]=String.valueOf(arr[i]);
     }

Arrays.sort(a,(a1,b1)->(b1+a1).compareTo(a1+b1));
if(a[0].equals("0"))return "0";
StringBuilder temp=new StringBuilder();
for(int i=0;i<a.length;i++){
    temp.append(a[i]);
}
return temp.toString();
    }
}