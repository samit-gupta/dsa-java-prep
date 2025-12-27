/*
Problem: Maximum Subarray
Platform: LeetCode (53)
Description:
Given an integer array nums, find the contiguous subarray
(containing at least one number) which has the largest sum
and return its sum.

Approach: Kadane’s Algorithm
- Maintain two variables:
  1. currentSum → maximum subarray sum ending at current index
  2. maxSum → maximum subarray sum found so far
- At each index, decide whether to:
  a) start a new subarray from current element
  b) extend the previous subarray

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class MaximumSubarray {

    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max_sum=Math.max(sum,max_sum);
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
    }

    // Optional: main method for local testing
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // Output: 6
    }
}
