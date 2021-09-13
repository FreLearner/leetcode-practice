public class Main
{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] points = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};
        System.out.println(s.numberOfBoomerangs(points));
    }
}
