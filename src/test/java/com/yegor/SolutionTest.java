package com.yegor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 09.06.2017.
 */
public class SolutionTest {
    @Test
    public void solution() throws Exception {
        Solution solution = new Solution();
        int[] a = {1,5,4,9,8,7,12,13,14}; // 6 - [1][5,4][9,8,7][12][13][14]
        int[] b = {4,3,2,6,1}; // 1 - [4,3,2,6,1]
        int[] c = {7,8,1,2,4,5,12,13,11}; // 2 - [7,8,1,2,4,5][12,13,11]
        int[] d = {4,3,8,6,2,1,12,16,14,15}; // 3 - [4,3,8,6,2,1][12][16,14,15]
        assertEquals(6, solution.solution(a));
        assertEquals(1, solution.solution(b));
        assertEquals(2, solution.solution(c));
        assertEquals(3, solution.solution(d));
    }

}