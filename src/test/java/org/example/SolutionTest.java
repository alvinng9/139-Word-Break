package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wordBreakTest() {
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(new String[]{"leet", "code"}));
        assertTrue(solution.wordBreak("leetcode", list));
        list = new ArrayList<>();
        list.addAll(Arrays.asList(new String[]{"apple","pen"}));
        assertTrue(solution.wordBreak("applepenapple", list));
        list = new ArrayList<>();
        list.addAll(Arrays.asList(new String[]{"cats","dog","sand","and","cat"}));
        assertFalse(solution.wordBreak("catsandog", list));
    }

}