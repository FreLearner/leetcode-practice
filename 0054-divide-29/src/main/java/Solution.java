class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (divisor == dividend) {
            return 1;
        }
        if (divisor == Integer.MIN_VALUE) {
            return 0;
        }

        int sign = 1;

        if (dividend == Integer.MIN_VALUE) {
            sign *= -1;
            if (divisor < 0) {
                divisor = ~divisor + 1;
                sign *= -1;
            }
            return sign * cal_mv(Integer.MAX_VALUE, divisor, 0);
        }
        if (dividend < 0) {
            dividend = ~dividend + 1;
            sign *= -1;
        }
        if (divisor < 0) {
            divisor = ~divisor + 1;
            sign *= -1;
        }

        return sign * cal(dividend, divisor);
    }

    private int cal(int x, int y) {
        int count = 1;
        int prev_y = y;
        if (x < y) {
            return 0;
        }
        while (x - y >= y) {
            y <<= 1;
            count += count;
        }

        return count + cal(x - y, prev_y);
    }

    private int cal_mv(int x, int y, int floor) {
        int count = 1;
        int prev_y = y;
        if (x < y) {
            return 0;
        }
        while (x - y >= y) {
            y <<= 1;
            count += count;
        }

        if (floor == 0) {
            return count + cal_mv(x - y + 1, prev_y, floor + 1);
        }

        return count + cal_mv(x - y, prev_y, floor + 1);
    }
}