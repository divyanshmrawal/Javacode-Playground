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
