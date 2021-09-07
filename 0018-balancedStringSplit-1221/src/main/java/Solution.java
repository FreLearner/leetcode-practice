public class Solution {
    public int balancedStringSplit(String s) {
        int slen = s.length();
        int countL = 0;
        int countR = 0;
        int res = 0;
        for (int i = 0; i < slen; i++) {
            if(s.charAt(i) == 'L'){
                countL++;
            }
            else {
                countR++;
            }
            if(countL == countR){
                countL = 0;
                countR = 0;
                res++;
            }
        }
        return res;
    }
}
