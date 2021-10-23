public class Solution {
    public int[] plusOne(int[] digits) {
    int c = 1;
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]+c>9){
                c = 1;
            }
            else {
                c=0;
                digits[i] = (digits[i]+1)%10;
                break;
            }
            digits[i] = (digits[i]+1)%10;
        }
        int[] res;
        if(c==1){
            res = new int[digits.length+1];
            res[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                res[i+1] = digits[i];
            }
        }
        else {
            res = digits;
        }
        return res;
    }
}
