import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        Solution s =new Solution();
        String input = "  -11839437777v";
//        System.out.println(s.myAtoi(input));
        repeat(10,n-> System.out.println("c"+(9-n)));
    }
    public static void repeat(int n, IntConsumer action){
        for (int i = 0; i <n ; i++) {
            action.accept(i);
        }
    }

}
