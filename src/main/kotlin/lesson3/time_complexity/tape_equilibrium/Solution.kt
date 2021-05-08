package lesson3.time_complexity.tape_equilibrium

import kotlin.math.*

class Solution {
    // 주어진 배열 A 에서 각 index 까지의 sum 과 index 이후 값을의 sum 을 - 한 결과값 중 가장 작은 값을 반환..
    // 가장 작은 결과값을 저장하는 변수를 하나 두고 반환한다.
    // 각 배열을 순회해야 하는데. 효과적인 방안을 고민해보자.
    // 전체 값의 합을 구해놓고, 거기서 순회하는 인덱스의 값들을 빼주면 될 것 같은데?
    fun solution(A: IntArray): Int {
        var left = 0
        var right = A.sum()
        var result = Int.MAX_VALUE

        for (i in 1 until A.size) {
            left += A[i - 1]
            right -= A[i - 1]
            result = min(result, abs(left - right))
        }

        return result
    }
}
/*
똑같은 코드를 JAVA 로 하면 100% 인데 -_- 뭐지...
https://app.codility.com/demo/results/trainingUTSCPJ-D33/
JAVA
https://app.codility.com/demo/results/trainingUTQXPF-NVD/

100% 코드 -_-.
https://app.codility.com/demo/results/trainingGRFM5P-3RD/
 */
