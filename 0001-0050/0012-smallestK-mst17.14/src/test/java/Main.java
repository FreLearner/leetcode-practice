public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {1,3,5,7,2,4,6,8};
        int k = 4;
        int[] res = s.smallestK(input,k);
        for (int i = 0; i < k; i++) {
            System.out.println(res[i]);
        }
    }
}
