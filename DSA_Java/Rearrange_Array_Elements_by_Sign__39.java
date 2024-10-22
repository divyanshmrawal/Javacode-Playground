//QUESTION-->
//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

// Example 1:

// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Explanation:
// The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
// The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
// Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
// Example 2:

// Input: nums = [-1,1]
// Output: [1,-1]
// Explanation:
// 1 is the only positive integer and -1 the only negative integer in nums.
// So nums is rearranged to [1,-1].

//ANSWER-->
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List <Integer> list1=new ArrayList<>();
        List <Integer> list2=new ArrayList<>();

        for(int i:nums){
            if(i<0){
                list1.add(i);
            }
            else{
                list2.add(i);
            }
        }
        int x=Math.max(list1.size(),list2.size());
        int[] ans =new int[nums.length];
        int j=0;
        for(int i=0;i<x;i++){
             if(i<list2.size()){
                ans[j]=list2.get(i);
                j++;
            }
            if(i<list1.size()){
                ans[j]=list1.get(i);
                j++;
            }
        }
        return ans;
    }
}