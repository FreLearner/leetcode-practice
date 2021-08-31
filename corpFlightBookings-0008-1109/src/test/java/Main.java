public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int[] res = s.corpFlightBookings(bookings,5);
        for (int i:
             res) {
            System.out.println(i);

        }
    }
}
