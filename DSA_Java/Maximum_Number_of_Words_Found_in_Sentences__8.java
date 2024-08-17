//QUESTION-->
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

// You are given an array of strings sentences, where each sentences[i] represents a single sentence.

// Return the maximum number of words that appear in a single sentence.

//ANSWER-->
class Solution {
    public int mostWordsFound(String[] sentences) {
        int k=0;
        for(int i=0;i<sentences.length;i++){
            String[] str=sentences[i].split (" ");
            int n=str.length;
            if(n>k){
                k=n;
            }
        }
        return k;
    }
}