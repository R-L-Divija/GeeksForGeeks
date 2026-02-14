class Solution {
    int stockBuySell(int a[]) {


int s=0;
int last=a[0];
Stack<Integer>st=new Stack<>();

for(int i=0;i<a.length;i++){
    if(st.isEmpty()){
        st.push(a[i]);
    }else{
        if(last<=a[i]){
            last=a[i];
        }else{
            int t=st.pop();
            if(t<last){
            s+=last-t;
            }
            st.push(a[i]);
            last=a[i];
        }
    }
    
}
 int buy = st.pop();
        if (buy < last) {
            s += last - buy;
        }
   return s;     
    }
}
