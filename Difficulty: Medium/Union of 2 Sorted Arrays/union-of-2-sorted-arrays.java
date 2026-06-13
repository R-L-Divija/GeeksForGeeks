class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer>p=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
            if( p.isEmpty() ||p.get(p.size()-1)!=a[i])
                p.add(a[i]);
                i++;
        } 
                else if(a[i]>b[j]){
                if(p.isEmpty() || p.get(p.size()-1)!=b[j])
                    p.add(b[j]);
                    j++;
                }else{
                    if(p.isEmpty() || p.get(p.size()-1)!=a[i])
                    p.add(a[i]);
                    i++;
                    j++;
                }
        }
        while(i<a.length){
            if(p.isEmpty() ||(p.get(p.size()-1)!=a[i])){
            p.add(a[i]);}
            i++;
            
        }
         while(j<b.length){
             if(p.isEmpty() ||(p.get(p.size()-1)!=b[j])){
            p.add(b[j]);}
            j++;
             
        }
        return p;
    }
}
