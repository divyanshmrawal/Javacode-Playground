//QUESTION-->
//Given an integer n, return true if it is a power of four. Otherwise, return false.
/* 
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true
*/

//ANSWER-->
class Solution {
    public boolean isPowerOfFour(int n) {
        // Base case: If n is 1, it is a power of four (4^0 = 1)
        if (n == 1) {
            return true;
        }

        // If n is less than or equal to 0 or not divisible by 4, return false
        if (n <= 0 || n % 4 != 0) {
            return false;
        }

        // Recursively check if n / 4 is a power of four
        return isPowerOfFour(n / 4);
    }
}

// Time Complexity:O(log n) (base 2)
// Space Complexity:O(log n)