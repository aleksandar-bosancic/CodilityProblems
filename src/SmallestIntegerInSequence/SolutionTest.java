package SmallestIntegerInSequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test case 1:
        int[] input1 = {1, 3, 6, 4, 1, 2};
        int expected1 = 5;
        solution.solution(input1);
        Assertions.assertEquals(expected1, solution.solution(input1), "Test case 1 failed");
    }
  
}