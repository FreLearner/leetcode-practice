public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int res;
        res = s.compareVersion("1.1","1.10");
        System.out.println(res);
        res = s.compareVersion("1.0","1.0.0");
        System.out.println(res);
        res = s.compareVersion("0.1","1.1");
        System.out.println(res);
        res = s.compareVersion("1.0.1","1");
        System.out.println(res);
        res = s.compareVersion("7.5.2.4","7.5.3");
        System.out.println(res);
    }
}
