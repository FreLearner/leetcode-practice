public class Solution {
    public int countSegments(String s) {
        int res=0;
        if(s.length()==0){
            return 0;
        }
        for (int i = 0; i < s.length();i++) {
            if((s.charAt(i)!=' ')){
                res++;
                while(s.charAt(i)!=' '){
                    i++;
                    if(i>=s.length()){
                        break;
                    }
                }
            }
        }
        return res;
    }
}
