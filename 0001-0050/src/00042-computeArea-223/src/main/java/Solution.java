public class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        int lx = ax2 - ax1;
        int ly = ay2 - ay1;
        int rx = bx2 - bx1;
        int ry = by2 - by1;
        int xx = Math.min(bx2,ax2)-Math.max(ax1,bx1);
        int yy = Math.min(ay2,by2) - Math.max(ay1,by1);
        return lx*ly + rx*ry - Math.max(xx,0)*Math.max(yy,0);
    }
}
