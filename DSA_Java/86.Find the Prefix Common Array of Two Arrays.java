//QUESTION-->
//You are given two 0-indexed integer permutations A and B of length n.
/* 
A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.

Return the prefix common array of A and B.

A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.

 

Example 1:

Input: A = [1,3,2,4], B = [3,1,2,4]
Output: [0,2,3,4]
Explanation: At i = 0: no number is common, so C[0] = 0.
At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
Example 2:

Input: A = [2,3,1], B = [3,1,2]
Output: [0,1,3]
Explanation: At i = 0: no number is common, so C[0] = 0.
At i = 1: only 3 is common in A and B, so C[1] = 1.
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
*/
//ANSWER-->

//onine-Approch
class Soludfdtion {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length; // Get the length of the input arrays
        int[] count = new int[n + 1]; // Array to keep track of occurrences of numbers (1-based indexing)
        int[] result = new int[n]; // Array to store prefix common counts
        int common = 0; // Variable to track the number of common elements

        // Iterate through the arrays
        for (int i = 0; i < n; i++) {
            count[A[i]]++; // Increment count for the number from array A
            if (count[A[i]] == 2) { // If it appears twice (once in A, once in B), it's common
                common++;
            }
            count[B[i]]++; // Increment count for the number from array B
            if (count[B[i]] == 2) { // If it appears twice, it's common
                common++;
            }
            result[i] = common; // Store the number of common elements found so far
        }
        return result; // Return the final common prefix array
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)

//my-Approch
import java.util.HashSet;

class df {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>(); // Set to store unique elements from A
        int[] result = new int[A.length]; // Result array to store prefix common counts
        int common = 0; // Variable to track the count of common elements

        // Iterate through both arrays
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]); // Add current element of A to the set
            common = 0; // Reset common count for the current prefix

            // Check how many elements from B[0] to B[i] are in the set
            for (int j = 0; j <= i; j++) {
                if (set.contains(B[j])) { // If B[j] exists in A's prefix
                    common++;
                }
            }
            result[i] = common; // Store the common count for the prefix
        }
        return result; // Return the final prefix common array
    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(n)