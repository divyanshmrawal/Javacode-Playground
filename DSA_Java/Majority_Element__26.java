// QUESTION-->
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// ANSWER->
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
         return nums[(n/2)];
    }
}
