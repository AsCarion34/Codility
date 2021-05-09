package lesson6.sorting.triangle

class Solution {
    /***
     * 분석
     * 주어진 배열 중, Triangle 이 될 수 있는 조합 (P, Q, R) 인 경우 1 을 반환한다.
     * Triangle 조건 : 두 값의 합이 다른 한 값보다 큰 경우.
     */
    fun solution(A: IntArray): Int {
        /* 풀이
        // 배열의 크기는 3 이상이어야 한다.
        // 주어진 배열을 정렬한다.
        // 정렬 된 경우, P + Q > R 이 만족하면, 나머지 경우의 수는 무조건 만족 된다.
        // 테스트 시, overflow 문제로 long 변환하여 처리 하여야 한다.
         */
        if(A.size < 3) {
            return 0
        }

        A.sortedArray().also { sortedArray ->
            for(i in 0 until sortedArray.size - 2) {
                if(sortedArray[i].toLong() + sortedArray[i + 1].toLong() > sortedArray[i + 2].toLong()) {
                    return 1
                }
            }
        }
        return 0
        /* 결과
        // https://app.codility.com/demo/results/trainingATFNS5-7RG/
         */
    }
}
