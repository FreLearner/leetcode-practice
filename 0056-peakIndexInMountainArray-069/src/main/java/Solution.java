public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
            int low =0;
            int high = arr.length-1;
            while (low<high){
                int mid = ((high-low+1)>>1)+low;
                if(arr[mid]>arr[mid-1]){
                    if(arr[mid]>arr[mid+1]){
                        return mid;
                    }
                    else {
                        low = mid;
                    }
                }
                else {
                    high = mid-1;
                }
            }
            return low;
    }
}
