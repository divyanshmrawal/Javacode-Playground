//QUESTION-->
//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

//ANSWER-->
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
