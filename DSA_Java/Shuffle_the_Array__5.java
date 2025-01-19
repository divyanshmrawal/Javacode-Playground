//QUESTION-->
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].Return the array in the form [x1,y1,x2,y2,...,xn,yn].

//ANSWER-->
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
        ans[i*2]=nums[i];
        ans[i*2+1]=nums[n+i];
        }
        return ans;
    }
}
//Time Complexity:O(n)
//Space Complexity:O(1)
