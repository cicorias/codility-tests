package P002;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Tests {


    @Test
    void doSomething() {

        int[] expected = {8,3,4,5,6,7};

        Solution s = new Solution();

        int[] A = { 3,4,5,6,7,8};
        int K = 1;
        int[] actual = s.solution(A, K);

        assertArrayEquals(expected, actual);

    }
    
}
