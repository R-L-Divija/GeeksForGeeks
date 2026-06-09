
class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String>p=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)p.add("FizzBuzz");
            else if(i%3==0)p.add("Fizz");
            else if(i%5==0)p.add("Buzz");
           
            else p.add(String.valueOf(i));
        }
        return p;
    }
}
