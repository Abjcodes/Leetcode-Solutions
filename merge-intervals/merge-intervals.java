class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        ArrayList<int[]> result= new ArrayList<>();
        int first = intervals[0][0];
        int last = intervals[0][1];
        for(int[] i: intervals)
        {
            if(i[0]<=last)
            {
                last = (i[1]>last) ? i[1] : last;
            }
            else
            {
                result.add(new int[]{first, last});
                first = i[0];
                last = i[1];
            }
            
        }
        result.add(new int[]{first, last});
        return result.toArray(new int[0][]);
    }
}