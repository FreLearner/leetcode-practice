class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slen = s.length();
        if(slen==0 || slen==1){
            return slen;
        }
        if(slen==2){
            if(s.charAt(0) == s.charAt(1)){
                return 1;
            }
            return 2;
        }
        int first = 0;
        int last = 0;
        int current;
        int toAdd = 1;
        int maxCount = 1;
        while(toAdd<slen-1){
            current = first;
            toAdd = last+1;
            while (current<=last){
                if(s.charAt(current) == s.charAt(toAdd)){
                    if((last-first+1)>maxCount){
                        maxCount = last-first+1;
                    }
                    first=current+1;
                }
                current++;
            }
            last++;
        }
        if((last-first+1)>maxCount){
            maxCount = last-first+1;
        }
        return maxCount;
    }
}