class Solution {
    public double average(int[] salary) {
        // first approach
        // Arrays.sort(salary);
        // int sum = 0;
        // for(int i=1; i<salary.length-1; i++){
        //     sum = sum+ salary[i];
        // }
        // return (double)sum/(salary.length-2);

        // second approach
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<salary.length; i++){
            mini = Math.min(mini,salary[i]);
            maxi = Math.max(maxi,salary[i]);
            sum = sum+salary[i];
        }
        sum = sum-mini-maxi;
        return (double) sum/(salary.length-2);
    }
}