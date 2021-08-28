class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        int arrlen = arr.length;
        int[][] table = new int[arrlen][arrlen];
        int i,j;
        for (i = 0; i < arrlen ; i++) {
            res+=arr[i];
            table[0][i] = arr[i];
        }
        for (i = 2; i < arrlen; i=i+2) {
            for(j=0;j<arrlen-i;j++){
                int tag = i-2;
                table[i][j] = table[tag][j]+table[0][tag+j+1]+table[0][tag+j+2];
                res+=table[i][j];
            }
        }
        return res;
    }
}