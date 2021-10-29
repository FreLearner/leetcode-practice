import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean reorderedPowerOf2(int n) {
        List<String> all = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            all.add(""+(int)Math.pow(2,i));
        }
        String input = ""+n;
        for (int i = 0; i < 31; i++) {
            if(all.get(i).length()==input.length()){
                if(isequal(all.get(i),input)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isequal(String a, String b){
        Map<Character,Integer> nums = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if(nums.containsKey(a.charAt(i))){
                nums.put(a.charAt(i),nums.get(a.charAt(i))+1);
            }
            else {
                nums.put(a.charAt(i),1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(nums.containsKey(b.charAt(i))){
                nums.put(b.charAt(i),nums.get(b.charAt(i))-1);
            }
            else {
                return false;
            }
        }
        for (int value:
             nums.values()) {
            if(value!=0){
                return false;
            }
        }
        return true;
    }
}
