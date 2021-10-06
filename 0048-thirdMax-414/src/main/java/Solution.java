import java.util.TreeSet;

public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet res = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            if(res.size()<3){
                res.add(nums[i]);
            }
            else if(!res.contains(nums[i]) && nums[i]>(int)res.first()){
                res.pollFirst();
                res.add(nums[i]);
            }
        }
        if(res.size()<3){
            return (int)res.pollLast();
        }
        return (int)res.pollFirst();
    }

}
