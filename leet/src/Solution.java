import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int longestUnivaluePath(TreeNode root) {
        if (root == null){
            return 0;
        }
        int a = longestUnivaluePath(root.left);
        int b = longestUnivaluePath(root.right);

        int leftlength = 0;
        int rightlength = 0;
        if(root.left != null){
            if (root.val == root.left.val){
                a = a + 1;
            }
        }

        if(root.right != null){
            if (root.val == root.right.val){
                b = b + 1;
            }
        }

        return Math.max(a,b);

        }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //int arg = nums[0];
        int sum = nums[0];
        int[] dp = new int [nums.length];
        dp[0] = nums[0];
        for(int b = 1;b < nums.length; b++){
            if(dp[b-1] + nums[b] > nums[b]) {
                dp[b] = dp[b-1] + nums[b];
            }else{
                dp[b] = nums[b];
            }
            if (sum < dp[b]) {
                sum = dp[b];
            }
        }
        return sum;

    }
    public static void main(String args[]){

    }

}