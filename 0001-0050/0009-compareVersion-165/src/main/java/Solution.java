public class Solution {
    public int compareVersion(String version1, String version2) {
        int p1 = 0;
        int p2 = 0;
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = version1.length();
        int len2 = version2.length();
        int i;
        for (i = 0; i < v1.length && i< v2.length; i++) {
            len1 = v1[i].length();
            len2 = v2[i].length();
            p1=0;
            p2=0;
            while (p1<len1 && "0".equals(""+v1[i].charAt(p1))){
                p1++;
            }
            while (p2<len2 && "0".equals(""+v2[i].charAt(p2))){
                p2++;
            }
            if((len1-p1)>(len2-p2)){
                return 1;
            }
            else if((len1-p1)<(len2-p2)){
                return -1;
            }
            while(p1<len1){
                if(v1[i].charAt(p1)<v2[i].charAt(p2)){
                    return -1;
                }
                else if (v1[i].charAt(p1)>v2[i].charAt(p2)){
                    return 1;
                }
                if(v1[i].charAt(p1)==v2[i].charAt(p2)){
                    p1++;
                    p2++;
                }
            }
        }
        while(i<v1.length){
            for (int j = 0; j < v1[i].length(); j++) {
                if(!".".equals(""+v1[i].charAt(j)) && !"0".equals(""+v1[i].charAt(j))){
                    return 1;
                }
            }
            i++;
        }
        while(i<v2.length){
            for (int j = 0; j < v2[i].length(); j++) {
                if(!".".equals(""+v2[i].charAt(j)) && !"0".equals(""+v2[i].charAt(j))){
                    return -1;
                }
            }
            i++;
        }
        return 0;
    }
}
