public class Solution {
    public int[] constructRectangle(int area) {
    int init = (int)Math.sqrt(area);
    int[] res = new int[2];
    if(init*init==area){
        res[0] = init;
        res[1] = init;
        return res;
    }
    while (area%init!=0){
        init++;
    }
    res[0] = init;
    res[1] = area/init;
    if(res[0]<res[1]){
        res[0] = res[1];
        res[1] = init;
    }
    return res;
    }
}
