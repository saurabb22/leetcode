class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        // int mid = salary.length/2;
        // if(salary.length%2==0){
        //     int first = salary[mid];
        //     int sec = salary[mid-1];
        //     return (first+sec) /2.0;
        // }else{
        //     return (double)salary[mid];
        // }

        int sum = 0;
        for(int i=1; i<salary.length-1; i++){
            sum = sum+ salary[i];
        }
        return (double)sum/(salary.length-2);
    }
}