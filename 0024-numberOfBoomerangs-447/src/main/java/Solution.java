import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res=0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for (int j = 0; j < i; j++) {
                int d1 = getdistance(points[j],points[i]);
                if(map.containsKey(d1)){
                    map.put(d1,map.get(d1)+1);
                }
                else {
                    map.put(d1,1);
                }
            }
            for (int j = i+1; j < points.length; j++) {
                int d1 = getdistance(points[j],points[i]);
                if(map.containsKey(d1)){
                    map.put(d1,map.get(d1)+1);
                }
                else {
                    map.put(d1,1);
                }
            }
            for (int x:
                 map.values()) {
                res+=x*(x-1);
            }
        }
    return res;
    }
    public int getdistance(int[] p1, int[] p2){
        int dx = p1[0]-p2[0];
        int dy = p1[1]-p2[1];
        return (int)(Math.pow(dx,2) +Math.pow(dy,2));
    }

}
