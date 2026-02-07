import java.util.*;

class Solution {
    public int countBalanced(String[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int s = 0;     
        int count = 0;
        map.put(0, 1);  
        for (String x : arr) {
            for (char y : x.toCharArray()) {
                if (Character.isLetter(y)) {
                    char l = Character.toLowerCase(y);

                    if ("aeiou".indexOf(l) != -1)
                        s++;
                    else
                        s--;
                }
            }
            count += map.getOrDefault(s, 0);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return count;
    }
}
