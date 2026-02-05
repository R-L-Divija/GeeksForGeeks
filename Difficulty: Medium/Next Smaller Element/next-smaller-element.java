class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty())res.add(-1);
            else res.add(s.peek());
            s.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}