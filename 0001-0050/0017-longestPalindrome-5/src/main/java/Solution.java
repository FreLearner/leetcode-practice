public class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        int maxlen = 1;
        int len = 1;
        int head = 0;
        int j;
        for (int i = 1; i < s.length() ; i++) {
            len=1;
            for (j = 1; j <= i; j++) {
                if(i+j<s.length() && s.charAt(i+j) == s.charAt(i-j)){
                    len+=2;
                }
//                else if(i+j<=s.length() && s.charAt(i+j-1) == s.charAt(i-j)){
//                    len++;
//                }
                else {
                    break;
                }
            }
            if(len>maxlen){
                maxlen = len;
                head = i-j+1;
            }
            len=0;
            for (j = 1; j <= i; j++) {
                if(i+j<=s.length() && s.charAt(i+j-1) == s.charAt(i-j)){
                    len+=2;
                }
                else {
                    break;
                }
            }
            if(len>maxlen){
                maxlen = len;
                head = i-j+1;
            }
        }
        return s.substring(head,head+maxlen);
    }
}
