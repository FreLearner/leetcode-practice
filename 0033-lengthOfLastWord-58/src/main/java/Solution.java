public class Solution {
    public int lengthOfLastWord(String s) {
    String[] res = s.split(" ");
    int resfinal = 0;
        for (String TEMP:
             res) {
            resfinal = TEMP.length();
        }
        return resfinal;
    }
}
