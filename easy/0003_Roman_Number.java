/*
🔹 Problem: Roman to Integer
🟢 Level: Easy

📝 Description:
Roman numerals are represented by seven symbols: I, V, X, L, C, D, M.  
Normally, symbols are written largest to smallest from left to right, but there are cases where subtraction applies:  
- I before V and X to make 4 and 9  
- X before L and C to make 40 and 90  
- C before D and M to make 400 and 900  

Given a Roman numeral string s, convert it to its integer value.

🧠 Examples:
Input: s = "III"  
Output: 3  
Explanation: III = 3

Input: s = "LVIII"  
Output: 58  
Explanation: L = 50, V = 5, III = 3

Input: s = "MCMXCIV"  
Output: 1994  
Explanation: M = 1000, CM = 900, XC = 90, IV = 4

🔒 Constraints:
- 1 <= s.length <= 15  
- s contains only 'I', 'V', 'X', 'L', 'C', 'D', 'M'  
- s is guaranteed to be a valid Roman numeral in [1, 3999]
*/
class Solution {
    public int romanToInt(String s) {
       	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int total = 0;
        int curr = 0;
        int prev = 0;
        for(int i = s.length()-1 ; i>=0;i--){ 
            char c = s.charAt(i);
            curr = hm.get(c);
           if(curr<prev){
                total -= curr;
            }
            else{
                total +=curr;
            }
            prev = curr;
        }
        return total;
    }
}
