import java.util.*;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,Integer> res = new HashMap<>();
        for (List<String> strs:
             paths) {
            if(res.get(strs.get(1))==null){
                res.put(strs.get(1),0);
            }
            res.put(strs.get(0),1);
        }
        Iterator<Map.Entry<String, Integer>> it = res.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            if(entry.getValue()==0){
                return entry.getKey();
            }
        }
        return null;
    }
}
