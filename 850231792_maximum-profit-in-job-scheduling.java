id = 850231792 
lang = java 
runtime  = 13 ms 
memory = 50.7 MB
title_slug = maximum-profit-in-job-scheduling
code =

 class Solution {
    class Job{
        int start, end, profit;
        Job(int start, int end, int profit){
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        Job []jobs = new Job[n];
        for(int i=0; i<n; i++){
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        
        Arrays.sort(jobs, (a,b) -> (a.end-b.end));              // sorting based on end time
        
        int dp[] = new int[n];
        dp[0] = jobs[0].profit;
        
        for(int i = 1; i < n; i++){
            
            dp[i] = Math.max(dp[i-1], jobs[i].profit);
            for(int j = i-1; j >= 0; j--){
                if(jobs[j].end <= jobs[i].start){
                    dp[i] = Math.max(dp[i], jobs[i].profit + dp[j]);
                    break;
                }
            }
        }
        return dp[n-1];
    }
}