import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;
        Arrays.sort(people);
        int max = people.length-1;
        int res = 1;
        int min = 0;
        while (min <= max) {
            if(people[min]+people[max] <= limit){
                min++;
            }
            max--;
            res++;
        }
        System.out.println(res);
    }
}
