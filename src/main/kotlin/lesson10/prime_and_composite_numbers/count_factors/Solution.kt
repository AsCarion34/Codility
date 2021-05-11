package lesson10.prime_and_composite_numbers.count_factors

import kotlin.math.sqrt

class Solution {
    /***
     * 분석)
     * 주어진 양의 정수 N 에 대하여,
     * N 을 이루는 약수들의 갯수를 세는 문제
     */
    /*
     * 풀이)
     * ex) 9 : 1, 3, 9
     * N 의 약수는 1 부터 시작해서 나누어 떨어지는 숫자를 카운트 하는데, 모두 순회하면 분명 시간 복잡도에서 문제가 생긴다.
     * N 의 sqrt 값 (루트) 까지만 계산 후 * 2 하면 시간을 절반으로 줄일 수 있다.
     * 만약 루트값 자체의 제곱이 있는 경우도 있으므로 체크하여 +1 해야한다.
     */
    fun solution(N: Int): Int {
        var count = 0
        val root = sqrt(N.toDouble())
        for(i in 1..root.toInt()) {
            if(N % i == 0) {
                count += 2
            }
        }

        return if (root - root.toInt() == 0.0) count - 1 else count
    }
    /*
     * 결과)
     * https://app.codility.com/demo/results/trainingUWTEYU-9RW/
     */
}
