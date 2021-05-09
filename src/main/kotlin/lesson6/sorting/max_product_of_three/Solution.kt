package lesson6.sorting.max_product_of_three

import kotlin.math.max
import kotlin.math.min

class Solution {
    /***
     * 풀이
     * 주어진 배열 중 세개의 값의 곱이 가장 큰 수를 찾는다.
     */
    fun solution(A: IntArray): Int {
        /*
        // 풀이
        // 내림차순 정렬 후 앞의 세 값을 곱한 값을 반환한다.
        // 음수가 존재 할 경우 경우의 수가 존재한다.
        // 1) 모두 양수인 경우 : A[0] * A[1] * A[2]
        // 2) 모두 음수인 경우 : A[0] * A[N-1] * A[N-2]
        // 3) 양수 음수 혼합의 경우 : A[0] * A[1] * A[2]
         */
        return A.sortedArrayDescending().let { sortDesc ->
            val firstProduct = sortDesc[0]
            val positiveSub = sortDesc[1] * sortDesc[2]
            val negativeSub = sortDesc[sortDesc.size - 1] * sortDesc[sortDesc.size - 2]
            if(firstProduct < 0) min(positiveSub, negativeSub) * firstProduct else max(positiveSub, negativeSub) * firstProduct
        }
        /*
        // 결과
        // https://app.codility.com/demo/results/trainingZXZHC3-5ND/
         */
    }
}
