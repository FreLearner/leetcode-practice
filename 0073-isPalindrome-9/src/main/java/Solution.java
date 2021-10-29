public class Solution {
    public boolean isPalindrome(int x) {
        String input = ""+x;
        int len = input.length();
        for (int i = 0; i < len/2 ; i++) {
            if(input.charAt(i)!=input.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
