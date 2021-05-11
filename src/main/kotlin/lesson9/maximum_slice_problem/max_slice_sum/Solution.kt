package lesson9.maximum_slice_problem.max_slice_sum

import kotlin.math.max

class Solution {
    /***
     * 분석)
     * N 개의 배열 A 가 주어진다.
     * 인덱스 (P, Q) 에 대하여 0 <= P <= Q < N 인 부분 배열을 slice of array 라고 한다.
     * 가장 큰 slice (P, Q) 의 원소의 합을 구한다.
     */
    /*
     * 풀이)
     * 배열 A 의 부분배열을 어떻게 효과적으로 처리할 것인가?
     * 임의의 변수 sum 을 두고, 해당 변수에 max 처리 해야 할 것 같다.
     * 배열 인덱스는 뒤로만 가기 때문에... 순회 하면서 더한 값을 max 처리 한다.
     * 카데인 알고리즘을 이용하여 풀면 될 것 같다.
     * A[X] 의 부분합은 A[X - 1] 의 부분합 + A[X] 와 같다.
     */
    fun solution(A: IntArray): Int {
        var maxSliceSum = A[0]
        var localSliceSum = A[0]
        for(i in 1 until A.size) {
            localSliceSum = max(A[i], localSliceSum + A[i])
            maxSliceSum = max(maxSliceSum, localSliceSum)
        }
        return maxSliceSum
    }
    /*
     * 결과
     * https://app.codility.com/demo/results/trainingD529TN-Z2J/
     */
}
