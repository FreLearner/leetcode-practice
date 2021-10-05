public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i = s.length()-1; i >-1 ; i--) {
            if(count==k){
                count=0;
                sb.insert(0,'-');
            }
            if(s.charAt(i)!='-'){
                count++;
                sb.insert(0,s.charAt(i));
            }
        }
        if(sb.length()>0&&sb.charAt(0)=='-'){
            return sb.substring(1).toString().toUpperCase();
        }
        return sb.toString().toUpperCase();
    }
}
