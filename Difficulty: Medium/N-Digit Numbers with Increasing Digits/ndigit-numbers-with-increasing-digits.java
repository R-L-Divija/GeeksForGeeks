class Solution {
    public static void func(int n,int i1,int i2,ArrayList<Integer>p){
        if(n==0){
            p.add(i2);
            return;
        }
        
        for(int j=i1+1;j<=9;j++){
            func(n-1,j,(i2*10)+j,p);
        }
        
        
    }
    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer>p=new ArrayList<>();
        if(n==1){
            for(int i=0;i<=9;i++){
                p.add(i);
            }
            return p;
        }
        if(n>9)return p;
        for(int i=1;i<=9;i++){
            func(n-1,i,i,p);
        }
        return p;
    }
}
