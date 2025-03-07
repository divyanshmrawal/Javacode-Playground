//QUESTION-->
//You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.
// Return true if the square is white, and false if the square is black.

// The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.


// Example 1:
// Input: coordinates = "a1"
// Output: false
// Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.

// Example 2:
// Input: coordinates = "h3"
// Output: true
// Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.

// Example 3:
// Input: coordinates = "c7"
// Output: false

//ANSWER-->


class Solution {
    public boolean squareIsWhite(String coordinates) {
        // Convert the column letter (e.g., 'a', 'b', etc.) to a number by subtracting 'a' and adding 1.
        // Similarly, the row (e.g., '1', '2', etc.) is converted to a number using the same logic.
        // Calculate the sum of the converted column and row values.
        // If the sum is odd, the square is white; otherwise, it's black.
        return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '1' + 1)) % 2 != 0;
    }
}
