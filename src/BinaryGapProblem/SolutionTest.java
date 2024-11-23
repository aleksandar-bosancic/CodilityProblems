package BinaryGapProblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test case 1:
        String input1 = "ca";
        String input2 = "ab";
        int expected1 = 1;
        Assertions.assertEquals(expected1, solution.solution(input1, input2), "Test case 1 failed");

        // Test case 2:
        String input3 = "abc";
        String input4 = "bcd";
        int expected2 = 2;
        Assertions.assertEquals(expected2, solution.solution(input3, input4), "Test case 2 failed");

        // Test case 3:
        String input5 = "axxz";
        String input6 = "yzwy";
        int expected3 = 2;
        Assertions.assertEquals(expected3, solution.solution(input5, input6), "Test case 3 failed");

        // Test case 4:
        String input7 = "bacad";
        String input8 = "abada";
        int expected4 = 1;
        Assertions.assertEquals(expected4, solution.solution(input7, input8), "Test case 4 failed");

        // Test case 5:
        String input9 = "amz";
        String input10 = "amz";
        int expected5 = 3;
        Assertions.assertEquals(expected5, solution.solution(input9, input10), "Test case 5 failed");
    }
}