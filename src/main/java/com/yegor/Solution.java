package com.yegor;

/**
 * Created by YegorKost on 09.06.2017.
 */
public class Solution {

    public int solution(int[] A) {
        int result = 0; // the number of groups
        int maxInGroup = A[0]; // the highest giraffe in the group
        int min = A[0]; // the smallest giraffe among remaining
        for (int i: A) {
            if (i < min) {
                min = i;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (i == A.length-1) { // closes the last group
                result++;
                break;
            }
            if (A[i] > maxInGroup) { //finds new highest giraffe in the group
                maxInGroup = A[i];
            }
            if (A[i] == min) { // finds new smallest giraffe among remaining
                min = A[i+1];
                for (int ii = i+1; ii < A.length; ii++) {
                    if (A[ii] < min) {
                        min = A[ii];
                    }
                }
            }
            if (maxInGroup < min) { // if highest giraffe in the group less than
                result++;           // smallest in remaining then the group closes
            }
        }
        return result;
    }

}
