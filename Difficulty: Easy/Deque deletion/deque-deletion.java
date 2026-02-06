class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        Deque<Integer>dq=new ArrayDeque<>();
        while(X-- >0){
            dq.addLast(deq.pollFirst());
        }
        deq.pollFirst();
        while(!dq.isEmpty()){
        deq.addFirst(dq.pollLast());
        }
        
    }
   public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {

    int size = deq.size();

    for (int i = 0; i < size; i++) {

        if (i >= start && i < end) {
            deq.pollFirst();
        } else {
            deq.addLast(deq.pollFirst());
        }
    }
}

    public static void eraseAll(ArrayDeque<Integer> deq) {
    deq.clear();
    }
}