import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> dic = new HashMap<>();
        dic.put("I",1);
        dic.put("II",2);
        dic.put("IV",4);
        dic.put("V",5);
        dic.put("IX",9);
        dic.put("X",10);
        dic.put("XL",40);
        dic.put("L",50);
        dic.put("XC",90);
        dic.put("C",100);
        dic.put("CD",400);
        dic.put("D",500);
        dic.put("CM",900);
        dic.put("M",1000);
        int res=0;
        int i;
        for ( i = 0; i+1 < s.length();) {
            String temp = s.substring(i,i+2);
            if(dic.containsKey(temp)){
                res+=dic.get(temp);
                i = i+2;
            }
            else{
                res+=dic.get(s.charAt(i)+"");
                i++;
            }
        }
        if(i+1==s.length()){
            res+=dic.get(s.charAt(i)+"");
        }
        return res;
    }
}
