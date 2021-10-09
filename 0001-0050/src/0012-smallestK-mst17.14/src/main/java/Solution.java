import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer>((a,b)->(a-b));
        int[] res = new int[k];
        for (int x:
             arr) {
            max.offer(x);
        }
        for (int i = 0; i < k; i++) {
            res[i] = max.poll();
        }
    return res;
    }
}