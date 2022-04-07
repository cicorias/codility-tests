// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
package P002;
public class Solution {
    public int[] solution(int[] A, int K) {

        int holdout = -1;
        int bump = 1;

        for (int i = 0; i < K; i++) {
            for ( int y = A.length - 1; y > 0; y--){
                
                holdout = A[y];
                //p("holdout: " + holdout);
                if (y != 0) {
                    A[y] = A[y - 1];
                    A[y - 1] = holdout;
                }
                else 
                    A[y] = holdout;

            }
        }

        return A;
        // write your code in Java SE 11
    }


    void p(String msg){
        System.out.println(msg);
    }
    
}


