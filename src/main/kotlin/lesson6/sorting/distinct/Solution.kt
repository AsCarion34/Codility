package lesson6.sorting.distinct

class Solution {
    /***
     * 풀이
     * 주어진 A 배열의 값들을 distinct 된 갯수를 반환한다.
     */
    fun solution(A: IntArray): Int {
        val distinctSet = mutableSetOf<Int>()
        for(i in A.indices) {
            distinctSet.add(A[i])
        }
        return distinctSet.size
        /*
        // 이전 풀이랑 뭐가 다를까..
        // https://app.codility.com/demo/results/trainingMZVT5A-D8D/
         */

        /* 방법 1
        // 시간복잡도에서 하나가 걸린다.
        // https://app.codility.com/demo/results/training2WFPAK-Z9M/
        return A.groupBy { it }.count()
        */
    }
}
