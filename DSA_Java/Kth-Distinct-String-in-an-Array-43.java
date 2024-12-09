//QUESTION-->
//A distinct string is a string that is present only once in an array.

// Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

// Note that the strings are considered in the order in which they appear in the array.

 

// Example 1:
// Input: arr = ["d","b","c","b","c","a"], k = 2
// Output: "a"
// Explanation:
// The only distinct strings in arr are "d" and "a".
// "d" appears 1st, so it is the 1st distinct string.
// "a" appears 2nd, so it is the 2nd distinct string.
// Since k == 2, "a" is returned. 

// Example 2:
// Input: arr = ["aaa","aa","a"], k = 1
// Output: "aaa"
// Explanation:
// All strings in arr are distinct, so the 1st sstring "aaa" is returned.

// Example 3:
// Input: arr = ["a","b","a"], k = 3
// Output: ""
// Explanation:
// The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".

//ANSWER-->

import java.util.HashSet;

class Solution {
    public String kthDistinct(String[] arr, int k) {

        // HashSet to store distinct elements
        HashSet <String> distinct = new HashSet<>();
        // HashSet to store elements that are duplicates
        HashSet <String> duplicate = new HashSet<>();

        // Loop through each element of the array
        for (String str : arr) {
            // If the element is already in 'distinct', it means it's a duplicate, 
            // so we move it to the 'duplicate' set and remove from 'distinct'
            if (distinct.contains(str)) {
                distinct.remove(str);
                duplicate.add(str);
            }
            // If the element is already in 'duplicate', we continue to the next element
            if (duplicate.contains(str)) {
                continue;
            } else {
                // If the element is not in either set, we add it to 'distinct'
                distinct.add(str);
            }
        }

        // Loop through the array again to find the kth distinct element
        for (String str : arr) {
            // If the element is in 'distinct', we decrement 'k'
            if (distinct.contains(str)) {
                k--;
            }
            // If 'k' becomes zero, it means we've found the kth distinct element, return it
            if (k == 0) {
                return str;
            }
        }

        // If we haven't found the kth distinct element, return an empty string
        return "";
    }
}
