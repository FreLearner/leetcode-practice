public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution s = new Solution();
        int[] res = s.runningSum(nums);
        for (int i:res) {
            System.out.println(i);
        }
    }
}
