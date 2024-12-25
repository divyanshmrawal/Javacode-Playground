//QUESTION-->
//In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.

// As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.

 

// Example 1:

// Input: nums = [0,1,1,0]

// Output: [0,1]

// Explanation:

// The numbers 0 and 1 each appear twice in the array.

// Example 2:

// Input: nums = [0,3,2,1,3,2]

// Output: [2,3]

// Explanation:

// The numbers 2 and 3 each appear twice in the array.

// Example 3:

// Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]

// Output: [4,5]

// Explanation:

// The numbers 4 and 5 each appear twice in the array.

//ANSWER-->
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hash = new HashSet<>();

        // Find duplicate numbers
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                hash.add(nums[i]);
            }
        }

        // Convert HashSet to Integer[] using toArray
        Integer[] tempArray = hash.toArray(new Integer[0]);

        // Convert Integer[] to int[]
        int[] result = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            result[i] = tempArray[i];
        }

        return result;
    }
}

//Time Complexity:o(n)
//Space Complexity:o(n)