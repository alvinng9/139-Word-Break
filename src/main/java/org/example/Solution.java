package org.example;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //create a dynamic programming array
        boolean[] result = new boolean[s.length() + 1];
        //make base case true
        result[0] = true;
        //iterate through the length of the given String
        for (int i = 0; i <= s.length(); i++) {
            //check if the previous word/base case has a match
            if (result[i]) {
                //iterate through the given word dictionary
                for (String word : wordDict) {
                    //check if the total length does not exceed the given String length
                    //check if the word from the word dictionary equals to the substring from
                    //the given string
                    if (i + word.length() <= s.length() && word.equals(s.substring(i, i + word.length()))) {
                        //if there is a match, mark the case as true
                        result[i + word.length()] = true;
                    }
                }
            }
        }
        //if there is a match at the end of the dynamic programming array, then the
        //given string can be segmented into space-separated sequence
        //of one or more dictionary words
        return result[s.length()];
    }
}
