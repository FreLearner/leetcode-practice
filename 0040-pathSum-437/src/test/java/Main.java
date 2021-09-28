public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input= {1,-2,-3,1,3,-2,-8888,-1};
        TreeNode[] trees = new TreeNode[input.length+1];
        int target = 8;
        int index = 0;
        trees[1] = new TreeNode(input[0]);
        for (int i = 1; 2*i <=input.length; i++) {
            if(input[2*i-1]!=-8888){
                trees[2*i] = new TreeNode(input[2*i-1]);
                trees[i].left = trees[2*i];
            }
            else {
                trees[i].left = null;
            }
            if(2*i+1<=input.length && input[2*i]!=-8888){
                trees[2*i+1] = new TreeNode(input[2*i]);
                trees[i].right = trees[2*i+1];
            }
            else {
                trees[i].right = null;
            }
        }
        System.out.println(s.pathSum(trees[1],target));
    }
}
