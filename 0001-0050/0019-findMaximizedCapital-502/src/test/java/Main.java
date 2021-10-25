public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int k = 1;
        int w = 2;
        int[] profits = {1,2,3};
        int[] capital = {1,1,2};
        System.out.println(s.findMaximizedCapital(k,w,profits,capital));
    }
}
