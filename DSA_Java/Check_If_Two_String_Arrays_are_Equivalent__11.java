//QUESTION-->
//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

// A string is represented by an array if the array elements concatenated in order forms the string.

//ANSWER-->
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1=new StringBuilder();
        StringBuilder st2=new StringBuilder();

        for(int i=0;i<word1.length;i++){
            st1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            st2.append(word2[i]);
        }

        return st1.toString().equals(st2.toString());
    }
}