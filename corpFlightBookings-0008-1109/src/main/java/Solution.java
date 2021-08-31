public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            for (int j = -1; j < bookings[i][1] - bookings[i][0]; j++) {
                res[bookings[i][0]+j]+=bookings[i][2];
            }
        }
    return res;
    }
}
