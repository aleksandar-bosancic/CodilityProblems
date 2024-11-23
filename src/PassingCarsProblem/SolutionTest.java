package PassingCarsProblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test case 1:
        int[] input1 = {0, 1, 0, 1, 1};
        int expected1 = 5;
        solution.solution(input1);
        Assertions.assertEquals(expected1, solution.solution(input1), "Test case 1 failed");
        
        // Test case 2:
        int[] input2 = {1, 0, 1, 0, 1};
        int expected2 = 3;
        solution.solution(input2);
        Assertions.assertEquals(expected2, solution.solution(input2), "Test case 1 failed");
    }
  
}