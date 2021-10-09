public class Solution {
    public boolean canWinNim(int n) {
        n=n-4;
        if(n%4==0){
            return false;
        }
        return true;
    }
}
