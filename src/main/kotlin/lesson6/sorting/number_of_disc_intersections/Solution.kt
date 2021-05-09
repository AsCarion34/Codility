package lesson6.sorting.number_of_disc_intersections

import java.util.*


class Solution {
    /***
     * 풀이
     * 0 .. N-1 의 번호를 가진 Disc 가 N 개 있음
     * N 개의 양수로만 구성된 배열 A가 있으며, A[N] 은 디스크의 반경을 뜻한다.
     * ex) J 번쨰 디스크는 (J, 0) 와 반경 A[J] 로 그려진다...
     * J != K 이면 교차한다..
     * 배열 A 에 대한 교차하는 디스크의 수를 반환하고, 10,000,000 초과 시 -1 반환
     */
    fun solution(A: IntArray): Int {
        /* 풀이
        // 이해가 잘 안되서 구글링으로 좀 참고 했다... 역시 문제의 이해가 7~80% 는 먹고 들어가야 하는 것 같다.
        // 배열의 인덱스가 Disc 의 중심, 값이 반지름의 길이이다.
        // 즉, 중심을 기준으로 왼쪽 위치는 J - A[J], 오른쪽 위치는 J + A[J] 이다.
        // 각 Disc 의 left 와 right 를 기준으로 배열로 만든다.
         */
        val lefts = LongArray(A.size).also { longs ->
            A.indices.forEach { i -> longs[i] = i - A[i].toLong() }
        }.sortedArray()
        val rights = LongArray(A.size).also { longs ->
            A.indices.forEach { i -> longs[i] = i + A[i].toLong() }
        }.sortedArray()

        var intersectionCount = 0
        var idx = 0
        for (i in A.indices) {
            while (idx < A.size && rights[i] >= lefts[idx]) {
                intersectionCount += idx
                intersectionCount -= i
                idx++
            }
        }

        return if (intersectionCount > 10_000_000) -1 else intersectionCount
        /* 결과
        // https://app.codility.com/demo/results/training4FM7WQ-NEN/
         */
    }
}
