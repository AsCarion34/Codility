package lesson9.maximum_slice_problem.max_double_slice_sum

import kotlin.math.max

class Solution {
    /***
     * 분석)
     * 주어진 N 개의 배열 A 에 대하여, 세 원소 X, Y, Z ( 0 <= X < X < Z < N) 를 Double Slice 라고 한다.
     * A[X + 1] + A[X + 2] + ... + A[Y - 1] + A[Y + 1] + A[Y + 2] + ... + A[Z - 1]
     * 즉, 주어진 X + 1 부터 Y - 1, Y + 1 부터 Z -1 까지의 원소의 합 중, 제일 큰 수를 구한다.
     */
    /*
     * 풀이)
     * X 부터 시작하는 배열과, Y 를 기준으로 Z 까지의 두개의 부분합을 구해서 합한다.
     * X (i : 1) 부터 각 index 까지 순회하면서 부분합의 결과를 저장
     * Z (i : N - 1) 부터 X (i : 1) 까지 부분합의 결과를 저장
     * 각 부분합의 최대 값을 찾는다.
     */
    fun solution(A: IntArray): Int {
        if(A.size == 3) return 0

        var maxDoubleSliceSum = 0
        val leftSliceSums = IntArray(A.size) { 0 }
        val rightSliceSums = IntArray(A.size) { 0 }
        // 1 부터 N-1 까지 순회하면서 모든 부분합을 구한다.
        //for(i in 1 until A.size - 1) {
        for(i in 1 until A.size) {
            leftSliceSums[i] = max(0, leftSliceSums[i - 1] + A[i])
        }
        // N-1 부터 1 까지 역으로 모든 부분합을 구한다.
        for(i in A.size - 2 downTo 1) {
            rightSliceSums[i] = max(0, rightSliceSums[i + 1] + A[i])
        }
        // 각 배열의 합이 최대인 것을 찾는다.
        for(i in 1 until A.size - 1) {
            maxDoubleSliceSum = max(maxDoubleSliceSum, leftSliceSums[i-1] + rightSliceSums[i+1])
        }

        return maxDoubleSliceSum
    }
    /* 결과
     * https://app.codility.com/demo/results/trainingJPJENR-TMY/
     */
}
