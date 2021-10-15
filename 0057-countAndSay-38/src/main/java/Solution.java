public class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        StringBuffer sb = new StringBuffer();
        sb.append("1");
        for (int i = 1; i < n; i++) {
            int len = sb.length();
            for (int j = 0; j < len; j++) {
                int count=1;
                while (j+1<len && sb.charAt(j)==sb.charAt(j+1)){
                    count++;
                    j++;
                }
                sb.append(count);
                sb.append(sb.charAt(j));
            }
            sb.delete(0,len);
        }
        return sb.toString();
    }
}
