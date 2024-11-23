package PassingCarsProblem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// A non-empty array A consisting of N integers is given.
// The consecutive elements of array A represent consecutive cars on a road.
//
// Array A contains only 0s and/or 1s:
//
//        0 represents a car traveling east,
//        1 represents a car traveling west.
//
// The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N,
// is passing when P is traveling to the east and Q is traveling to the west.
//
// For example, consider array A such that:
//  A[0] = 0
//  A[1] = 1
//  A[2] = 0
//  A[3] = 1
//  A[4] = 1

public class Solution {

    public int solution(int[] A) {
        Map<Integer, Integer> map = IntStream.range(0, A.length)
                .collect(HashMap::new, (m, i) -> m.put(i, A[i]), HashMap::putAll);

        List<Integer> zeroKeys = map.entrySet()
                .stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getValue() == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int totalCount = 0;

        for (int key : zeroKeys) {
            totalCount += map.entrySet()
                    .stream()
                    .filter(entry -> entry.getKey() > key && entry.getValue() == 1)
                    .mapToInt(entry -> 1)
                    .sum();
        }

        if (totalCount > 1_000_000_000) {
            return -1;
        }

        return totalCount;
    }
}
