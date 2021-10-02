import java.util.ArrayList;
import java.util.List;

public class Solution{
        public String toHex(int num) {
            List<Integer> myres = new ArrayList<>();
            String res = "";
            int tag = 0;
            if(num==0){
                return "0";
            }
            if(num<0){
                tag=1;
                num = num*-1;
            }
                while(num>0){
                    int temp = num % 16 ;
                    myres.add(temp);
                    num = num/16;
                }
            if(tag==0){
                for (Integer mi:
                     myres) {
                    if(mi<10){
                        res = mi + res;
                    }
                   else {
                       res = (char)((mi-10)+'a')+res;
                    }
                }
                return res;
            }
           else {
                for (int i = 0; i < myres.size(); i++) {
                    myres.set(i, 15-myres.get(i));
                }
                for (int i = 0; i < myres.size(); i++) {
                    if(myres.get(i)<15){
                        myres.set(i, 1+myres.get(i));
                        break;
                    }
                    myres.set(i, 0);
                }
                for (Integer mi:
                        myres) {
                    if(mi<10){
                        res = mi + res;
                    }
                    else {
                        res = (char)((mi-10)+'a')+res;
                    }
                }
                int len = 8-res.length();
                for (int i = 0; i < len; i++) {
                    res = 'f'+res;
                }
                return res;
            }
        }
}
