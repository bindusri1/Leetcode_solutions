/*
🔹 Problem: Two Sum
🔗 Link: https://leetcode.com/problems/two-sum/
🟢 Level: Easy

📝 Description:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

🧠 Examples:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Input: nums = [3,2,4], target = 6
Output: [1,2]

🔒 Constraints:
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i], target <= 10^9
- Only one valid answer exists.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    sol[0]=i;
                    sol[1]=j;
                }
            }
        }
        return sol;

    }
}
