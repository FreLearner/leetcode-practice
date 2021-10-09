import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        String buffer = "";
        String spacebuffer;
        int mw = maxWidth;
        int head = 0;
        int end = 0;
        int space=0;
        int d1;
        int d2;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()<=maxWidth-space){
                maxWidth-=words[i].length();
                space++;
                end = i;
            }
            else if(space==1){
                for (int j = 0; j < maxWidth; j++) {
                    buffer+=" ";
                }
                res.add(words[head]+buffer);
                    head = i;
                    buffer = "";
                    maxWidth = mw;
                    i--;
                    space--;
            }
            else{
                space--;
                spacebuffer = "";
                d1 = maxWidth/space;
                for (int k = 0; k < d1; k++) {
                    spacebuffer +=" ";
                }
                d2 = maxWidth%space;
                for (int j = head; j <= end; j++) {
                    if(space>0){
                        space--;
                        if(d2>0){
                            buffer = new String(buffer+words[j]+spacebuffer+" ");
                            d2--;
                        }
                        else{
                            buffer = new String(buffer+words[j]+spacebuffer);
                        }

                    }
                    else {
                        buffer = new String(buffer+words[j]);
                    }
                }
                head = i;
                res.add(buffer);
                buffer = "";
                maxWidth = mw;
                i--;
            }

        }
        if(space>0){
            space--;
            if(space>0){
                buffer = words[head];
                for (int j = head+1; j <= end; j++) {
                        buffer = new String(buffer+" "+words[j]);
                    }
                }
            spacebuffer="";
            for (int i = 0; i < maxWidth-space; i++) {
                spacebuffer+=" ";
            }
            if(space==0){
                res.add(words[head]+spacebuffer);
            }
            else{
                res.add(buffer+spacebuffer);
            }
            }
        return res;
    }
}
