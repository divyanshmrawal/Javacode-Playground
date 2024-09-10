//QUESTION-->
//Given an integer array nums, handle multiple queries of the following type:

// Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
// Implement the NumArray class:

// NumArray(int[] nums) Initializes the object with the integer array nums.
// int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

//ANSWER-->
class NumArray {
    int[] nums;
        public NumArray(int[] nums) {
            this.nums=nums;
        }
        
        public int sumRange(int left, int right) {
            int sum=0;
            for(int i=left;i<=right;i++){
                sum+=nums[i];
            }
            return sum;
        }
    }