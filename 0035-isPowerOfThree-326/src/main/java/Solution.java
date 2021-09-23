public class Solution {
    public boolean isPowerOfThree(int n) {
        int num = 3;
        if(n==1){
            return true;
        }
        if(n%3!=0 || n==0){
            return false;
        }
        while(Math.sqrt(n)==(int)Math.sqrt(n)){
            n = (int)Math.sqrt(n);
        }
        while (n/num!=0 && n == (n/num*num)){
            while(n/num!=0 && n == (n/num)*num){
                n = n/num;
                num = num*num;
            }
            num=3;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}
