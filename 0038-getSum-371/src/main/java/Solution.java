public class Solution {
    public int getSum(int a, int b) {
            int tag=1;
            if(a<0&&b<0){
                tag = -1;
                a*=-1;
                b*=-1;
            }
            int res1 = a | b;
            int res2 = a & b;
            int t1 = 1;
            int c = 0;
            int t2;
            while (t1<=res2){
                if((res1 & t1) !=0 && (res2 & t1) !=0){
                    if(c==0){
                        t2 = ~t1; //11111110
                        res1 = res1 & t2; //对应位清零
                    }
                    c=1;
                }
                else if((res1 & t1) !=0 || (res2 & t1) !=0){
                    if(c==1){
                        t2 = ~t1; //11111110
                        res1 = res1 & t2; //对应位清零
                        c=1;
                    }
                    else {
                        res1 = res1 | t1 ; //对应位置1
                        c=0;
                    }
                }
                else {
                    if (c==1){
                        res1 = res1 | t1 ; //对应位置1
                        c=0;
                    }
                }
                t1 =  t1<<1;
            }
            while(c==1){
                if((res1 & t1) !=0){
                    t2 = ~t1; //11111110
                    res1 = res1 & t2; //对应位清零
                    c=1;
                }
                else {
                    res1 = res1 | t1 ; //对应位置1
                    c=0;
                }
                t1 =  t1<<1;
            }
            return res1 *tag ;
    }
}
