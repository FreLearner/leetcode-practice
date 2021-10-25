public class Solution {
    public boolean checkValidString(String s) {
        int left=-1;
        int star=-1;
        int[] stars= new int[s.length()];
        int[] ls= new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                left++;
                ls[left] = i;
            }
            else if(s.charAt(i)==')'){
                if(left>=0){
                    left--;
                }
                else if(star>=0){
                    star--;
                }
                else {
                    return false;
                }
            }
            else{
                star++;
                stars[star] = i;
            }
        }
        if(left==-1){
            return true;
        }
        else if(star>=left){
            for (int i = 0;i <=left; i++) {
                if(stars[star-i]<ls[left-i]){
                    return false;
                }
            }
                return true;
        }
        return false;
    }
}
