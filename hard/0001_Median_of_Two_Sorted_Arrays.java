/*
🔹 Problem: Median of Two Sorted Arrays
🟠 Level: Hard

📝 Description:
Given two sorted arrays nums1 and nums2 of sizes m and n respectively, return the median of the two sorted arrays combined.  
The overall run time complexity should be O(log(m + n)).

🧠 Examples:
Input: nums1 = [1,3], nums2 = [2]  
Output: 2.00000  
Explanation: Merged array = [1,2,3]. Median is 2.

Input: nums1 = [1,2], nums2 = [3,4]  
Output: 2.50000  
Explanation: Merged array = [1,2,3,4]. Median is (2 + 3) / 2 = 2.5.

🔒 Constraints:
- nums1.length == m  
- nums2.length == n  
- 0 <= m <= 1000  
- 0 <= n <= 1000  
- 1 <= m + n <= 2000  
- -10^6 <= nums1[i], nums2[i] <= 10^6
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        for(int i = 0 ; i < nums1.length;i++){arr[i]=nums1[i];}
        int j = 0 ;
        for(int i = nums1.length ; i<arr.length;i++){
            
            arr[i]=nums2[j++];}
        Arrays.sort(arr);
        if(n%2 == 0){
	        return (arr[n/2 - 1] + arr[n/2]) / 2.0;
	    } else {
            return arr[n/2];
        }

    }
}
