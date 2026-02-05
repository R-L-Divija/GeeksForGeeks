class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty())res.add(-1);
            else res.add(s.peek());
            s.push(arr[i]);
        }
        return res;
    }
}