import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "abpcplea";
        List<String> dic = new ArrayList<String>() ;
        String[] strs = {"ale","apple","monkey","plea"};
        for (String x:
             strs) {
            dic.add(x);
        }
        System.out.println(s.findLongestWord(input,dic));
    }
}
