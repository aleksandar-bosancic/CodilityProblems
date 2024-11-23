package SmallestIntegerInSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(A).forEach(set::add);

        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }
        return smallest;
    }
}
