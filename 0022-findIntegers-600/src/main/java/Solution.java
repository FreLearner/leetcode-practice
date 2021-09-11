import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int findIntegers(int n) {
        Set<Integer> set = new HashSet<>();
        int res = n+1;
        int temp;
        int temphead;
        for (int i = 0; i <= n; i++) {
            temphead = getfirst(i);
            temp = i ^ temphead;
            if(set.contains(temp)){
                set.add(i);
                res--;
            }
            else{
                if((temp & (temphead>>1))>0){
                    set.add(i);
                    res--;
                }
            }
        }
        return res;
    }
    public int getfirst(int n){
        int temp=1;
        while(n>0){
            n = n>>1;
            temp = temp<<1;
        }
        temp = temp>>1;
        return temp;
    }
}

