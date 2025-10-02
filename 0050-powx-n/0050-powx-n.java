class Solution {
    public static double fun(double x, long n) {
        if(n == 0) return 1.0;
        double half = fun(x, n/2);

        if(n%2 == 0){
            return half * half;
        }else{
            return half * half * x;
        }
    }
    public double myPow(double x, int n) {
        long N =n;
        if(N<0){
            return 1.0/fun(x,-N);
        }
        return fun(x,N);
    }
}