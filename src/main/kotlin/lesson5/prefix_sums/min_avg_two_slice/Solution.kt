package lesson5.prefix_sums.min_avg_two_slice

class Solution {
    /***
     * 풀이
     * 주어진 배열 A 의 원소들을 특정 indexFrom..indexTo 의 평균값들 중,
     * 가장 최소가 되는 평균 값을 반환하는 문제.
     * 즉... 최소 평균값을 구하는 문제로 보여진다.
     *
     * 이것 또한 일일히 처리하면 분명 시간복잡도에 걸릴 것이다.
     * 수학적으로 풀 수 있는 방안이 필요하다.
     * 이건.. 그냥.. 구글링해서 이해해보면서 처리하였다...
     * 평균의 성질... 2개, 3개인 경우만 고려하면 된다.
     * 평균의 값은 항상 대상 요소의 작은 수 보다 크기 때문.. (뭔말인지. 구글링..)
     *
     */
    fun solution(A: IntArray): Int {
        var minAvg = A.slice(0..1).average()
        var minIndex = 0
        for(i in 2 until A.size) {
            // 3개인 경우
            var avg = A.slice(i downTo i - 2).average()
            if(minAvg > avg) {
                minAvg = avg
                minIndex = i - 2
            }
            // 2개인 경우
            avg = A.slice(i downTo i - 1).average()
            if(minAvg > avg) {
                minAvg = avg
                minIndex = i - 1
            }
        }
        return minIndex
    }
    /* 결과
    // https://app.codility.com/demo/results/training29TY7Z-83M/
     */
}
