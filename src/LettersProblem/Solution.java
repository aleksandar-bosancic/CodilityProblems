package LettersProblem;

import java.util.Comparator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded
// by ones at both ends in the binary representation of N.
//
// For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
// The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
// The number 20 has binary representation 10100 and contains one binary gap of length 1.
// The number 15 has binary representation 1111 and has no binary gaps.
// The number 32 has binary representation 100000 and has no binary gaps.
class Solution {

    public int solution(int N) {
        // Implement your solution here
        String binaryString = Integer.toBinaryString(N);
        String regex = "(?<=1)0+(?=1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(binaryString);

        Set<String> set = matcher.results().map(matchResult -> matchResult.group()).collect(Collectors.toSet());
        return set.stream().max(Comparator.comparingInt(String::length)).map(String::length).orElse(0);
    }
}

