public class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        int res=0;
        res+=mypathSum(root,targetSum);
        if(root.left!=null){
            res+=pathSum(root.left,targetSum);
        }
        if(root.right!=null){
            res+=pathSum(root.right,targetSum);
        }
        return res;
    }
    public int mypathSum(TreeNode root, int targetSum) {
        int res = 0;
        if(root.val==targetSum) {
            res += 1;
        }
        if(root.left!=null){
                res+= mypathSum(root.left,targetSum-root.val);
            }
        if(root.right!=null){
                res+= mypathSum(root.right,targetSum-root.val);
            }
        return res;
    }
}
