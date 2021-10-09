public class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        String[] res = new String[numRows];
        String finalres = "";
        int index=1;
        int tag=1;
        for (int i = 0; i < numRows; i++) {
                res[i] = "";
        }
        res[0] = ""+s.charAt(0);
        numRows--;
        for (int i = 1; i < s.length(); i++) {
            res[index] = res[index]+s.charAt(i);
            if(i%numRows==0){
                tag = tag*(-1);
            }
                index = index + tag;
        }
        for (String t:
             res) {
                finalres = finalres + t;
        }
        return finalres;
    }
}
