class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        //qery index storing
        int[][] map=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            map[i][0]=queries[i];
            map[i][1]=i;
        }
        Arrays.sort(map,Comparator.comparingInt(a->a[0]));
        
        int[] result=new int[queries.length];
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
       
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)-> {
            if(x[0]!=y[0]){
                return x[0]-y[0];
            }else return x[1]-y[1];
        } );
        int j=0;
        for(int i=0;i<queries.length;i++){
            int query=map[i][0];
            while(j<intervals.length&&intervals[j][0]<=query){
                int[] pqpush={intervals[j][1]-intervals[j][0]+1, intervals[j][1]};
                pq.offer(pqpush);
                j++;
            }
            while(!pq.isEmpty()&&pq.peek()[1]<query){
                pq.poll();
            }
            result[i]= pq.isEmpty()? -1:pq.peek()[0];
        }
        
       
            

        // give result correct indexing
        int[] finalres=new int[queries.length];
        int k=0;
        for(int i=0;i<map.length;i++){
            int index=map[i][1];
            finalres[index]=result[k++];
        }
        
        return finalres;
    }
}