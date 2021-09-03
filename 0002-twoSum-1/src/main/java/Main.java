import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> hashmap= new HashMap<Integer,Integer>();
        int[] nums = {2,7,11,5};
        int target=9;
        for (int i = 0; i < nums.length; i++) {
            if(hashmap.containsKey(target-nums[i])){
                System.out.println(new int[]{hashmap.get(target - nums[i]), i});
            }
            hashmap.put(nums[i],i);
        }

    }
}
