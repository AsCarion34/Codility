package lesson9.maximum_slice_problem.max_profit

import kotlin.math.max

class Solution {
    /***
     * 분석
     * 각 날짜 별 주식의 가격인 배열 A[N] ( i : 날짜, value : 가격) 이 있을 때,
     * 배열 내에서 가장 저렴할 때 구매해서 가장 비싸게 팔 경우의 가격을 구하는 문제
     */
    /*
     * 풀이)
     * 다이나믹 프로그래밍 방식으로 접근한다.
     * 배열을 순회하면서 최대값을 저장해놓고 비교하면서 가장 차이가 큰 값을 찾는다.
     */
    fun solution(A: IntArray): Int {
        if(A.size < 2) {
            return 0
        }

        var min = A[0]
        var maxProfit = A[1] - A[0]
        for(i in A.indices) {
            if(A[i] < min) min = A[i] else maxProfit = max(maxProfit, A[i] - min)
        }

        return if(maxProfit <= 0) 0 else maxProfit
    }
    /*
     * 결과
     * https://app.codility.com/demo/results/training7UNP6Q-FJY/
     */
}
