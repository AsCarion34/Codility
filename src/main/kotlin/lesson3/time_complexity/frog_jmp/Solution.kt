package lesson3.time_complexity.frog_jmp

class Solution {
    // X + (D * N) >= Y 인 N 을 구한다.
    fun solution(X: Int, Y: Int, D: Int): Int {
        // Y - X <= (D * N)
        // (Y - X) / D <= N
        val quot = (Y - X) / D
        val remain = (Y - X) % D
        return if(remain == 0) quot else quot + 1
    }
}

/***
 * https://app.codility.com/demo/results/trainingEXH239-C83/
 */
