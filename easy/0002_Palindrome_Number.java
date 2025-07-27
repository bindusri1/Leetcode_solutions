/*
🔹 Problem: Palindrome Number
🟢 Level: Easy

📝 Description:
Given an integer x, return true if x is a palindrome (reads the same forward and backward), otherwise return false.

🧠 Examples:
Input: x = 121
Output: true
Explanation: 121 reads the same forwards and backwards.

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it reads 121-, which is not the same.

Input: x = 10
Output: false
Explanation: Reads 01 from right to left, which is different.

🔒 Constraints:
- -2^31 <= x <= 2^31 - 1
*/
class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        String s = Integer.toString(x);
        char[] a = s.toCharArray();
		for(int i = 0;i<a.length;i++){
		    if(a[i] == a[a.length-1-i]){
		        ans = true;
		    }
		    else{
		        ans=false;
		        break;
		    }
		}
		return ans;
        
    }
}
