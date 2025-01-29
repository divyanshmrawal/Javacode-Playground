//QUESTION->
//Given a positive integer n, find the pivot integer x such that:

// The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
// Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

 

// Example 1:

// Input: n = 8
// Output: 6
// Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.

//ANSWER-->
class Solution {
    public int pivotInteger(int n) {
        // Calculate the total sum of integers from 1 to n
        int totalSum = n * (n + 1) / 2;
        
        int leftSum = 0;
        
        for (int i = 1; i <= n; i++) {
            // Update leftSum by adding i
            leftSum += i;
            
            // Calculate the sum of integers from i to n
            int rightSum = totalSum - leftSum + i;
            
            // If leftSum equals rightSum, we've found the pivot
            if (leftSum == rightSum) {
                return i;
            }
        }
        
        // If no pivot found, return -1 (or an appropriate value)
        return -1;
    }
// }
// Time Complexity:O(n)
//  Space Complexity:O(1)
