import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isSelfCrossing(int[] distance) {
        int dx ;
        int dy ;
        Set<String> buffer = new HashSet<>();
        buffer.add("0,0");
        int prex=0;
        int prey=0;
        for (int i = 0; i < distance.length; i++) {
            if(i%4==0){
                dx=0;
                dy=1;
            }
            else if(i%4==1){
                dx=-1;
                dy=0;
            }
            else if(i%4==2){
                dx=0;
                dy=-1;
            }
            else {
                dx=1;
                dy=0;
            }
            for (int j = 1; j <= distance[i]; j++) {
                prex = prex+dx;
                prey = prey+dy;
                String temp = prex+","+prey;
                if(buffer.contains(temp)){
                    return true;
                }
                else {
                    buffer.add(temp);
                }

            }
        }
        return false;
    }
}
