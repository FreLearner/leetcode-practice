import java.util.*;

public class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        ArrayList<pro_cap> list = new ArrayList<pro_cap>();
        int tag=0;
        int currentlen = profits.length;
        for (int i = 0; i < currentlen; i++) {
            list.add(new pro_cap(profits[i],capital[i]));
        }
        Collections.sort(list);
        while (k>0){
            for (int i=0;i<currentlen;++i) {
                pro_cap entry = list.get(i);
                if(w >= entry.cap){
                    w+= entry.pro;
                    k--;
                    list.remove(i);
                    currentlen--;
                    tag=1;
                    break;
                }
            }
            if(tag==0){
                break;
            }
            else {
                tag=0;
            }
        }
    return w;
    }
}
class pro_cap implements Comparable{
    int pro;
    int cap;

    public pro_cap(int pro, int cap) {
        this.pro = pro;
        this.cap = cap;
    }

    @Override
    public int compareTo(Object o) {
        pro_cap other = (pro_cap) o;
        if(other.pro>pro){
            return 1;
        }
        else if(other.pro==pro){
            return 0;
        }
        else
            return -1;
    }

}
