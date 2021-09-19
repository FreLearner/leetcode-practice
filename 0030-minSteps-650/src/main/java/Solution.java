public class Solution {
    public int minSteps(int n) {
        if(n==1){
            return 0;
        }
        int res = 0;
        while(true){
            if(myfind(n)==-1){
                break;
            }
            res = res + myfind(n);
            n = n/myfind(n);
        }
        res = res + n;
        return res;
    }

    public int myfind(int input){
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if(input%i==0){
                return i;
            }
        }
        return -1;
    }
}
