class Solution {

    static class Meeting{
        int start;
        int end;
        int pos;

        Meeting(int s,int e,int p){
            start=s;
            end=e;
            pos=p;
        }
    }

    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {

        ArrayList<Meeting> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            list.add(new Meeting(S[i],F[i],i+1));
        }

        Collections.sort(list,(a,b)->a.end-b.end);

        ArrayList<Integer> ans=new ArrayList<>();

        ans.add(list.get(0).pos);
        int lastEnd=list.get(0).end;

        for(int i=1;i<N;i++){
            if(list.get(i).start>lastEnd){
                ans.add(list.get(i).pos);
                lastEnd=list.get(i).end;
            }
        }

        Collections.sort(ans);
        return ans;
    }
}