public class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int start=0;
        int tag = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                break;
            }
            start++;
        }
        if(start>=s.length()){
            return 0;
        }
        if(s.charAt(start)=='-'){
            tag = -1;
            start++;
        }
        else if(s.charAt(start)=='+'){
            start++;
        }
        for (int i = start; i < s.length(); i++) {
            if(s.charAt(i)>'9' || s.charAt(i)<'0'){
                return res*tag;
            }
            if(res>Integer.MAX_VALUE/10){
                if(tag==1){
                    return Integer.MAX_VALUE;
                }
                if(tag==-1){
                        return Integer.MIN_VALUE;
                }
            }
            if(res==Integer.MAX_VALUE/10 && (s.charAt(i)-'0')>=7){
                if(tag==1){
                    return Integer.MAX_VALUE;
                }
                if(tag==-1){
                    if((s.charAt(i)-'0')==7){
                        return Integer.MIN_VALUE+1;
                    }
                    else {
                        return Integer.MIN_VALUE;
                    }
                }
            }
            res = res*10+(s.charAt(i)-'0');
        }
        return res*tag;
    }
}
