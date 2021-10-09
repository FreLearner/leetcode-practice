public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totallen = nums1.length + nums2.length;
        int mid =  totallen /2;
        int res1;
        if(nums1.length==0){
            if(nums2.length %2 == 1)
                return nums2[mid];
            else{
                return (nums2[mid-1]+nums2[mid])/2.0;
            }
        }
        if(nums2.length==0){
            if(nums1.length %2 == 1)
                return nums1[mid];
            else{
                return (nums1[mid-1]+nums1[mid])/2.0;
            }
        }
        int point1 = 0;
        int point2 = 0;
        if(totallen % 2 ==1){
            while(point1< nums1.length && point2 < nums2.length && point1 + point2 < mid){
                if(nums1[point1]<nums2[point2]){
                    point1++;
                }
                else {
                    point2++;
                }
            }
            while(point1 + point2 < mid){
                if(point1< nums1.length){
                    point1++;
                }
                else {
                    point2++;
                }
            }
            if(point1< nums1.length && point2< nums2.length){
                if(nums1[point1]>nums2[point2]){
                    return nums2[point2];
                }
                else {
                    return nums1[point1];
                    }
                }
            else{
                if(point1 == nums1.length){
                        return nums2[point2];
                    }
                if(point2 == nums2.length){
                    return nums1[point1];
                    }
                }
            }
        else {
            while(point1< nums1.length && point2 < nums2.length && point1 + point2 < mid-1){
                if(nums1[point1]<nums2[point2]){
                    point1++;
                }
                else {
                    point2++;
                }
            }
            while(point1 + point2 < mid-1){
                if(point1< nums1.length){
                    point1++;
                }
                else {
                    point2++;
                }
            }
            if(point1< nums1.length && point2< nums2.length){
                if(nums1[point1]>nums2[point2]){
                        res1 = nums2[point2];
                        point2++;
                        if(point2<nums2.length && nums1[point1]>nums2[point2]){
                            return (res1+nums2[point2])/2.0;
                        }
                        return (res1+nums1[point1])/2.0;
                    }
                else {
                        res1 = nums1[point1];
                        point1++;
                        if(point1>=nums1.length||nums1[point1]>nums2[point2]){
                            return (res1+nums2[point2])/2.0;
                        }
                        return (res1+nums1[point1])/2.0;
                }
            }
            else{
                if(point1 == nums1.length){
                    return (nums2[point2]+nums2[point2+1])/2.0;
                }
                if(point2 == nums2.length){
                    return (nums1[point1]+nums1[point1+1])/2.0;
                }
            }
        }
       return 0;
    }
}
