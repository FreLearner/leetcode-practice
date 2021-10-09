public class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int round=0;
        for (int i = 0; i < chalk.length; i++) {
            if(chalk[i]>k){
                return i;
            }
            else {
                round+=chalk[i];
                k=k-chalk[i];
            }
        }
        k = k % round;
        for (int i = 0; i < chalk.length; i++) {
            if(chalk[i]>k){
                return i;
            }
            else {
                k=k-chalk[i];
            }
        }
        return 0;
    }
}
