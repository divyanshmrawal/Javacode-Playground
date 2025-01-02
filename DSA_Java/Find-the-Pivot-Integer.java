//QUESTION-->
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
        int i=1,j=0,right=0;
        while(right!=j){
            for(j=i;j<=n;j++){
                j=j+i;
            }
            for(int k=i;k>=1;k--){
             right=right+k;
            }
            i++;
        }
        return i;
    }
}