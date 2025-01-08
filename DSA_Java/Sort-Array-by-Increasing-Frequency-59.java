//QUESTION-->
//Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

// Return the sorted array.

 
// Example 1:
// Input: nums = [1,1,2,2,2,3]
// Output: [3,1,1,2,2,2]
// Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

// Example 2:
// Input: nums = [2,3,1,3,2]
// Output: [1,3,3,2,2]
// Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

// Example 3:
// Input: nums = [-1,1,-6,4,5,-6,1,4,1]
// Output: [5,-1,4,4,-6,-6,1,1,1]

//ANSWER-->
class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Calculate the frequency of each number in the nums array.
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert the nums array from int[] to Integer[].
        // This is necessary because custom comparators don't work with primitive int arrays.
        Integer[] temp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        // Step 3: Sort the Integer array using a custom comparator.
        // - If two numbers have the same frequency, sort them in descending order.
        // - Otherwise, sort by their frequency in ascending order.
        Arrays.sort(temp, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (freq.get(a).equals(freq.get(b))) {
                    return b - a; // Descending order if frequencies are equal.
                }
                return freq.get(a) - freq.get(b); // Ascending order by frequency.
            }
        });

        // Step 4: Copy the sorted elements back into the nums array.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        // Step 5: Return the sorted nums array.
        return nums;
    }
}

// Time Complexity:O(n logn)
//Space Complexity:O(n)