import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<String>> input = new ArrayList<>();
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        List<String> input3 = new ArrayList<>();
        input1.add("London");
        input1.add("New York");
        input2.add("New York");
        input2.add("Lima");
        input3.add("Lima");
        input3.add("Sao Paulo");
        input.add(input1);
        input.add(input2);
        input.add(input3);
        System.out.println(s.destCity(input));
    }
}
