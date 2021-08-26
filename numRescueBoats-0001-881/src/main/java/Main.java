import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] people = {6,3,5,6,2,3};
        int limit = 6;
        Arrays.sort(people);
        int plen = people.length;
        int seprate = (plen)/2;
        int res = (plen+1)/2;
        for (int i = seprate-1; i >= 0; i--) {
            if(people[i]+people[seprate]<=limit){
                seprate++;
            }
            else {
                res = res+1;
                seprate--;
            }
        }
        System.out.println(res);
    }
}
