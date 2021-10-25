public class Solution {
    public int findComplement(int num) {
        int res = num;
        int count = 0;
        while (num>0){
            count++;
            num = num>>1;
        }
        return (int)(Math.pow(2,count)-1-res);
    }
}
