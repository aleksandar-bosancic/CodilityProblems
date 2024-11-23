package BinaryGapProblem;

import java.util.HashSet;
import java.util.Set;

// We are given two strings P and Q, each consisting of N lowercase English letters. For each position in the strings,
// we have to choose one letter from either P or Q, in order to construct a new string S,
// such that the number of distinct letters in S is minimal.
// Our task is to find the number of distinct letters in the resulting string S.
//
// For example, if P = "ca" and Q = "ab", S can be equal to: "ca", "cb", "aa" or "ab".
// String "aa" has only one distinct letter ('a'), so the answer is 1 (which is minimal among those strings).
class Solution {

    public int solution(String P, String Q) {
        // Implement your solution here

        int n = P.length(); // Both P and Q have the same length
        int combinations = 1 << n;
        int min = Integer.MAX_VALUE;

        for (int mask = 0; mask < combinations; mask++) {
            Set<Character> set = new HashSet<>();
            for (int index = 0; index < n; index++) {
                if ((mask & (1 << index)) == 0) {
                    set.add(P.charAt(index));
                } else {
                    set.add(Q.charAt(index));
                }
            }

            min = Math.min(min, set.size());
        }


        // Return the size of the distinct letters set
        return min;
    }
}

