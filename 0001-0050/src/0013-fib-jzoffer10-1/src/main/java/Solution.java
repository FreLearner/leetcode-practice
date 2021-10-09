public class Solution {
    public int fib(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        if(n==0){
            return res[0];
        }
        res[1] = 1;
        for (int i = 2; i < n+1; i++) {
            res[i] = (res[i-1] +res[i-2])%1000000007;
        }
        return res[n] ;
    }
}
