package lesson4.counting_elements.frog_river_one

class Solution {
    // 배열 A 의 값을 누적시키면서, X 에 도달할 수 있는 연속된 수가 누적되는 A의 인덱스를 찾는다.
    // 도달할 수 없는 경우 -1 리턴
    fun solution(X: Int, A:IntArray): Int {
        // Set 을 통하여 중복되지 않도록 처리해볼까?
        val pathSet = mutableSetOf<Int>()
        (A.indices).forEach { i ->
            if(A[i] <= X) {
                pathSet.add(A[i])
            }
            if(pathSet.size == X) {
                return i
            }
        }
        return -1
    }
}
/*
https://app.codility.com/demo/results/trainingZG3Z3W-VUV/
 */
