// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int count = 0;
        int countMax = 0;
        boolean isFirst = true;
        while(N > 0)
        {
            if ( N % 2 == 0) {
                if (!isFirst) {
                    count = 0;
                }
                else {
                    count = 1;
                }
                isFirst = false;
            }
            //count = N % 2 == 0 ? count + 1 : 0;
            N /= 2;
            countMax = Math.max(count, countMax);
        }

        return countMax;
    }
}
